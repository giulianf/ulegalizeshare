package com.ulegalize.dto;

import java.io.Serializable;

/**
 * The type Item string dto.
 */
public class ItemStringDto extends Item<String> implements Serializable {
    /**
     * serial
     */
    private static final long serialVersionUID = 1L;
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
