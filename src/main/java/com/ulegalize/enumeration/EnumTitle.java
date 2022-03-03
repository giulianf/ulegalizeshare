package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumTitle {

    F("F", "Madame", "Mevrouw", "Madam", "Frau"),
    L("L", "Mademoiselle", "Juffrouw", "Miss", "Miss"),
    M("M", "Monsieur", "Mijnheer", "Sir", "Sir");

    @Getter
    private String idTitle;

    @Getter
    private String labelFr;
    @Getter
    private String labelNl;
    @Getter
    private String labelEn;
    @Getter
    private String labelDe;

    EnumTitle(String idTitle,
              String labelFr,
              String labelNl,
              String labelEn,
              String labelDe) {
        this.idTitle = idTitle;
        this.labelFr = labelFr;
        this.labelNl = labelNl;
        this.labelEn = labelEn;
        this.labelDe = labelDe;
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
