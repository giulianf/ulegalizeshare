package com.ulegalize.dto;

import com.ulegalize.enumeration.DriveType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * The type Profile dto.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDTO implements Serializable {

    /**
     * The Id.
     */
    private Long id;
    /**
     * The Full name.
     */
    private String fullName;
    /**
     * The Email.
     */
    private String email;
    /**
     * The Phone.
     */
    private String phone;
    /**
     * The Vc key selected.
     */
    private String vcKeySelected;
    /**
     * The Temporary vc.
     */
    private boolean temporaryVc;
    /**
     * The Language.
     */
    private String language;
    /**
     * The Symbol currency.
     */
    private String symbolCurrency;
    /**
     * The User id.
     */
    private Long userId;
    /**
     * The User login id.
     */
    private String userLoginId;
    /**
     * The Enum rights.
     */
    private List<Integer> enumRights;
    /**
     * The Drive type.
     */
    private DriveType driveType;
    /**
     * The drive token (could be dropbox or onedrive or gmail).
     */
    private String driveToken;
    /**
     * The Onedrive refresh token.
     */
    private String onedriveRefreshToken;
    /**
     * The Onedrive expire token.
     */
    private ZonedDateTime onedriveExpireToken;
    /**
     * The Verified.
     */
    private boolean verified;
    /**
     * The Client from.
     */
    private String clientFrom;

}
