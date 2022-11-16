package com.ulegalize.enumeration;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * The type 18 n.
 */
public final class I18n {
    /**
     * The constant bundle.
     */
    private static ResourceBundle bundle;

    /**
     * Instantiates a new 18 n.
     */
    private I18n() {
    }

    /**
     * Gets message.
     *
     * @param key the key
     * @return the message
     */
    public static String getMessage(String key) {
        if (bundle == null) {
            bundle = ResourceBundle.getBundle("path.to.i18n.messages");
        }
        return bundle.getString(key);
    }

    /**
     * Gets message.
     *
     * @param key       the key
     * @param arguments the arguments
     * @return the message
     */
    public static String getMessage(String key, Object... arguments) {
        return MessageFormat.format(getMessage(key), arguments);
    }
}