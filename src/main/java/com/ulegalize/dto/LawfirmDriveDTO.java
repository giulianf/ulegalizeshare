package com.ulegalize.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The type Lawfirm drive dto.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LawfirmDriveDTO extends AccessCredentialsDTO {
    /**
     * The Vckey.
     */
    private String vckey;

    /**
     * Instantiates a new Lawfirm drive dto.
     */
    public LawfirmDriveDTO() {

    }
}
