package com.ulegalize.enumeration;

public enum EnumSecurityAppGroups {
    OTHER(0),
    ADMIN(1),
    USER(2),
    SUPER_ADMIN(3);

    private int id;

    EnumSecurityAppGroups(int id) {
        this.id = id;
    }

    public static EnumSecurityAppGroups fromId(int id) {
        for (EnumSecurityAppGroups securityAppGroups : values()) {
            if (securityAppGroups.getId() == id)
                return securityAppGroups;
        }
        return null;
    }


    public int getId() {
        return id;
    }
}
