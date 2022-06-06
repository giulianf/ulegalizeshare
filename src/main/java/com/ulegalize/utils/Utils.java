package com.ulegalize.utils;


import com.ulegalize.enumeration.EnumLanguage;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    private static final String regexPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
    private static final String PACKAGE_NAME = "com.ulegalize.international.Message";

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE);

    public static String getLabel(EnumLanguage language, String labelKey) {
        if (language != null) {
            Locale locale = new Locale(language.getShortCode());
            ResourceBundle res =
                    ResourceBundle.getBundle(PACKAGE_NAME, locale);
            return res.getString(labelKey);
        }

        return "";
    }

    public static boolean validateEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }
}
