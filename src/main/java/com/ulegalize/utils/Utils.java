package com.ulegalize.utils;


import com.ulegalize.enumeration.EnumLanguage;

public class Utils {
    public static String getLabel(EnumLanguage language, String labelFr, String labelEn, String labelNl) {
        if (language != null) {

            switch (language) {

                case FR:
                    return labelFr;
                case NL:
                    return labelNl;
                case EN:
                    return labelEn;
                default:
                    return labelFr;
            }
        }

        return "";
    }
}
