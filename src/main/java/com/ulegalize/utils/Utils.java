package com.ulegalize.utils;


import com.ulegalize.enumeration.EnumLanguage;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The type Utils.
 */
public class Utils {
    /**
     * The constant regexPattern.
     */
    private static final String regexPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
    /**
     * The constant PACKAGE_NAME.
     */
    private static final String PACKAGE_NAME = "com.ulegalize.international.Message";

    /**
     * The constant VALID_EMAIL_ADDRESS_REGEX.
     */
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE);

    /**
     * Gets label.
     *
     * @param language    the language
     * @param labelKey    the label key
     * @param packageName the package name
     * @return the label
     */
    public static String getLabel(EnumLanguage language, String labelKey, String packageName) {
        if (language != null) {
            Locale locale = new Locale(language.getShortCode());
            ResourceBundle res =
                    ResourceBundle.getBundle(packageName == null || packageName.isEmpty() ? PACKAGE_NAME : packageName, locale);
            return res.getString(labelKey);
        }

        return "";
    }

    /**
     * Validate email boolean.
     *
     * @param email the email
     * @return the boolean
     */
    public static boolean validateEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }
}
