package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CaseCreationDTO extends AbstractRestObject implements Serializable {

    private DossierDTO dossier;
    private ContactSummary contact;
    private String note;
    private List<ItemLongDto> cat;
    private Boolean assistanceJuridique = Boolean.FALSE;

    public CaseCreationDTO() {

    }


}
