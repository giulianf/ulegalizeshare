package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Microsoft Credentials DTO
 */

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class MicrosoftCredentialsDTO extends AccessCredentialsDTO {

    /**
     * Id Lawyer
     */
    private long idLawyer;
}
