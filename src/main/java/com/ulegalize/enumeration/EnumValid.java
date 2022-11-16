package com.ulegalize.enumeration;

/**
 * The enum Enum valid.
 */
public enum EnumValid {
    /**
     * Pending enum valid.
     */
    PENDING(-1),
    /**
     * Unverified enum valid.
     */
    UNVERIFIED(1),
    /**
     * Verified enum valid.
     */
    VERIFIED(2);

    /**
     * The Id.
     */
    private int id;

    /**
     * Instantiates a new Enum valid.
     *
     * @param id the id
     */
    EnumValid(int id) {
        this.id = id;
    }

    /**
     * From id enum valid.
     *
     * @param id the id
     * @return the enum valid
     */
    public static EnumValid fromId(int id) {
        for (EnumValid clientType : values()) {
            if (clientType.getId() == id)
                return clientType;
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
