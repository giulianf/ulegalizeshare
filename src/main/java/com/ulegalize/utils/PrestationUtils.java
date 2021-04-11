package com.ulegalize.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PrestationUtils {

    public static BigDecimal calculateVAT(boolean forfait, BigDecimal minutes, BigDecimal hours, Integer couthoraire, BigDecimal forfaitHt, BigDecimal vat) {

        if (!forfait) {
            // ( (( (dh * 60) + dm ) / 60 ) * couthoraire ) * (1 + (vat / 100))
            return calculateHVAT(forfait, minutes, hours, couthoraire, forfaitHt).multiply(BigDecimal.ONE.add(vat.divide(BigDecimal.valueOf(100)))).setScale(2, RoundingMode.HALF_UP);
        } else {
            // forfait ht * (1 + (vat / 100))
            return calculateHVAT(forfait, minutes, hours, couthoraire, forfaitHt).multiply(BigDecimal.ONE.add(vat.divide(BigDecimal.valueOf(100)))).setScale(2, RoundingMode.HALF_UP);
        }
    }

    public static BigDecimal calculateHVAT(boolean forfait, BigDecimal minutes, BigDecimal hours, Integer couthoraire, BigDecimal forfaitHt) {
        if (!forfait) {
            // (( (dh * 60) + dm ) / 60 ) * couthoraire
            return ((hours.multiply(BigDecimal.valueOf(60))).add(minutes)).divide(BigDecimal.valueOf(60), 4, RoundingMode.HALF_EVEN).multiply(BigDecimal.valueOf(couthoraire)).setScale(2, RoundingMode.HALF_UP);
        } else {
            return forfaitHt;
        }
    }


}
