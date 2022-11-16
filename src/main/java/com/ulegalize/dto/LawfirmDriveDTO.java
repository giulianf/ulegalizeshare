package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import com.ulegalize.enumeration.DriveType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;

/**
 * The type Lawfirm drive dto.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LawfirmDriveDTO extends AbstractRestObject {
	/**
	 * The Vckey.
	 */
	private String vckey;

	/**
	 * The Drive type.
	 */
	private DriveType driveType;
	/**
	 * The Dropbox token.
	 */
	private String dropboxToken;
	/**
	 * The Onedrive token.
	 */
	private String onedriveToken;
	/**
	 * The Expire token.
	 */
	private ZonedDateTime expireToken;
	/**
	 * The Refresh token.
	 */
	private String refreshToken;

	/**
	 * Instantiates a new Lawfirm drive dto.
	 */
	public LawfirmDriveDTO() {

	}
}
