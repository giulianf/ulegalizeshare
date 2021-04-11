package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;


@Data
@AllArgsConstructor
public class AccountingTypeDTO {

    private Integer accountingId;
    private String vcKey;
    private String description;
    private String userUpd;
    private Date dateUpd;
    private boolean archived;

    private boolean fraisProcedure;
    private boolean honoraires;
    private boolean fraisCollaboration;
    private boolean facturable;

}
