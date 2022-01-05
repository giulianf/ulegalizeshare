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
    private boolean verified;

}
