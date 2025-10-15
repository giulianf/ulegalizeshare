package com.ulegalize.utils;

import com.ulegalize.dto.template.ItemPrestation;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrestationUtilsTest {

    @Test
    void calculateVAT_notForfait() {
        BigDecimal forfait = new BigDecimal("33.33");
        BigDecimal forfaitttc = new BigDecimal("40.33");
        BigDecimal minutes = new BigDecimal("10");
        BigDecimal couthoraire = new BigDecimal("200");
        BigDecimal vat = new BigDecimal("21");
        // 33.3333 * 1.21
        BigDecimal calculateVAT = PrestationUtils.calculateVAT(false, minutes, BigDecimal.ZERO, couthoraire, forfait, vat);
        assertEquals(forfaitttc, calculateVAT);
    }
    @Test
    void calculateVAT1_Forfait() {
        BigDecimal forfait = new BigDecimal("5402.25");
        BigDecimal forfaitttc = new BigDecimal("6536.72");
        BigDecimal minutes = new BigDecimal("10");
        BigDecimal couthoraire = new BigDecimal("200");
        BigDecimal vat = new BigDecimal("21");
        // 33.3333 * 1.21
        BigDecimal calculateVAT = PrestationUtils.calculateVAT(true, minutes, BigDecimal.ZERO, couthoraire, forfait, vat);
        assertEquals(forfaitttc, calculateVAT);
    }

    @Test
    void calculateVAT_Forfait() {
        BigDecimal forfait = new BigDecimal("33.33");
        BigDecimal forfaitttc = new BigDecimal("40.33");
        BigDecimal vat = new BigDecimal("21");
        BigDecimal couthoraire = new BigDecimal("200");
        // 33.3333
        BigDecimal calculateHVAT = PrestationUtils.calculateVAT(true, new BigDecimal("10"), BigDecimal.ZERO, couthoraire, forfait, vat);
        assertEquals(forfaitttc, calculateHVAT);
    }

    @Test
    void calculateHVAT_notForfait() {
        BigDecimal forfait = new BigDecimal("33.33");
        BigDecimal minutes = new BigDecimal("10");
        BigDecimal couthoraire = new BigDecimal("200");
        // 200*(10/60) = 33.3333
        BigDecimal calculateHVAT = PrestationUtils.calculateHVAT(false, minutes, BigDecimal.ZERO, couthoraire, forfait);
        assertEquals(forfait, calculateHVAT);
    }

    @Test
    void calculateHVAT_forfait() {
        BigDecimal forfait = new BigDecimal("100");
        BigDecimal couthoraire = new BigDecimal("0");
        BigDecimal calculateHVAT = PrestationUtils.calculateHVAT(true, BigDecimal.ZERO, BigDecimal.ZERO, couthoraire, forfait);
        assertEquals(forfait, calculateHVAT);
    }

    @Test
    void calculateTotalTime_ShouldReturnCorrectTime_WhenGivenMultipleSummaries() {
        // Arrange
        ItemPrestation summary1 = new ItemPrestation(); // 2 hours 45 minutes
        summary1.setDh(BigDecimal.valueOf(2));
        summary1.setDm(BigDecimal.valueOf(45));

        ItemPrestation summary2 = new ItemPrestation(); // 1 hour 30 minutes
        summary2.setDh(BigDecimal.valueOf(1));
        summary2.setDm(BigDecimal.valueOf(30));

        ItemPrestation summary3 = new ItemPrestation(); // 1 hour 30 minutes
        summary3.setDh(BigDecimal.valueOf(0));
        summary3.setDm(BigDecimal.valueOf(90));

        List<ItemPrestation> summaries = Arrays.asList(summary1, summary2, summary3);

        // Act
        String result = PrestationUtils.calculateTotalTime(summaries);

        // Assert
        assertEquals("05:45", result); // 5 hours and 45 minutes
    }

    @Test
    void calculateTotalTime_ShouldHandleEmptyList() {
        // Act
        String result = PrestationUtils.calculateTotalTime(List.of());

        // Assert
        assertEquals("00:00", result); // Should return "00:00" when the list is empty
    }

    @Test
    void calculateTotalTime_ShouldHandleExactHourMinutesConversion() {
        // Arrange
        ItemPrestation summary1 = new ItemPrestation(); // 2 hours 10 minutes
        summary1.setDh(BigDecimal.valueOf(1));
        summary1.setDm(BigDecimal.valueOf(70));

        List<ItemPrestation> summaries = List.of(summary1);

        // Act
        String result = PrestationUtils.calculateTotalTime(summaries);

        // Assert
        assertEquals("02:10", result); // Should return "02:10"
    }

    @Test
    void calculateTotalTime_ShouldHandleMinutesConversion() {
        // Arrange
        ItemPrestation summary1 = new ItemPrestation(); // 3 hours
        summary1.setDh(BigDecimal.valueOf(1));
        summary1.setDm(BigDecimal.valueOf(120)); // 120 minutes equals 2 hours

        List<ItemPrestation> summaries = List.of(summary1);

        // Act
        String result = PrestationUtils.calculateTotalTime(summaries);

        // Assert
        assertEquals("03:00", result); // Should return "03:00"
    }

    @Test
    void calculateVAT_notForfait_withHours() {
        // Build non-forfait HT = 5402.25 using 580 minutes, adjustable hours and 175/hour, then apply 21% VAT => TTC 6536.72
        // 116.67
        BigDecimal minutes = new BigDecimal("40");
        // 1575
        BigDecimal hours = new BigDecimal("9");
        BigDecimal couthoraire = new BigDecimal("175");
        BigDecimal forfaitHt = BigDecimal.ZERO; // ignored when forfait is false
        BigDecimal vat = new BigDecimal("21");

        BigDecimal expected = new BigDecimal("2046.92");
        BigDecimal actual = PrestationUtils.calculateVAT(false, minutes, hours, couthoraire, forfaitHt, vat);
        assertEquals(expected, actual);
    }
    @Test
    void calculateVAT_map() {
        // Build the dataset as a list of entries like TTimesheet with required getters
        class TimesheetEntry {
            private final boolean forfait;
            private final BigDecimal dh;
            private final BigDecimal dm;
            private final BigDecimal couthoraire;
            private final BigDecimal forfaitHt;
            private final BigDecimal vat;
            TimesheetEntry(boolean forfait, int dh, int dm, BigDecimal couthoraire, BigDecimal forfaitHt, BigDecimal vat) {
                this.forfait = forfait;
                this.dh = BigDecimal.valueOf(dh);
                this.dm = BigDecimal.valueOf(dm);
                this.couthoraire = couthoraire;
                this.forfaitHt = forfaitHt;
                this.vat = vat;
            }
            public boolean getForfait() { return forfait; }
            public BigDecimal getDh() { return dh; }
            public BigDecimal getDm() { return dm; }
            public BigDecimal getCouthoraire() { return couthoraire; }
            public BigDecimal getForfaitHt() { return forfaitHt; }
            public BigDecimal getVat() { return vat; }
        }

        BigDecimal rate = new BigDecimal("175.00");
        BigDecimal vat = new BigDecimal("21.00");
        BigDecimal forfaitHt = new BigDecimal("0.00");

        List<TimesheetEntry> allPrestationInvoiced = Arrays.asList(
                new TimesheetEntry(false, 0, 5, rate, forfaitHt, vat),
                new TimesheetEntry(false, 0, 10, rate, forfaitHt, vat),
                new TimesheetEntry(false, 0, 10, rate, forfaitHt, vat),
                new TimesheetEntry(false, 0, 20, rate, forfaitHt, vat),
                new TimesheetEntry(false, 2, 40, rate, forfaitHt, vat),
                new TimesheetEntry(false, 2, 0, rate, forfaitHt, vat),
                new TimesheetEntry(false, 1, 45, rate, forfaitHt, vat),
                new TimesheetEntry(false, 0, 10, rate, forfaitHt, vat),
                new TimesheetEntry(false, 0, 3, rate, forfaitHt, vat),
                new TimesheetEntry(false, 0, 25, rate, forfaitHt, vat),
                new TimesheetEntry(false, 0, 3, rate, forfaitHt, vat),
                new TimesheetEntry(false, 1, 35, rate, forfaitHt, vat),
                new TimesheetEntry(false, 0, 14, rate, forfaitHt, vat)
        );

        BigDecimal sumPrestationInvoiced = allPrestationInvoiced.stream()
                .map(prestation -> PrestationUtils.calculateBultVAT(prestation.getForfait(), prestation.getDm(), prestation.getDh(), prestation.getCouthoraire(), prestation.getForfaitHt(), prestation.getVat()))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        // Expected total TTC computed per line with HALF_UP rounding at each step
        BigDecimal expected = new BigDecimal("2046.92");
        assertEquals(expected, sumPrestationInvoiced);
    }

    @Test
    void calculateBultVAT_notForfait_oneMinuteRounding() {
        BigDecimal minutes = new BigDecimal("1");
        BigDecimal hours = BigDecimal.ZERO;
        BigDecimal rate = new BigDecimal("175");
        BigDecimal vat = new BigDecimal("21");
        // hoursDecimal = 0.016667; HT ≈ 2.916725; TTC ≈ 3.52923725 -> 3.53
        BigDecimal expected = new BigDecimal("3.53");
        BigDecimal actual = PrestationUtils.calculateBultVAT(false, minutes, hours, rate, BigDecimal.ZERO, vat);
        assertEquals(expected, actual);
    }

    @Test
    void calculateBultVAT_notForfait_fiftyNineMinutes() {
        BigDecimal minutes = new BigDecimal("59");
        BigDecimal hours = BigDecimal.ZERO;
        BigDecimal rate = new BigDecimal("175");
        BigDecimal vat = new BigDecimal("21");
        // hoursDecimal = 0.983333; HT ≈ 172.083275; TTC ≈ 208.22076275 -> 208.22
        BigDecimal expected = new BigDecimal("208.22");
        BigDecimal actual = PrestationUtils.calculateBultVAT(false, minutes, hours, rate, BigDecimal.ZERO, vat);
        assertEquals(expected, actual);
    }

    @Test
    void calculateVAT_zeroVat_nonForfait() {
        BigDecimal minutes = BigDecimal.ZERO;
        BigDecimal hours = new BigDecimal("1");
        BigDecimal rate = new BigDecimal("100");
        BigDecimal vat = BigDecimal.ZERO;
        BigDecimal expected = new BigDecimal("100.00");
        BigDecimal actual = PrestationUtils.calculateVAT(false, minutes, hours, rate, BigDecimal.ZERO, vat);
        assertEquals(expected, actual);
    }

    @Test
    void calculateVAT_zeroVat_forfait() {
        BigDecimal forfaitHt = new BigDecimal("123.45");
        BigDecimal vat = BigDecimal.ZERO;
        BigDecimal expected = new BigDecimal("123.45");
        BigDecimal actual = PrestationUtils.calculateVAT(true, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, forfaitHt, vat);
        assertEquals(expected, actual);
    }

    @Test
    void calculateBultVAT_forfait_knownCase() {
        BigDecimal forfaitHt = new BigDecimal("5402.25");
        BigDecimal vat = new BigDecimal("21");
        BigDecimal expected = new BigDecimal("6536.72");
        BigDecimal actual = PrestationUtils.calculateBultVAT(true, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, forfaitHt, vat);
        assertEquals(expected, actual);
    }

    @Test
    void calculateVAT_vs_BultVAT_equivalence_nonForfait_simple() {
        BigDecimal hours = new BigDecimal("2");
        BigDecimal minutes = new BigDecimal("30");
        BigDecimal rate = new BigDecimal("80");
        BigDecimal vat = new BigDecimal("6");
        BigDecimal expected = new BigDecimal("212.00"); // 2.5 * 80 = 200; 200 * 1.06 = 212.00
        BigDecimal ttcVat = PrestationUtils.calculateVAT(false, minutes, hours, rate, BigDecimal.ZERO, vat);
        BigDecimal ttcBult = PrestationUtils.calculateBultVAT(false, minutes, hours, rate, BigDecimal.ZERO, vat);
        assertEquals(expected, ttcVat);
        assertEquals(expected, ttcBult);
    }

    @Test
    void calculateVAT_exactSixtyMinutes_equalsOneHour() {
        BigDecimal hours = BigDecimal.ZERO;
        BigDecimal minutes = new BigDecimal("60");
        BigDecimal rate = new BigDecimal("100");
        BigDecimal vat = new BigDecimal("21");
        BigDecimal expected = new BigDecimal("121.00");
        BigDecimal ttcVat = PrestationUtils.calculateVAT(false, minutes, hours, rate, BigDecimal.ZERO, vat);
        BigDecimal ttcBult = PrestationUtils.calculateBultVAT(false, minutes, hours, rate, BigDecimal.ZERO, vat);
        assertEquals(expected, ttcVat);
        assertEquals(expected, ttcBult);
    }

    @Test
    void calculateBultVAT_highPrecisionRate_tinyMinutes() {
        BigDecimal minutes = new BigDecimal("1");
        BigDecimal hours = BigDecimal.ZERO;
        BigDecimal rate = new BigDecimal("99.999");
        BigDecimal vat = new BigDecimal("20");
        // HT ≈ 1.666683333; TTC ≈ 2.0000199996 -> 2.00
        BigDecimal expected = new BigDecimal("2.00");
        BigDecimal actual = PrestationUtils.calculateBultVAT(false, minutes, hours, rate, BigDecimal.ZERO, vat);
        assertEquals(expected, actual);
    }
}
