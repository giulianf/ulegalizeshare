package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumDossierContactType;
import lombok.Getter;

public class ItemClientDto extends Item<Long> {
    @Getter
    private EnumDossierContactType type;
    @Getter
    private String email;

    public ItemClientDto() {
        super(null, "");
    }

    public ItemClientDto(Long value, String label) {
        super(value, label);
    }

    public ItemClientDto(Long value, String label, String email, EnumDossierContactType extra) {
        super(value, label);

        this.email = email;
        this.type = extra;
    }

}
