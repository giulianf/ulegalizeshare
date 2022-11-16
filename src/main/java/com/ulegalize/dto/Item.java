package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The type Item.
 *
 * @param <T> the type parameter
 */
@Data
@AllArgsConstructor
public abstract class Item<T> {
    /**
     * The Value.
     */
    public T value;
    /**
     * The Label.
     */
    public String label;
}
