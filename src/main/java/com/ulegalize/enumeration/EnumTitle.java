package com.ulegalize.enumeration;

import lombok.Getter;

/**
 * The enum Enum title.
 */
public enum EnumTitle {

    /**
     * F enum title.
     */
    F("F"),
    /**
     * L enum title.
     */
    L("L"),
    /**
     * M enum title.
     */
    M("M"),
    /**
     * A enum title.
     */
    D("D"),
    /**
     * A enum title.
     */
    A("A");

    /**
     * The Id title.
     */
    @Getter
    private String idTitle;

    /**
     * Instantiates a new Enum title.
     *
     * @param idTitle the id title
     */
    EnumTitle(String idTitle) {
        this.idTitle = idTitle;
    }


    /**
     * From id enum title.
     *
     * @param id the id
     * @return the enum title
     */
    public static EnumTitle fromId(String id) {
        if (id != null && !id.isEmpty()) {
            for (EnumTitle enumTitle : values()) {
                if (enumTitle.getIdTitle().equalsIgnoreCase(id)) {
                    return enumTitle;
                }
            }
        }
        return null;
    }
}
