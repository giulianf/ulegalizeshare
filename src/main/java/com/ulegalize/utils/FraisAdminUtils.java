package com.ulegalize.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import com.ulegalize.dto.template.ItemPrestation;

/**
 * The type Prestation utils.
 */
public class FraisAdminUtils {

    /**
     * Calculate VAT for administrative fees.
     *
     * HT = unit * pricePerUnit
     * TTC = HT * (1 + (vat/100))
     *
     * All results are rounded to 2 decimals using HALF_UP.
     * Null-safe: null inputs are treated as zero (except pricePerUnit null => 0).
     *
     * @param unit         number of units (e.g., quantity)
     * @param pricePerUnit price per unit (HT)
     * @param vat          VAT percentage (e.g., 21 for 21%)
     * @return TTC amount
     */
    public static BigDecimal calculateVAT(Integer unit, BigDecimal pricePerUnit, BigDecimal vat) {
        int u = unit != null ? unit : 0;
        BigDecimal ppu = pricePerUnit != null ? pricePerUnit : BigDecimal.ZERO;
        BigDecimal vatPct = vat != null ? vat : BigDecimal.ZERO;

        BigDecimal ht = calculateHVAT(u, ppu);
        BigDecimal factor = BigDecimal.ONE.add(vatPct.divide(BigDecimal.valueOf(100), 6, RoundingMode.HALF_UP));
        return ht.multiply(factor).setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * Calculate HT for administrative fees.
     *
     * HT = unit * pricePerUnit
     *
     * Result is rounded to 2 decimals using HALF_UP.
     * Null-safe: null inputs are treated as zero (except pricePerUnit null => 0).
     *
     * @param unit         number of units (e.g., quantity)
     * @param pricePerUnit price per unit (HT)
     * @return HT amount
     */
    public static BigDecimal calculateHVAT(Integer unit, BigDecimal pricePerUnit) {
        int u = unit != null ? unit : 0;
        BigDecimal ppu = pricePerUnit != null ? pricePerUnit : BigDecimal.ZERO;
        return ppu.multiply(BigDecimal.valueOf(u)).setScale(2, RoundingMode.HALF_UP);
    }

}
