package com.ulegalize.dto.emails;

import com.ulegalize.dto.Item;
import lombok.Getter;
import lombok.Setter;

/**
 * item email
 */
public class ItemEmailDTO extends Item<String> {

    /**
     * type email
     */
    @Getter
    @Setter
    private String typeEmail;

    /**
     * id
     */
    @Getter
    @Setter
    private Long id;

    /**
     * email dto
     *
     * @param value value
     * @param label label
     */
    public ItemEmailDTO(String value, String label) {
        super(value, label);
    }

    /**
     * item construct
     */
    public ItemEmailDTO() {
        super(null, "");
    }

    /**
     * item
     *
     * @param value     value
     * @param label     label
     * @param typeEmail type
     */
    public ItemEmailDTO(String value, String label, String typeEmail) {
        super(value, label);
        this.setTypeEmail(typeEmail);
    }
}
