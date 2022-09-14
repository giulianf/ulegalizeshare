package com.ulegalize.dto;

import lombok.Getter;

public class ItemStringDto extends Item<String> {

    @Getter
    private Long extraId;

    public ItemStringDto() {
        super("", "");
    }

    public ItemStringDto(String value, String label) {
        super(value, label);
    }

    public ItemStringDto(String value, String label, Long extraId) {
        super(value, label);
        this.extraId = extraId;
    }
}
