package com.ulegalize.enumeration;

/**
 * The enum Enum security app groups.
 */
public enum EnumSecurityAppGroups {
    /**
     * Other enum security app groups.
     */
    OTHER(0),
    /**
     * Admin enum security app groups.
     */
    ADMIN(1),
    /**
     * User enum security app groups.
     */
    USER(2),
    /**
     * Super admin enum security app groups.
     */
    SUPER_ADMIN(3);

    /**
     * The Id.
     */
    private int id;

    /**
     * Instantiates a new Enum security app groups.
     *
     * @param id the id
     */
    EnumSecurityAppGroups(int id) {
        this.id = id;
    }

    /**
     * From id enum security app groups.
     *
     * @param id the id
     * @return the enum security app groups
     */
    public static EnumSecurityAppGroups fromId(int id) {
        for (EnumSecurityAppGroups securityAppGroups : values()) {
            if (securityAppGroups.getId() == id)
                return securityAppGroups;
        }
        return null;
    }


    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }
}
