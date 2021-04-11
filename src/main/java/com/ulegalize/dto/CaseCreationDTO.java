package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import lombok.Data;

import java.io.Serializable;

@Data
public class CaseCreationDTO extends AbstractRestObject implements Serializable {

    private DossierDTO dossier;
    private ContactSummary contact;
    private String note;

    public CaseCreationDTO() {

    }


}
