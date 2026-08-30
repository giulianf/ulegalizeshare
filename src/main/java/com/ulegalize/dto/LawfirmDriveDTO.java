package com.ulegalize.dto;

import com.ulegalize.enumeration.DriveType;

public record LawfirmDriveDTO(
    String vckey,
    DriveType driveType
) {
}
