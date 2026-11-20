package com.ulegalize.dto.events.drive;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ulegalize.enumeration.DriveType;

public record DriveFileEvent(
    String container,
    String path,
    String newPath,
    DriveType driveType,
    @JsonInclude(JsonInclude.Include.NON_NULL) AiDocument aiDocument
) {
  public DriveFileEvent(String container, String path, String newPath, DriveType driveType) {
    this(container, path, newPath, driveType, null);
  }

  public record AiDocument(Long dossierId, UUID documentId, String summaryObjectKey,
                           String sourceProviderId, String sourceEtag, String model) {}
}
