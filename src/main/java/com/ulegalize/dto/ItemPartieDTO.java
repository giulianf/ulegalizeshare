package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumPartieType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The type Item partie dto.
 */
@AllArgsConstructor
@NoArgsConstructor
public class ItemPartieDTO {
    /**
     * The Id.
     */
    @Getter
    @Setter
    private String id;

    /**
     * The Label.
     */
    @Getter
    @Setter
    private String label;
    /**
     * The Email.
     */
    @Getter
    @Setter
    private String email;
    /**
     * The Email item.
     */
    @Getter
    @Setter
    private ItemStringDto emailItem;
    /**
     * The Function.
     */
    @Getter
    @Setter
    private String function;
    /**
     * The Function item.
     */
    @Getter
    @Setter
    private ItemIntegerDto functionItem;
    /**
     * The Type.
     */
    @Getter
    @Setter
    private EnumPartieType type;
    /**
     * The Is litigant.
     */
    @Getter
    @Setter
    private boolean isLitigant;
    /**
     * The Vc key.
     */
    @Getter
    @Setter
    private String vcKey;

    /**
     * The Contact id.
     */
    @Getter
    @Setter
    private Long contactId;

    /**
     * Instantiates a new Item partie dto.
     *
     * @param id            the id
     * @param label         the label
     * @param email         the email
     * @param functionId    the function id
     * @param functionLabel the function label
     * @param type          the type
     * @param contactId     the contact id
     */
    public ItemPartieDTO(String id, String label, String email, Integer functionId, String functionLabel, EnumPartieType type, Long contactId) {
        this.id = id;
        this.label = label;
        this.email = email;
        this.function = functionLabel;
        this.functionItem = new ItemIntegerDto(functionId, functionLabel);
        this.type = type;
        this.contactId = contactId;
    }
}
