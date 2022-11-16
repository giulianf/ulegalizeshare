package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumDossierContactType;
import lombok.Getter;

/**
 * The type Item client dto.
 */
public class ItemClientDto extends ItemLongDto {
    /**
     * The Type.
     */
    @Getter
    private EnumDossierContactType type;

    /**
     * Instantiates a new Item client dto.
     */
    public ItemClientDto() {
        super(null, "");
    }

    /**
     * Instantiates a new Item client dto.
     *
     * @param value the value
     * @param label the label
     */
    public ItemClientDto(Long value, String label) {
        super(value, label);
    }

    /**
     * Instantiates a new Item client dto.
     *
     * @param value the value
     * @param label the label
     * @param email the email
     * @param extra the extra
     */
    public ItemClientDto(Long value, String label, String email, EnumDossierContactType extra) {
        super(value, label, email);

        this.type = extra;
    }

}
