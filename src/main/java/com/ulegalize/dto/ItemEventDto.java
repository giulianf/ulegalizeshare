package com.ulegalize.dto;

import lombok.Getter;

/**
 * The type Item event dto.
 */
@Getter
public class ItemEventDto extends Item<String> {
    /**
     * The Color.
     */
    private String color;

    /**
     * Instantiates a new Item event dto.
     */
    public ItemEventDto() {
        super("", "");
    }

    /**
     * Instantiates a new Item event dto.
     *
     * @param value the value
     * @param label the label
     * @param color the color
     */
    public ItemEventDto(String value, String label, String color) {
        super(value, label);
        this.color = color;
    }
}
