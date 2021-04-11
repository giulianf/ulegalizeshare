package com.ulegalize.dto;

import lombok.Getter;

public class ItemLongDto extends Item<Long> {
    @Getter
    private String isDefault;

    public ItemLongDto() {
        super(null, "");
    }

    public ItemLongDto(Long value, String label) {
        super(value, label);
    }

    public ItemLongDto(Long value, String label, String extra) {
        super(value, label);

        this.isDefault = extra;
    }

}
