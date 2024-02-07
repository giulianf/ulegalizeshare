package com.ulegalize.utils;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

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
}
