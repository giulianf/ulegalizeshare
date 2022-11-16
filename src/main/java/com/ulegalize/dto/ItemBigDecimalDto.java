package com.ulegalize.dto;

import java.math.BigDecimal;

/**
 * The type Item big decimal dto.
 */
public class ItemBigDecimalDto extends Item<BigDecimal> {
    /**
     * Instantiates a new Item big decimal dto.
     */
    public ItemBigDecimalDto() {
        super(null, "");
    }

    /**
     * Instantiates a new Item big decimal dto.
     *
     * @param value the value
     * @param label the label
     */
    public ItemBigDecimalDto(BigDecimal value, String label) {
        super(value, label);
    }

}
