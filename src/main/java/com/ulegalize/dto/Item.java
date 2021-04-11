package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Item<T> {
    public T value;
    public String label;
}
