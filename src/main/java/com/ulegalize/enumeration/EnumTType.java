package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumTType {
    SORTIE(1, "Sortie", "Output", "Uitgang", "Ausgang"),
    ENTREE(2, "Entrée", "Entry", "Ingang", "Eingang");

    @Getter
    private Integer idType;
    @Getter
    private String descriptionFr;
    @Getter
    private String descriptionEn;
    @Getter
    private String descriptionNl;
    @Getter
    private String descriptionDe;

    EnumTType(Integer id, String descriptionFr, String descriptionEn, String descriptionNl, String descriptionDe) {
        this.idType = id;
        this.descriptionFr = descriptionFr;
        this.descriptionEn = descriptionEn;
        this.descriptionNl = descriptionNl;
        this.descriptionDe = descriptionDe;
    }

    public static EnumTType fromId(Integer id) {
        for (EnumTType enumTType : values()) {
            if (enumTType.getIdType().equals(id)) {
                return enumTType;
            }
        }
        return null;
    }
}
