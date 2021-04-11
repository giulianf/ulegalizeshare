package com.ulegalize.dto;

public class ItemStringDto extends Item<String> {
    public ItemStringDto() {
        super("", "");
    }


    public ItemStringDto(String value, String label) {
        super(value, label);
    }
}
