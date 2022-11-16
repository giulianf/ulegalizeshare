package com.ulegalize.dto;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * The type Item vat dto.
 */
public class ItemVatDTO extends ItemBigDecimalDto {
    /**
     * The Is default.
     */
    @Getter
    private Boolean isDefault;

    /**
     * Instantiates a new Item vat dto.
     */
    public ItemVatDTO() {
        super(null, "");
    }

    /**
     * Instantiates a new Item vat dto.
     *
     * @param value the value
     * @param label the label
     */
    public ItemVatDTO(BigDecimal value, String label) {
        super(value, label);
    }

    /**
     * Instantiates a new Item vat dto.
     *
     * @param value     the value
     * @param label     the label
     * @param isDefault the is default
     */
    public ItemVatDTO(BigDecimal value, String label, Boolean isDefault) {
        super(value, label);

        this.isDefault = isDefault;
    }

}
