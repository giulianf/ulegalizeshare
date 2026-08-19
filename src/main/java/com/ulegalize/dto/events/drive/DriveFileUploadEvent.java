package com.ulegalize.dto.events.drive;

public record DriveFileUploadEvent(
    String container,
    String file,
    String filename,
    String folderPathUri
) {}
