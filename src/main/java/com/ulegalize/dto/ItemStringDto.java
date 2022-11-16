package com.ulegalize.dto;

/**
 * The type Item string dto.
 */
public class ItemStringDto extends Item<String> {
    /**
     * Instantiates a new Item string dto.
     */
    public ItemStringDto() {
        super("", "");
    }


    /**
     * Instantiates a new Item string dto.
     *
     * @param value the value
     * @param label the label
     */
    public ItemStringDto(String value, String label) {
        super(value, label);
    }
}
