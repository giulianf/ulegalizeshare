package com.ulegalize.enumeration;

import lombok.Getter;

/**
 * The enum Enum facture type.
 */
public enum EnumFactureType {
    /**
     * Sell enum facture type.
     */
    SELL(1, "FV"),
    /**
     * Credit enum facture type.
     */
    CREDIT(2, "NC"),
    /**
     * Temp enum facture type.
     */
    TEMP(3, "FT"),
    /**
     * Temp nc enum facture type.
     */
    TEMP_NC(4, "NT"),

    /**
     * Provision enum facture type
     */
    PROVISION(5, "PR"),

    /**
     * REMINDER enum facture type
     */
    REMINDER(6, "RM");

    /**
     * The Id.
     */
    @Getter
    private long id;
    /**
     * The Code.
     */
    @Getter
    private String code;

    /**
     * Instantiates a new Enum facture type.
     *
     * @param id   the id
     * @param code the code
     */
    EnumFactureType(long id, String code) {
        this.id = id;
        this.code = code;
    }

    /**
     * From id enum facture type.
     *
     * @param id the id
     * @return the enum facture type
     */
    public static EnumFactureType fromId(Long id) {
        for (EnumFactureType clientType : values()) {
            if (clientType.getId() == id)
                return clientType;
        }
        return null;
    }

}
