package com.ulegalize.enumeration;

public enum EnumTitle {
    F("F", "Madame"),
    L("L", "Mademoiselle"),
    M("M", "Monsieur");

    private String idTitle;
    private String title;

    EnumTitle(String idTitle, String title) {
        this.idTitle = idTitle;
        this.title = title;
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


    public String getIdTitle() {
        return idTitle;
    }

    public String getTitle() {
        return title;
    }
}
