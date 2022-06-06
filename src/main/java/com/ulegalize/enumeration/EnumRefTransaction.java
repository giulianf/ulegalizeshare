package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumRefTransaction {
    VIREMENT(1),
    CREDIT(2),
    CASH(3),
    BANCONTACT(4),
    CHEQUE(5),
    NA(6);

    @Getter
    private Integer id;

    EnumRefTransaction(Integer id) {
        this.id = id;
    }

    public static EnumRefTransaction fromId(Integer id) {
        for (EnumRefTransaction enumRefTransaction : values()) {
            if (enumRefTransaction.getId().equals(id)) {
                return enumRefTransaction;
            }
        }
        return null;
    }
}
