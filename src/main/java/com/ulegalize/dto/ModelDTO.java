package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumContextTemplate;
import com.ulegalize.enumeration.EnumTypeTemplate;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The type Model dto.
 */
@Data
@AllArgsConstructor
public class ModelDTO {
    /**
     * The Id.
     */
    private Long id;
    /**
     * The Name.
     */
    private String name;
    /**
     * The Context.
     */
    private EnumContextTemplate context;
    /**
     * The Context item.
     */
    private ItemStringDto contextItem;
    /**
     * The Format.
     */
    private String format;
    /**
     * The Format item.
     */
    private ItemStringDto formatItem;
    /**
     * The Template.
     */
    private String template;
    /**
     * The Template item.
     */
    private ItemStringDto templateItem;
    /**
     * The Description.
     */
    private String description;
    /**
     * The Type.
     */
    private EnumTypeTemplate type;

    /**
     * Instantiates a new Model dto.
     */
    public ModelDTO() {
    }

}
