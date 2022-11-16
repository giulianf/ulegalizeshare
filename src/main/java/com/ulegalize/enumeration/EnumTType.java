package com.ulegalize.enumeration;

import lombok.Getter;

/**
 * The enum Enum t type.
 */
public enum EnumTType {
    /**
     * Sortie enum t type.
     */
    SORTIE(1),
    /**
     * Entree enum t type.
     */
    ENTREE(2);

    /**
     * The Id type.
     */
    @Getter
    private Integer idType;

    /**
     * Instantiates a new Enum t type.
     *
     * @param id the id
     */
    EnumTType(Integer id) {
        this.idType = id;
    }

    /**
     * From id enum t type.
     *
     * @param id the id
     * @return the enum t type
     */
    public static EnumTType fromId(Integer id) {
        for (EnumTType enumTType : values()) {
            if (enumTType.getIdType().equals(id)) {
                return enumTType;
            }
        }
        return null;
    }
}
