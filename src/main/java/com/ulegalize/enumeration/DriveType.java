package com.ulegalize.enumeration;

/**
 * The enum Drive type.
 */
public enum DriveType {
    /**
     * Openstack drive type.
     */
    openstack,
    /**
     * Dropbox drive type.
     */
    dropbox,
    /**
     * Onedrive drive type.
     */
    onedrive;


    /**
     * From name drive type.
     *
     * @param name the name
     * @return the drive type
     */
    public static DriveType fromName(String name) {
        for (DriveType driveType : values()) {
            if (driveType.name().equalsIgnoreCase(name))
                return driveType;
        }
        return null;
    }
}
