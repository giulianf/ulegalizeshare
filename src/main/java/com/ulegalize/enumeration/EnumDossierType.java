package com.ulegalize.enumeration;

public enum EnumDossierType {
    BA("BA", "BAJ"),
    DC("DC", "Cabinet"),
    DROIT_COLLABORATIF("DF", "Droit collaboratif");

    private String dossType;
    private String typeDesc;

    EnumDossierType(String dossType, String typeDesc) {
        this.dossType = dossType;
        this.typeDesc = typeDesc;
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
}
