package com.ulegalize.enumeration;

import lombok.Getter;

/**
 * The enum Enum account type.
 */
public enum EnumAccountType {

    /**
     * Pro account enum account type.
     */
    PRO_ACCOUNT(1),
    /**
     * Account tiers enum account type.
     */
    ACCOUNT_TIERS(2),
    /**
     * Cash enum account type.
     */
    CASH(3);

    /**
     * The Id.
     */
    @Getter
    private int id;

    /**
     * Instantiates a new Enum account type.
     *
     * @param id the id
     */
    EnumAccountType(int id) {
        this.id = id;
    }


    /**
     * From id enum account type.
     *
     * @param id the id
     * @return the enum account type
     */
    public static EnumAccountType fromId(int id) {
        for (EnumAccountType enumAccountType : values()) {
            if (enumAccountType.getId() == id)
                return enumAccountType;
        }
        return null;
    }
}
