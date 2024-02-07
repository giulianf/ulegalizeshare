package com.ulegalize.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The type Prestation utils.
 */
public class PrestationUtils {

    /**
     * Calculate vat big decimal.
     *
     * @param forfait     the forfait
     * @param minutes     the minutes
     * @param hours       the hours
     * @param couthoraire the couthoraire
     * @param forfaitHt   the forfait ht
     * @param vat         the vat
     * @return the big decimal
     */
    public static BigDecimal calculateVAT(boolean forfait, BigDecimal minutes, BigDecimal hours, BigDecimal couthoraire, BigDecimal forfaitHt, BigDecimal vat) {

        if (!forfait) {
            // ( (( (dh * 60) + dm ) / 60 ) * couthoraire ) * (1 + (vat / 100))
            return calculateHVAT(forfait, minutes, hours, couthoraire, forfaitHt).multiply(BigDecimal.ONE.add(vat.divide(BigDecimal.valueOf(100)))).setScale(2, RoundingMode.HALF_UP);
        } else {
            // forfait ht * (1 + (vat / 100))
            return calculateHVAT(forfait, minutes, hours, couthoraire, forfaitHt).multiply(BigDecimal.ONE.add(vat.divide(BigDecimal.valueOf(100)))).setScale(2, RoundingMode.HALF_UP);
        }
    }

    /**
     * Calculate hvat big decimal.
     *
     * @param forfait     the forfait
     * @param minutes     the minutes
     * @param hours       the hours
     * @param couthoraire the couthoraire
     * @param forfaitHt   the forfait ht
     * @return the big decimal
     */
    public static BigDecimal calculateHVAT(boolean forfait, BigDecimal minutes, BigDecimal hours, BigDecimal couthoraire, BigDecimal forfaitHt) {
        if (!forfait) {
            // (( (dh * 60) + dm ) / 60 ) * couthoraire
            BigDecimal result = ((hours.multiply(BigDecimal.valueOf(60))).add(minutes))
                    .divide(BigDecimal.valueOf(60L), 6, RoundingMode.HALF_EVEN)
                    .multiply(couthoraire);

// Set scale to 2 decimal places with HALF_UP rounding mode
            result = result.setScale(2, RoundingMode.HALF_UP);
            return result;
        } else {
            return forfaitHt;
        }
    }


}
