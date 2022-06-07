package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumLanguage {
    FR("fr"),
    NL("nl"),
    EN("en"),
    DE("de");

    @Getter
    private String shortCode;

    EnumLanguage(String shortCode) {
        this.shortCode = shortCode;
    }

    public static EnumLanguage fromshortCode(String shortCode) {
        if (shortCode != null) {
            for (EnumLanguage language : EnumLanguage.values()) {
                if (language.getShortCode().equalsIgnoreCase(shortCode)) {
                    return language;
                }
            }
        }

        return EnumLanguage.EN;
    }
}
