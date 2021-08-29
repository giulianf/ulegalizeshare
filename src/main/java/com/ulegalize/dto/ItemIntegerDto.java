package com.ulegalize.dto;

import lombok.Getter;

public class ItemIntegerDto extends Item<Integer> {
    @Getter
    private String isDefault;

    public ItemIntegerDto() {
        super(null, "");
    }

    public ItemIntegerDto(Integer value, String label) {
        super(value, label);
    }

    public ItemIntegerDto(Integer value, String label, String extra) {
        super(value, label);

        this.isDefault = extra;
    }

}
