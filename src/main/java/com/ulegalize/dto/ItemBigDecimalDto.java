package com.ulegalize.dto;

import java.math.BigDecimal;

public class ItemBigDecimalDto extends Item<BigDecimal> {
    public ItemBigDecimalDto(){
        super(null, "");
    }
    public ItemBigDecimalDto(BigDecimal value, String label) {
        super(value, label);
    }

}
