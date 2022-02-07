package com.ulegalize.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public interface IFraisAdminDTO {
    Long getId();

    Long getIdDebourType();

    String getDebourTypeDescription();

    Long getIdDoss();

    String getMesureDescription();

    Integer getIdMesureType();

    BigDecimal getPricePerUnit();

    Integer getUnit();

    ZonedDateTime getDateAction();

    String getComment();

    boolean isInvoiceChecked();

    boolean isAlreadyInvoiced();

    Long getFactureLinkedFraisId();

    Long getFactureExtFraisId();

    Long getFactExtId();

    String getFactExtRef();

    String getYearDossier();

    Long getNumDossier();

}
