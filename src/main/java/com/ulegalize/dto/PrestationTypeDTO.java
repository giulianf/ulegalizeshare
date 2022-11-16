package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * The type Prestation type dto.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrestationTypeDTO {

    /**
     * The Id ts.
     */
    private Integer idTs;
    /**
     * The Vc key.
     */
    private String vcKey;
    /**
     * The Description.
     */
    private String description;
    /**
     * The User upd.
     */
    private String userUpd;
    /**
     * The Date upd.
     */
    private Date dateUpd;
    /**
     * The Archived.
     */
    private boolean archived;

}
