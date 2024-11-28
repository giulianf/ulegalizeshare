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
        String result = PrestationUtils.calculateTotalTime(Arrays.asList());

        // Assert
        assertEquals("00:00", result); // Should return "00:00" when the list is empty
    }

    @Test
    void calculateTotalTime_ShouldHandleExactHourMinutesConversion() {
        // Arrange
        ItemPrestation summary1 = new ItemPrestation(); // 2 hours 10 minutes
        summary1.setDh(BigDecimal.valueOf(1));
        summary1.setDm(BigDecimal.valueOf(70));

        List<ItemPrestation> summaries = Arrays.asList(summary1);

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

        List<ItemPrestation> summaries = Arrays.asList(summary1);

        // Act
        String result = PrestationUtils.calculateTotalTime(summaries);

        // Assert
        assertEquals("03:00", result); // Should return "03:00"
    }
}
