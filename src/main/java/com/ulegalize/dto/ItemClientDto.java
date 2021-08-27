package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumDossierContactType;
import lombok.Getter;

public class ItemClientDto extends ItemLongDto {
    @Getter
    private EnumDossierContactType type;

    public ItemClientDto() {
        super(null, "");
    }

    public ItemClientDto(Long value, String label) {
        super(value, label);
    }

    public ItemClientDto(Long value, String label, String email, EnumDossierContactType extra) {
        super(value, label, email);

        this.type = extra;
    }

}
