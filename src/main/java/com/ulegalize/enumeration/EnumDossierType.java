package com.ulegalize.enumeration;

public enum EnumDossierType {
    BA("BA", "BAJ", "BAJ", "BLA"),
    DC("DC", "Cabinet", "Kantoor", "Lawfirm"),
    DROIT_COLLABORATIF("DF", "Droit collaboratif", "Collaboratief recht", "Collaborative law"),
    MEDIATION("MD", "Médiation", "Bemiddeling", "Mediation");

    private String dossType;

    private String labelFr;
    private String labelNl;
    private String labelEn;

    EnumDossierType(String dossType,
                    String labelFr,
                    String labelNl, String labelEn) {
        this.dossType = dossType;
        this.labelFr = labelFr;
        this.labelNl = labelNl;
        this.labelEn = labelEn;
    }

    public static EnumDossierType fromdossType(String dossType) {
        for (EnumDossierType enumDossierType : EnumDossierType.values()) {
            if (enumDossierType.getDossType().equalsIgnoreCase(dossType))
                return enumDossierType;
        }
        return null;
    }

    public String getDossType() {
        return dossType;
    }


    public String getLabelFr() {
        return labelFr;
    }

    public String getLabelNl() {
        return labelNl;
    }

    public String getLabelEn() {
        return labelEn;
    }
}
