package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumDossierType {
    BA("BA"),
    DC("DC"),
    DF("DF"),
    MD("MD");

    @Getter
    private String dossType;

    EnumDossierType(String dossType) {
        this.dossType = dossType;
    }

    public static EnumDossierType fromdossType(String dossType) {
        for (EnumDossierType enumDossierType : EnumDossierType.values()) {
            if (enumDossierType.getDossType().equalsIgnoreCase(dossType))
                return enumDossierType;
        }
        return null;
    }
}
