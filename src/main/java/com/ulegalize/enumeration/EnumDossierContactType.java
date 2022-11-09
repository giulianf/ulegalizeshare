package com.ulegalize.enumeration;

public enum EnumDossierContactType {
    CLIENT(1),
    OPPOSING(2),
    PARTY(3),
    OPPONENT_COUNSIL(4),
    OTHER(5);

    private int id;

    EnumDossierContactType(int id) {
        this.id = id;
    }

    public static EnumDossierContactType fromId(int id) {
        for (EnumDossierContactType dossierContactType : values()) {
            if (dossierContactType.getId() == id)
                return dossierContactType;
        }
        return null;
    }

    public int getId() {
        return id;
    }

}
