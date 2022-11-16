package com.ulegalize.dto;

/**
 * The type Item dto.
 */
public class ItemDto extends Item<Integer> {
    /**
     * Instantiates a new Item dto.
     */
    public ItemDto() {
        super(null, "");
    }

    /**
     * Instantiates a new Item dto.
     *
     * @param value the value
     * @param label the label
     */
    public ItemDto(Integer value, String label) {
        super(value, label);
    }

}
