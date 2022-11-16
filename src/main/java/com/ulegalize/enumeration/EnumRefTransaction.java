package com.ulegalize.enumeration;

import lombok.Getter;

/**
 * The enum Enum ref transaction.
 */
public enum EnumRefTransaction {
    /**
     * Virement enum ref transaction.
     */
    VIREMENT(1),
    /**
     * Credit enum ref transaction.
     */
    CREDIT(2),
    /**
     * Cash enum ref transaction.
     */
    CASH(3),
    /**
     * Bancontact enum ref transaction.
     */
    BANCONTACT(4),
    /**
     * Cheque enum ref transaction.
     */
    CHEQUE(5),
    /**
     * Na enum ref transaction.
     */
    NA(6);

    /**
     * The Id.
     */
    @Getter
    private Integer id;

    /**
     * Instantiates a new Enum ref transaction.
     *
     * @param id the id
     */
    EnumRefTransaction(Integer id) {
        this.id = id;
    }

    /**
     * From id enum ref transaction.
     *
     * @param id the id
     * @return the enum ref transaction
     */
    public static EnumRefTransaction fromId(Integer id) {
        for (EnumRefTransaction enumRefTransaction : values()) {
            if (enumRefTransaction.getId().equals(id)) {
                return enumRefTransaction;
            }
        }
        return null;
    }
}
