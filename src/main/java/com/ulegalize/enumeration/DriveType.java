package com.ulegalize.enumeration;

public enum DriveType {
    openstack,
    dropbox,
    onedrive;


    public static DriveType fromName(String name) {
        for (DriveType driveType : values()) {
            if (driveType.name().equalsIgnoreCase(name))
                return driveType;
        }
        return null;
    }
}
