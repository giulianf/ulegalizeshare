package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * The type Case creation dto.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CaseCreationDTO extends AbstractRestObject implements Serializable {

    /**
     * The Dossier.
     */
    private DossierDTO dossier;
    /**
     * The Contact summary list.
     */
    private List<ContactSummary> contactSummaryList;
    /**
     * note
     */
    private String note;
    /**
     * The Cat.
     */
    private List<ItemLongDto> cat;
    /**
     * The Assistance juridique.
     */
    private Boolean assistanceJuridique = Boolean.FALSE;

    /**
     * The Case id.
     */
    private String caseId;

    /**
     * Instantiates a new Case creation dto.
     */
    public CaseCreationDTO() {

    }


}
