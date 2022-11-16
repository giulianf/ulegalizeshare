package com.ulegalize.dto;

import lombok.Getter;

/**
 * The type Item long dto.
 */
public class ItemLongDto extends Item<Long> {
    /**
     * The Is default.
     */
    @Getter
    private String isDefault;

    /**
     * Instantiates a new Item long dto.
     */
    public ItemLongDto() {
        super(null, "");
    }

    /**
     * Instantiates a new Item long dto.
     *
     * @param value the value
     * @param label the label
     */
    public ItemLongDto(Long value, String label) {
        super(value, label);
    }

    /**
     * Instantiates a new Item long dto.
     *
     * @param value the value
     * @param label the label
     * @param extra the extra
     */
    public ItemLongDto(Long value, String label, String extra) {
        super(value, label);

        this.isDefault = extra;
    }

}
