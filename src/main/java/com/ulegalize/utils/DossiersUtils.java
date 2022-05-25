package com.ulegalize.utils;

import org.apache.commons.lang3.StringUtils;

public class DossiersUtils {

    private DossiersUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String getDossierLabel(String nomenclature, String vcKey) {

        return getDossierLabelItem(nomenclature) + " - " + vcKey;
    }

    public static String getDossierLabelItem(String nomenclature) {

        return nomenclature;
    }

    public static String getDossierNum(Long numDossier) {

        return StringUtils.leftPad(numDossier.toString(), 4, "0");
    }


}
