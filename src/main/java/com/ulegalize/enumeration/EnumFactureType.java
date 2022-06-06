package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumFactureType {
    SELL(1, "FV"),
    CREDIT(2, "NC"),
    TEMP(3, "FT");

    @Getter
    private long id;
    @Getter
    private String code;

    EnumFactureType(long id, String code) {
        this.id = id;
        this.code = code;
    }

    public static EnumFactureType fromId(Long id) {
        for (EnumFactureType clientType : values()) {
            if (clientType.getId() == id)
                return clientType;
        }
        return null;
    }

}
