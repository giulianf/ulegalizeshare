package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;


/**
 * The type Accounting type dto.
 */
@Data
@AllArgsConstructor
public class AccountingTypeDTO {
    /**
     * Instantiates a new Accounting type dto.
     */
    public AccountingTypeDTO() {
    }

    /**
     * The Accounting id.
     */
    private Integer accountingId;
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

    /**
     * The Frais procedure.
     */
    private boolean fraisProcedure;
    /**
     * The Honoraires.
     */
    private boolean honoraires;
    /**
     * The Frais collaboration.
     */
    private boolean fraisCollaboration;
    /**
     * The Facturable.
     */
    private boolean facturable;

}
