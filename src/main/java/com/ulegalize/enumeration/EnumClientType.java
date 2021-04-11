package com.ulegalize.enumeration;

public enum EnumClientType {
    NATURAL_PERSON(1),
    COMPANY(2),
    COLLEGUE(3);

    private long id;

    EnumClientType(long id) {
        this.id = id;
    }

    public static EnumClientType fromId(Long id) {
        for (EnumClientType clientType : values()) {
            if (clientType.getId() == id)
                return clientType;
        }
        return null;
    }

    public long getId() {
        return id;
    }
}
