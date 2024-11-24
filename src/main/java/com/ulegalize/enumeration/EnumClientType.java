package com.ulegalize.enumeration;

/**
 * The enum Enum client type.
 */
public enum EnumClientType {
    /**
     * Natural person enum client type.
     */
    NATURAL_PERSON(1),
    /**
     * Company enum client type.
     */
    COMPANY(2),
    /**
     * Collegue enum client type.
     */
    COLLEGUE(3),
    /**
     * COURT enum client type.
     */
    COURT(4);

    /**
     * The Id.
     */
    private long id;

    /**
     * Instantiates a new Enum client type.
     *
     * @param id the id
     */
    EnumClientType(long id) {
        this.id = id;
    }

    /**
     * From id enum client type.
     *
     * @param id the id
     * @return the enum client type
     */
    public static EnumClientType fromId(Long id) {
        for (EnumClientType clientType : values()) {
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
    public long getId() {
        return id;
    }
}
