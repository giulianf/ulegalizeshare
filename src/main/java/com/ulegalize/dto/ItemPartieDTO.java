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
    private String id;

    @Getter
    @Setter
    private String label;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private ItemStringDto emailItem;
    @Getter
    @Setter
    private String function;
    @Getter
    @Setter
    private ItemIntegerDto functionItem;
    @Getter
    @Setter
    private EnumPartieType type;
    @Getter
    @Setter
    private boolean isLitigant;
    @Getter
    @Setter
    private String vcKey;

    @Getter
    @Setter
    private Long contactId;

    public ItemPartieDTO(String id, String label, String email, Integer functionId, String functionLabel, EnumPartieType type) {
        this.id = id;
        this.label = label;
        this.email = email;
        this.function = functionLabel;
        this.functionItem = new ItemIntegerDto(functionId, functionLabel);
        this.type = type;
    }
}
