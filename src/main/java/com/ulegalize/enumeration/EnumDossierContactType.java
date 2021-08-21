package com.ulegalize.enumeration;

public enum EnumDossierContactType {
    CLIENT(1),
    OPPOSING(2),
    PARTY(3);

    private int id;

    EnumDossierContactType(int id) {
        this.id = id;
    }

    public static EnumDossierContactType fromId(Long id) {
        for (EnumDossierContactType dossierContactType : values()) {
            if (dossierContactType.getId() == id)
                return dossierContactType;
        }
        return null;
    }

    public long getId() {
        return id;
    }
}
