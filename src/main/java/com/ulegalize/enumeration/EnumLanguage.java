package com.ulegalize.enumeration;

import lombok.Getter;

/**
 * The enum Enum language.
 */
public enum EnumLanguage {
    /**
     * Fr enum language.
     */
    FR("fr"),
    /**
     * Nl enum language.
     */
    NL("nl"),
    /**
     * En enum language.
     */
    EN("en"),
    /**
     * De enum language.
     */
    DE("de");

    /**
     * The Short code.
     */
    @Getter
    private String shortCode;

    /**
     * Instantiates a new Enum language.
     *
     * @param shortCode the short code
     */
    EnumLanguage(String shortCode) {
        this.shortCode = shortCode;
    }

    /**
     * Fromshort code enum language.
     *
     * @param shortCode the short code
     * @return the enum language
     */
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
