package com.ulegalize.dto;

import lombok.Getter;

public class ItemEventDto extends Item<String> {
    @Getter
    private String color;

    public ItemEventDto(String value, String label, String color) {
        super(value, label);
        this.color = color;
    }
}
