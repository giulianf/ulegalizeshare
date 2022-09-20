package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import com.ulegalize.enumeration.DriveType;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class LawfirmDriveDTO extends AbstractRestObject {
	private String vckey;

	private DriveType driveType;
	private String dropboxToken;
	private String onedriveToken;
	private ZonedDateTime expireToken;
	private String refreshToken;

	public LawfirmDriveDTO() {

	}
}
