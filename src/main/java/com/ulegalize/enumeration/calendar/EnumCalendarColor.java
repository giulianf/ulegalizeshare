package com.ulegalize.enumeration.calendar;

/**
 * <a href="https://developers.google.com/apps-script/reference/calendar/event-color">...</a>
 */
public enum EnumCalendarColor {
    BLACK(1, "Black", "#000000"),
    PALE_BLUE(1, "Peacock", "#a4bdfc"),
    PALE_GREEN(2, "Sage", "#7AE7BF"),
    MAUVE(3, "Grape", "#BDADFF"),
    PALE_RED(4, "Flamingo", "#FF887C"),
    YELLOW(5, "Banana", "#FBD75B"),
    ORANGE(6, "Tangerine", "#FFB878"),
    CYAN(7, "Lavender", "#46D6DB"),
    GRAY(8, "Graphite", "#E1E1E1"),
    BLUE(9, "Blueberry", "#5484ED"),
    GREEN(10, "Basil", "#51B749"),
    RED(11, "Tomato", "#DC2127");

    private final int value;
    private final String calendarName;
    private final String htmlColor;

    EnumCalendarColor(int value, String calendarName, String htmlColor) {
        this.value = value;
        this.calendarName = calendarName;
        this.htmlColor = htmlColor;
    }

    public static EnumCalendarColor fromHtmlColor(String htmlColor) {
        for (EnumCalendarColor color : EnumCalendarColor.values()) {
            if (color.getHtmlColor().equalsIgnoreCase(htmlColor)) {
                return color;
            }
        }
        throw new IllegalArgumentException("No enum constant with HTML color " + htmlColor);
    }

    public static EnumCalendarColor fromValue(int value) {
        for (EnumCalendarColor color : EnumCalendarColor.values()) {
            if (color.getValue() == value) {
                return color;
            }
        }
        throw new IllegalArgumentException("No enum constant with value " + value);
    }

    public int getValue() {
        return value;
    }

    public String getCalendarName() {
        return calendarName;
    }

    public String getHtmlColor() {
        return htmlColor;
    }
}


