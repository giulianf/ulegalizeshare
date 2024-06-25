package com.ulegalize.enumeration;

import lombok.Getter;

/**
 * The enum Enum facture type.
 */
public enum EnumFactureType {
    /**
     * Sell enum facture type.
     */
    SELL(1, "FV", false ),
    /**
     * Credit enum facture type.
     */
    CREDIT(2, "NC", false ),
    /**
     * Temp enum facture type.
     */
    TEMP(3, "FT", true ),
    /**
     * Temp nc enum facture type.
     */
    TEMP_NC(4, "NT", true ),

    /**
     * Provision enum facture type
     */
    PROVISION(5, "PR", false ),

    /**
     * REMINDER enum facture type
     */
    REMINDER(6, "RM", false ),
    /**
     * Provision temporary enum facture type
     */
    PROVISION_TEMP(7, "PT", true),
    /**
     * REMINDER temporary enum facture type
     */
    REMINDER_TEMP(8, "RT", true);

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
     * The Code.
     */
    @Getter
    private boolean isTemp;

    /**
     * Instantiates a new Enum facture type.
     *
     * @param id     the id
     * @param code   the code
     * @param isTemp
     */
    EnumFactureType(long id, String code, boolean isTemp) {
        this.id = id;
        this.code = code;
        this.isTemp = isTemp;
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
