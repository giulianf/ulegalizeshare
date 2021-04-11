package com.ulegalize.dto;

public class ItemDto extends Item<Integer> {
    public ItemDto() {
        super(null, "");
    }

    public ItemDto(Integer value, String label) {
        super(value, label);
    }

}
