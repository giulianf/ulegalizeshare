package com.ulegalize.dto.events.drive;

import java.util.List;

import com.ulegalize.enumeration.DriveType;

public record DriveFilesEvent(
    List<String> paths,
    String container,
    DriveType driveType
) {}
