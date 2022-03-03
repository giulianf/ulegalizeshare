package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumDossierType {
    BA("BA", "BAJ", "BAJ", "BLA", "BFRUR"),
    DC("DC", "Cabinet", "Kantoor", "Lawfirm", "Kabinett"),
    DF("DF", "Droit collaboratif", "Collaboratief recht", "Collaborative law", "Verbandsrechtlich"),
    MD("MD", "Médiation", "Bemiddeling", "Mediation", "Mediation");

    @Getter
    private String dossType;

    @Getter
    private String labelFr;
    @Getter
    private String labelNl;
    @Getter
    private String labelEn;
    @Getter
    private String labelDe;

    EnumDossierType(String dossType,
                    String labelFr,
                    String labelNl,
                    String labelEn,
                    String labelDe) {
        this.dossType = dossType;
        this.labelFr = labelFr;
        this.labelNl = labelNl;
        this.labelEn = labelEn;
        this.labelDe = labelDe;
    }

    public static EnumDossierType fromdossType(String dossType) {
        for (EnumDossierType enumDossierType : EnumDossierType.values()) {
            if (enumDossierType.getDossType().equalsIgnoreCase(dossType))
                return enumDossierType;
        }
        return null;
    }
}
