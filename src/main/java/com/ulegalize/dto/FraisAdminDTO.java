package com.ulegalize.dto;

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
     *
     * @param idDebourType
     * @param debourTypeDescription
     * @param vcKey
     * @param debourDescription
     * @param pricePerUnit
     * @param unit
     * @param mesureTypeId
     * @param mesureDescription
     * @param archived
     * @param dateAction
     * @param comment
     * @param factureFraisId
     */
    public FraisAdminDTO(Long idDebourType, String debourTypeDescription,
                         String vcKey, String debourDescription,
                         BigDecimal pricePerUnit, Integer unit,
                         Integer mesureTypeId, String mesureDescription,
                         Boolean archived, ZonedDateTime dateAction, String comment,
                         Integer factureFraisId) {
        this.idDebourType = idDebourType;
        this.idDebourTypeItem = new ItemLongDto(idDebourType, debourTypeDescription);
        this.vcKey = vcKey;
        this.archived = archived;
        this.debourDescription = debourDescription;
        this.mesureDescription = mesureDescription;
        this.idMesureType = mesureTypeId;
        this.idMesureTypeItem = new ItemDto(mesureTypeId, mesureDescription);
        this.pricePerUnit = pricePerUnit;
        this.unit = unit;
        this.dateAction = dateAction;
        this.comment = comment;

        this.invoiceChecked = factureFraisId != null;
    }


}
