package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumPartieType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class ItemPartieDTO {
    @Getter
    @Setter
    String label;
    @Getter
    @Setter
    String email;
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private ItemStringDto emailItem;
    @Getter
    @Setter
    private String function;
    @Getter
    @Setter
    private ItemStringDto functionItem;
    @Getter
    @Setter
    private EnumPartieType type;
    @Getter
    @Setter
    private boolean isLitigant;
}
