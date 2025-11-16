package com.ulegalize.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FraisAdminUtilsTest {

    @Nested
    @DisplayName("calculateHVAT (HT)")
    class CalculateHVAT {
        @Test
        void basic_multiplication() {
            BigDecimal ht = FraisAdminUtils.calculateHVAT(3, new BigDecimal("12.50"));
            assertEquals(new BigDecimal("37.50"), ht);
        }

        @Test
        void zero_unit() {
            BigDecimal ht = FraisAdminUtils.calculateHVAT(0, new BigDecimal("99.99"));
            assertEquals(new BigDecimal("0.00"), ht);
        }

        @Test
        void null_unit_is_treated_as_zero() {
            BigDecimal ht = FraisAdminUtils.calculateHVAT(null, new BigDecimal("99.99"));
            assertEquals(new BigDecimal("0.00"), ht);
        }

        @Test
        void null_price_is_treated_as_zero() {
            BigDecimal ht = FraisAdminUtils.calculateHVAT(5, null);
            assertEquals(new BigDecimal("0.00"), ht);
        }

        @Test
        void rounding_half_up_down_cases() {
            // 0.333 -> 0.33 after HALF_UP to 2 decimals
            assertEquals(new BigDecimal("0.33"), FraisAdminUtils.calculateHVAT(1, new BigDecimal("0.333")));

            // 0.335 -> 0.34 after HALF_UP to 2 decimals
            assertEquals(new BigDecimal("0.34"), FraisAdminUtils.calculateHVAT(1, new BigDecimal("0.335")));
        }

        @Test
        void negative_values_supported_for_credit_notes() {
            BigDecimal ht = FraisAdminUtils.calculateHVAT(-2, new BigDecimal("15.00"));
            assertEquals(new BigDecimal("-30.00"), ht);
        }
    }

    @Nested
    @DisplayName("calculateVAT (TTC)")
    class CalculateVAT {
        @Test
        void example_from_spec() {
            BigDecimal ttc = FraisAdminUtils.calculateVAT(3, new BigDecimal("12.50"), new BigDecimal("21"));
            // 37.50 * 1.21 = 45.375 -> 45.38
            assertEquals(new BigDecimal("45.38"), ttc);
        }

        @Test
        void zero_vat_equals_ht() {
            BigDecimal ht = FraisAdminUtils.calculateHVAT(7, new BigDecimal("10.00"));
            BigDecimal ttc = FraisAdminUtils.calculateVAT(7, new BigDecimal("10.00"), BigDecimal.ZERO);
            assertEquals(ht, ttc);
        }

        @Test
        void null_vat_treated_as_zero() {
            BigDecimal ht = FraisAdminUtils.calculateHVAT(2, new BigDecimal("19.99"));
            BigDecimal ttc = FraisAdminUtils.calculateVAT(2, new BigDecimal("19.99"), null);
            assertEquals(ht, ttc);
        }

        @Test
        void decimal_vat_rate_5_5_percent() {
            BigDecimal ttc = FraisAdminUtils.calculateVAT(2, new BigDecimal("10.00"), new BigDecimal("5.5"));
            // HT 20.00 * 1.055 = 21.10
            assertEquals(new BigDecimal("21.10"), ttc);
        }

        @Test
        void tiny_amount_rounding() {
            BigDecimal ttc = FraisAdminUtils.calculateVAT(1, new BigDecimal("0.01"), new BigDecimal("21"));
            // 0.01 * 1.21 = 0.0121 -> 0.01
            assertEquals(new BigDecimal("0.01"), ttc);
        }

        @Test
        void negative_values_supported_for_credit_notes() {
            BigDecimal ttc = FraisAdminUtils.calculateVAT(-1, new BigDecimal("10.00"), new BigDecimal("21"));
            // -10.00 * 1.21 = -12.10
            assertEquals(new BigDecimal("-12.10"), ttc);
        }

        @Test
        void large_numbers() {
            BigDecimal ttc = FraisAdminUtils.calculateVAT(1000000, new BigDecimal("1234.56"), new BigDecimal("20"));
            // HT = 1,234,560,000.00 ; TTC = *1.2 = 1,481,472,000.00
            assertEquals(new BigDecimal("1481472000.00"), ttc);
        }
    }
}
