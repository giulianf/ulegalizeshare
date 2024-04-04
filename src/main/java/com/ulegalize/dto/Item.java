package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * The type Item.
 *
 * @param <T> the type parameter
 */
@Data
@AllArgsConstructor
public abstract class Item<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * The Value.
     */
    public T value;
    /**
     * The Label.
     */
    public String label;
}
