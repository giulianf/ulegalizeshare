package com.ulegalize.dto;

import lombok.Getter;

/**
 * The type Item integer dto.
 */
public class ItemIntegerDto extends Item<Integer> {
    /**
     * The Is default.
     */
    @Getter
    private String isDefault;

    /**
     * Instantiates a new Item integer dto.
     */
    public ItemIntegerDto() {
        super(null, "");
    }

    /**
     * Instantiates a new Item integer dto.
     *
     * @param value the value
     * @param label the label
     */
    public ItemIntegerDto(Integer value, String label) {
        super(value, label);
    }

    /**
     * Instantiates a new Item integer dto.
     *
     * @param value the value
     * @param label the label
     * @param extra the extra
     */
    public ItemIntegerDto(Integer value, String label, String extra) {
        super(value, label);

        this.isDefault = extra;
    }

}
