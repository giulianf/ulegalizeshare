package com.ulegalize.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Microsoft Credentials DTO
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class MicrosoftCredentialsDTO extends AccessCredentialsDTO {

    /**
     * Id Lawyer
     */
    private long idLawyer;
}
