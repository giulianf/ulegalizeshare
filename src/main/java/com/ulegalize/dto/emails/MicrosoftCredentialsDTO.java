package com.ulegalize.dto.emails;

import java.time.ZonedDateTime;

import com.ulegalize.enumeration.DriveType;

public record MicrosoftCredentialsDTO(
    DriveType driveType,
    String dropboxToken,
    String onedriveToken,
    String gmailToken,
    ZonedDateTime expireToken,
    String refreshToken,
    long idLawyer
) {
}
