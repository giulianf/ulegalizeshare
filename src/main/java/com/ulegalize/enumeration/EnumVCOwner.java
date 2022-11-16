package com.ulegalize.enumeration;

/**
 * The enum Enum vc owner.
 */
public enum EnumVCOwner {
    // 0: not in the same vc ,
    // 1: owner of vc,
    // 2 not owner but same vc

    /**
     * Not same vc enum vc owner.
     */
    NOT_SAME_VC(0),
    /**
     * Owner vc enum vc owner.
     */
    OWNER_VC(1),
    /**
     * Not owner vc enum vc owner.
     */
    NOT_OWNER_VC(2);

    /**
     * The Id.
     */
    private int id;

    /**
     * Instantiates a new Enum vc owner.
     *
     * @param id the id
     */
    EnumVCOwner(int id) {
        this.id = id;
    }

    /**
     * From id enum vc owner.
     *
     * @param id the id
     * @return the enum vc owner
     */
    public static EnumVCOwner fromId(int id) {
        for (EnumVCOwner role : values()) {
            if (role.getId() == id)
                return role;
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
