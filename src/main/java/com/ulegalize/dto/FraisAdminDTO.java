package com.ulegalize.dto;

import com.ulegalize.utils.DossiersUtils;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
public class FraisAdminDTO {
    @Deprecated // for v1 during creation of usign
    private Long type;
    private String vcKey;
    private boolean archived;

    private Long id;
    private Long idDoss;
    private Long idUserResponsible;

    private Long idDebourType;
    private ItemLongDto idDebourTypeItem;
    private Integer idMesureType;
    private ItemDto idMesureTypeItem;
    private String mesureDescription;
    private String debourDescription;
    private Integer unit;
    private String comment;
    private ZonedDateTime dateAction;
    private BigDecimal pricePerUnit;

    // for invoice
    private boolean invoiceChecked;
    private boolean alreadyInvoiced;
    private Long factureExtFraisId;
    private Long factureLinkedFraisId;
    private Long factExtId;
    private String factExtRef;
    private String dossier;
    private String yearDossier;
    private Long numDossier;
    private String debourTypeDescription;

    public FraisAdminDTO() {
    }

    public FraisAdminDTO(Long idDebourType, Integer idMesureType, String description, BigDecimal pricePerUnit) {
        this.idDebourType = idDebourType;
        this.idMesureType = idMesureType;
        this.mesureDescription = description;
        this.pricePerUnit = pricePerUnit;
    }

    public FraisAdminDTO(Long idDebourType, String vcKey, String debourDescription, BigDecimal pricePerUnit, Integer mesureTypeId, String mesureDescription, Boolean archived) {
        this.idDebourType = idDebourType;
        this.vcKey = vcKey;
        this.archived = archived;
        this.debourDescription = debourDescription;
        this.mesureDescription = mesureDescription;
        this.idMesureType = mesureTypeId;
        this.idMesureTypeItem = new ItemDto(mesureTypeId, mesureDescription);
        this.pricePerUnit = pricePerUnit;
    }

    /**
     * used for invoice
     * @param id
     * @param idDebourType
     * @param debourTypeDescription
     * @param pricePerUnit
     * @param unit
     * @param mesureTypeId
     * @param mesureDescription
     * @param idDoss
     * @param yearDossier
     * @param numDossier
     * @param dateAction
     * @param comment
     * @param factureFraisId
     * @param invoiceChecked
     * @param alreadyInvoiced
     * @param factExtId
     * @param factExtRef
     */
    public FraisAdminDTO(Long id,
                         Long idDebourType, String debourTypeDescription,
                         BigDecimal pricePerUnit, Integer unit,
                         Integer mesureTypeId, String mesureDescription,
                         Long idDoss, String yearDossier, Long numDossier,
                         ZonedDateTime dateAction, String comment,
                         Long factureFraisId,
                         boolean invoiceChecked, boolean alreadyInvoiced,
                         Long factExtId, String factExtRef) {
        this.id = id;
        this.idDebourType = idDebourType;
        this.debourTypeDescription = debourTypeDescription;
        this.idDebourTypeItem = new ItemLongDto(idDebourType, debourTypeDescription);
        this.idDoss = idDoss;
        this.dossier = DossiersUtils.getDossierLabelItem(yearDossier, numDossier);
        this.mesureDescription = mesureDescription;
        this.idMesureType = mesureTypeId;
        this.idMesureTypeItem = new ItemDto(mesureTypeId, mesureDescription);
        this.pricePerUnit = pricePerUnit;
        this.unit = unit;
        this.dateAction = dateAction;
        this.comment = comment;

        this.invoiceChecked = invoiceChecked;
        this.alreadyInvoiced = alreadyInvoiced;
        this.factureLinkedFraisId = factureFraisId;
        this.factExtId = factExtId;
        this.factExtRef = factExtRef;

    }


}
