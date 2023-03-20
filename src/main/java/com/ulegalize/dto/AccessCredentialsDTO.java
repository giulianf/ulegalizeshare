package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import com.ulegalize.enumeration.DriveType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

/**
 * Credentials DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class AccessCredentialsDTO extends AbstractRestObject {

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
}
