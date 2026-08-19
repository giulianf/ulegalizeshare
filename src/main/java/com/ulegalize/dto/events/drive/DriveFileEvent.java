package com.ulegalize.dto.events.drive;

import com.ulegalize.enumeration.DriveType;

public record DriveFileEvent(
    String container,
    String path,
    String newPath,
    DriveType driveType
) {}
