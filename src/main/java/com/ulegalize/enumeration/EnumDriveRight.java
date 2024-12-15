package com.ulegalize.enumeration;

import lombok.Getter;

/**
 * The enum Enum drive right
 */
public enum EnumDriveRight {
    READ(0),
    WRITE(1),
    OWNER(2);

    @Getter
    final int right;

    /**
     * Instantiates a new Enum drive right
     *
     * @param right
     */
    EnumDriveRight(int right) {
        this.right = right;
    }

    public static EnumDriveRight fromRight(int id) {
        for (EnumDriveRight enumDriveRight : values()) {
            if (enumDriveRight.getRight() == id)
                return enumDriveRight;
        }
        return null;
    }
}
