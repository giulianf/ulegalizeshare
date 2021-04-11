package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import com.ulegalize.enumeration.DriveType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LawfirmDriveDTO extends AbstractRestObject {

	private DriveType driveType;
	private String dropboxToken;
	private String onedriveToken;
	private LocalDateTime expireToken;
	private String refreshToken;

	public LawfirmDriveDTO() {

	}
}
