package com.ulegalize.enumeration;

public enum EnumTranslate {
    CHANNEL("channel", "Channel", "Channel", "Kanaal"),
    M_001("with", "avec", "with", "met");

    private String name;
    private String labelFr;
    private String labelEn;
    private String labelNl;

    EnumTranslate(String name, String labelFr, String labelEn, String labelNl) {
        this.name = name;
        this.labelFr = labelFr;
        this.labelEn = labelEn;
        this.labelNl = labelNl;
    }

    public String getName() {
        return name;
    }

    public String getLabelFr() {
        return labelFr;
    }

    public String getLabelEn() {
        return labelEn;
    }

    public String getLabelNl() {
        return labelNl;
    }
}
