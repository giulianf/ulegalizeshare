package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumTitle {

    F("F"),
    L("L"),
    M("M"),
    A("A");

    @Getter
    private String idTitle;

    EnumTitle(String idTitle) {
        this.idTitle = idTitle;
    }


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
