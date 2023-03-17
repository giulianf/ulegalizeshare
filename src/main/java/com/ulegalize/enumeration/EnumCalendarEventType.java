package com.ulegalize.enumeration;

import lombok.Getter;

/**
 * The enum Enum calendar event type.
 */
public enum EnumCalendarEventType {
    /**
     * Rdv enum calendar event type.
     */
    RDV("RDV", "azure"),
    /**
     * Perm enum calendar event type.
     */
    PERM("PERM", "red"),
    /**
     * Record enum calendar event type.
     */
    RECORD("RECORD", "orange"),
    /**
     * Task enum calendar event type.
     */
    TASK("TASK", "orange"),
    /**
     * Aud enum calendar event type.
     */
    AUD("AUD", "green"),
    /**
     * Conclusion enum calendar event type.
     */
    CONCLU("CONCLU", "azure"),
    /**
     * Oth enum calendar event type.
     */
    OTH("OTH", "grey");

    /**
     * The Code.
     */
    @Getter
    private String code;
    /**
     * The Color.
     */
    @Getter
    private String color;

    /**
     * Instantiates a new Enum calendar event type.
     *
     * @param code  the code
     * @param color the color
     */
    EnumCalendarEventType(String code, String color) {
        this.code = code;
        this.color = color;
    }


    /**
     * From code enum calendar event type.
     *
     * @param code the code
     * @return the enum calendar event type
     */
    public static EnumCalendarEventType fromCode(String code) {
        for (EnumCalendarEventType enumCalendarEventType : values()) {
            if (enumCalendarEventType.getCode().equalsIgnoreCase(code))
                return enumCalendarEventType;
        }
        return null;
    }
}
