package com.ulegalize.dto.emails;

import com.ulegalize.dto.Item;
import lombok.Getter;
import lombok.Setter;

public class ItemEmailDTO extends Item<String> {

    @Getter
    @Setter
    // EnumEmailTagType
    private String typeEmail;

    @Getter
    @Setter
    private Long id;

    public ItemEmailDTO(String value, String label) {
        super(value, label);
    }

    public ItemEmailDTO() {
        super(null, "");
    }

    public ItemEmailDTO(String value, String label, String typeEmail) {
        super(value, label);
        this.setTypeEmail(typeEmail);
    }
}
