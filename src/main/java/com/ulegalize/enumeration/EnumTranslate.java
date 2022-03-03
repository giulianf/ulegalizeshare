package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumTranslate {
    CHANNEL("channel", "Channel", "Channel", "Kanaal", "Channel"),
    M_001("with", "avec", "with", "met", "mit");

    @Getter
    private String name;
    @Getter
    private String labelFr;
    @Getter
    private String labelEn;
    @Getter
    private String labelNl;
    @Getter
    private String labelDe;

    EnumTranslate(String name, String labelFr, String labelEn, String labelNl, String labelDe) {
        this.name = name;
        this.labelFr = labelFr;
        this.labelEn = labelEn;
        this.labelNl = labelNl;
        this.labelDe = labelDe;
    }
}
