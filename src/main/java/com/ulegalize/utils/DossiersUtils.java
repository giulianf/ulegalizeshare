package com.ulegalize.utils;

import org.apache.commons.lang3.StringUtils;

public class DossiersUtils {

    private DossiersUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String getDossierLabel(String yearDossier, Long numDossier, String vcKey) {

        return getDossierLabelItem(yearDossier, numDossier) + " - " + vcKey;
    }

    public static String getDossierLabelItem(String yearDossier, Long numDossier) {

        return yearDossier + "/" + getDossierNum(numDossier);
    }

    public static String getDossierNum(Long numDossier) {

        return StringUtils.leftPad(numDossier.toString(), 4, "0");
    }


}
