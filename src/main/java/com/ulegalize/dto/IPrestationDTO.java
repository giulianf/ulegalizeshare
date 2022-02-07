package com.ulegalize.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public interface IPrestationDTO {
    Long getId();

    Long getDossierId();

    String getDossier();

    ItemLongDto getDossierItem();

    Long getIdGest();

    ItemLongDto getIdGestItem();

    Integer getTsType();

    ItemDto getTsTypeItem();

    String getTsTypeDescription();

    Integer getCouthoraire();

    ZonedDateTime getDateAction();

    BigDecimal getDh();

    BigDecimal getDm();

    String getComment();

    BigDecimal getTotalHt();

    BigDecimal getTotalTTC();

    BigDecimal getVat();

    ItemBigDecimalDto getVatItem();

    Boolean isForfait();

    BigDecimal getForfaitHt();

    Boolean isInvoiceChecked();

    Boolean isAlreadyInvoiced();

    Integer getFactureTimesheetLinkedId();

    Integer getFactureTimesheetExtId();

    Long getFactExtId();

    String getFactExtRef();

    String getYearDossier();

    Long getNumDossier();
}
