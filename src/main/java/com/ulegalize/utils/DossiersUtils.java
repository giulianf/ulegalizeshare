package com.ulegalize.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * The type Dossiers utils.
 */
public class DossiersUtils {

    /**
     * Instantiates a new Dossiers utils.
     */
    private DossiersUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Gets dossier label.
     *
     * @param nomenclature the nomenclature
     * @param vcKey        the vc key
     * @return the dossier label
     */
    public static String getDossierLabel(String nomenclature, String vcKey) {

        return getDossierLabelItem(nomenclature) + " - " + vcKey;
    }

    /**
     * Gets dossier label item.
     *
     * @param nomenclature the nomenclature
     * @return the dossier label item
     */
    public static String getDossierLabelItem(String nomenclature) {

        return nomenclature;
    }

    /**
     * Gets dossier num.
     *
     * @param numDossier the num dossier
     * @return the dossier num
     */
    public static String getDossierNum(Long numDossier) {

        return StringUtils.leftPad(numDossier.toString(), 4, "0");
    }

    public static String getMatiereRubrique(String matiere, String rubrique) {
        return rubrique == null || rubrique.isEmpty() ? matiere : matiere + " - " + rubrique;
    }



}
