package com.ulegalize.dto;

import java.math.BigDecimal;

public interface IComptaDTO {
    Long getId();

    String getVcKey();

    Integer getIdPost();

    String getPosteDescription();

    BigDecimal getMontant();

    BigDecimal getMontantHt();

    String getTiersFullname();

    boolean isInvoiceChecked();

    boolean isAlreadyInvoiced();

    Long getFactureLinkedFraisId();

    Long getFactureExtFraisId();

    Long getFactExtId();

    String getFactExtRef();

    String getYearDossier();

    Long getNumDossier();

}
