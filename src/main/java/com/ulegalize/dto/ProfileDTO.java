package com.ulegalize.dto;

import com.ulegalize.enumeration.DriveType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDTO implements Serializable {

    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String vcKeySelected;
    private boolean temporaryVc;
    private String language;
    private String symbolCurrency;
    private Long userId;
    private List<Integer> enumRights;
    private DriveType driveType;
    private String dropboxToken;
    private String onedriveToken;
    private boolean verified;

    public ProfileDTO(Long id,
                      String fullName,
                      String email,
                      String vcKeySelected,
                      String language,
                      String symbolCurrency,
                      Long userId,
                      DriveType driveType,
                      String dropboxToken,
                      String onedriveToken,
                      boolean verified) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.vcKeySelected = vcKeySelected;
        this.language = language;
        this.symbolCurrency = symbolCurrency;
        this.userId = userId;
        this.driveType = driveType;
        this.dropboxToken = dropboxToken;
        this.onedriveToken = onedriveToken;
        this.verified = verified;
    }
}
