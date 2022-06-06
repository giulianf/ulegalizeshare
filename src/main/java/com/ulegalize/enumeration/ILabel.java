package com.ulegalize.enumeration;

public interface ILabel {
    String getLabelFr();

    String getLabelNl();

    String getLabelEn();

    String getLabelDe();

    String applyLabel(String labelFr,
                      String labelNl,
                      String labelEn,
                      String labelDe);


}
