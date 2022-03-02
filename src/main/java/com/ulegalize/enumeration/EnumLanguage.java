package com.ulegalize.enumeration;

public enum EnumLanguage {
    FR("fr"),
    NL("nl"),
    EN("en"),
    DE("de");

    private String shortCode;

    EnumLanguage(String shortCode) {
        this.shortCode = shortCode;
    }

    public static EnumLanguage fromshortCode(String shortCode) {
        for (EnumLanguage language : EnumLanguage.values()) {
            if (language.getShortCode().equalsIgnoreCase(shortCode)) {
                return language;
            }
        }

        return EnumLanguage.EN;
    }

    public String getShortCode() {
        return shortCode;
    }
}
