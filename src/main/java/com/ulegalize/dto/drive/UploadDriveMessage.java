package com.ulegalize.dto.drive;

import lombok.Data;

@Data
public class UploadDriveMessage {

  private String driveType;
  private String container;
  private String filename;
  private String path;
  private String folderPathUri;
  private Long userId;
  private byte[] file;

}
