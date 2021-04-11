package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumContextTemplate;
import com.ulegalize.enumeration.EnumTypeTemplate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModelDTO {
    private Long id;
    private String name;
    private EnumContextTemplate context;
    private ItemStringDto contextItem;
    private String format;
    private ItemStringDto formatItem;
    private String template;
    private ItemStringDto templateItem;
    private String description;
    private EnumTypeTemplate type;

    public ModelDTO() {
    }

}
