package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumTType {
    SORTIE(1),
    ENTREE(2);

    @Getter
    private Integer idType;

    EnumTType(Integer id) {
        this.idType = id;
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
