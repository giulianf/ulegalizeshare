package com.ulegalize.enumeration;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public final class I18n {
    private static ResourceBundle bundle;

    private I18n() {
    }

    public static String getMessage(String key) {
        if (bundle == null) {
            bundle = ResourceBundle.getBundle("path.to.i18n.messages");
        }
        return bundle.getString(key);
    }

    public static String getMessage(String key, Object... arguments) {
        return MessageFormat.format(getMessage(key), arguments);
    }
}