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
     * @param labelDossier the labelDossier
     * @param vcKey        the vc key
     * @return the dossier label
     */
    public static String getDossierLabel(String labelDossier, String nomenclature, String vcKey) {

        return getDossierLabelItem(labelDossier, nomenclature) + " - " + vcKey;
    }

    /**
     * Gets dossier label item.
     *
     * @param labelDossier the labelDossier
     * @return the dossier label item
     */
    public static String getDossierLabelItem(String labelDossier, String nomenclature) {

        return labelDossier.concat(nomenclature == null || nomenclature.isEmpty() ? "" : " (" + nomenclature + ")");
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
