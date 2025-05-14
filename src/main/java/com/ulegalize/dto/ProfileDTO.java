package com.ulegalize.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
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

    /**
     * The Last connected.
     */
    private ZonedDateTime lastConnected;

    public ProfileDTO(Long id, String fullName, String email, String phone, String vcKeySelected, boolean temporaryVc, String language, String symbolCurrency, Long userId, String userLoginId, List<Integer> enumRights, DriveType driveType, boolean verified, String clientFrom, ZonedDateTime lastConnected) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.vcKeySelected = vcKeySelected;
        this.temporaryVc = temporaryVc;
        this.language = language;
        this.symbolCurrency = symbolCurrency;
        this.userId = userId;
        this.userLoginId = userLoginId;
        this.enumRights = enumRights;
        this.driveType = driveType;
        this.verified = verified;
        this.clientFrom = clientFrom;
        this.lastConnected = lastConnected;
    }

    public ProfileDTO(Long id, String fullName, String email, String phone, String vcKeySelected, boolean temporaryVc, String language, String symbolCurrency, Long userId, String userLoginId, List<Integer> enumRights, DriveType driveType, String driveToken, String onedriveRefreshToken, ZonedDateTime onedriveExpireToken, String clientFrom) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.vcKeySelected = vcKeySelected;
        this.temporaryVc = temporaryVc;
        this.language = language;
        this.symbolCurrency = symbolCurrency;
        this.userId = userId;
        this.userLoginId = userLoginId;
        this.enumRights = enumRights;
        this.driveType = driveType;
        this.driveToken = driveToken;
        this.onedriveRefreshToken = onedriveRefreshToken;
        this.onedriveExpireToken = onedriveExpireToken;
        this.clientFrom = clientFrom;
    }
}
