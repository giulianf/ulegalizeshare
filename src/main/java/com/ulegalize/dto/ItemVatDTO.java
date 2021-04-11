package com.ulegalize.dto;

import lombok.Getter;

import java.math.BigDecimal;

public class ItemVatDTO extends ItemBigDecimalDto {
    @Getter
    private Boolean isDefault;

    public ItemVatDTO() {
        super(null, "");
    }

    public ItemVatDTO(BigDecimal value, String label) {
        super(value, label);
    }

    public ItemVatDTO(BigDecimal value, String label, Boolean isDefault) {
        super(value, label);

        this.isDefault = isDefault;
    }

}
