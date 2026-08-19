package com.ulegalize.enumeration;

public enum InvoiceStatusProvider {
    billit,
    chorus;
    /**
     * From name drive type.
     *
     * @param name the name
     * @return the drive type
     */
    public static InvoiceStatusProvider fromName(String name) {
        for (InvoiceStatusProvider dprovideriveType : values()) {
            if (dprovideriveType.name().equalsIgnoreCase(name))
                return dprovideriveType;
        }
        return null;
    }
}
