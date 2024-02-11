package com.ulegalize.enumeration;

import lombok.Getter;

/**
 * The enum Enum dossier type.
 */
public enum EnumDossierType {
    /**
     * Dc enum dossier type.
     */
    DC("DC"),
    /**
     * Conseil
     */
    CS("CS"),
    /**
     * Ba enum dossier type.
     */
    BA("BA"),
    /**
     * Df enum dossier type.
     */
    DF("DF"),
    /**
     * contentieux enum dossier type.
     */
    CONTENTIEUX("CT"),
    /**
     * formation enum dossier type.
     */
    FORMATION("FR"),
    /**
     * expertise enum dossier type.
     */
    EXPERTISE("EX"),
    /**
     * negociation
     */
    NEGOCIATION("NG"),
    /**
     * PRECONTENTIEUX
     */
    PRECONTENTIEUX("PC"),
    /**
     * Md enum dossier type.
     */
    MEDIATION("MD");

    /**
     * The Doss type.
     */
    @Getter
    private String dossType;

    /**
     * Instantiates a new Enum dossier type.
     *
     * @param dossType the doss type
     */
    EnumDossierType(String dossType) {
        this.dossType = dossType;
    }

    /**
     * Fromdoss type enum dossier type.
     *
     * @param dossType the doss type
     * @return the enum dossier type
     */
    public static EnumDossierType fromdossType(String dossType) {
        for (EnumDossierType enumDossierType : EnumDossierType.values()) {
            if (enumDossierType.getDossType().equalsIgnoreCase(dossType))
                return enumDossierType;
        }
        return null;
    }
}
