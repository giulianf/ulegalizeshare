package com.ulegalize.utils;


import com.ulegalize.enumeration.EnumLanguage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    private static String regexPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE);

    public static String getLabel(EnumLanguage language, String labelFr, String labelEn, String labelNl, String labelDe) {
        if (language != null) {

            switch (language) {

                case FR:
                    return labelFr;
                case NL:
                    return labelNl;
                case EN:
                    return labelEn;
                case DE:
                    return labelDe;
                default:
                    return labelFr;
            }
        }

        return "";
    }

    public static boolean validateEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }
}
