package com.ulegalize.enumeration;

public enum EnumVCOwner {
    // 0: not in the same vc ,
    // 1: owner of vc,
    // 2 not owner but same vc

    NOT_SAME_VC(0),
    OWNER_VC(1),
    NOT_OWNER_VC(2);

    private int id;

    EnumVCOwner(int id) {
        this.id = id;
    }

    public static EnumVCOwner fromId(int id) {
        for (EnumVCOwner role : values()) {
            if (role.getId() == id)
                return role;
        }
        return null;
    }

    public int getId() {
        return id;
    }
}
