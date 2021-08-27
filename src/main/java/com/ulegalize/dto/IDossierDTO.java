package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumDossierType;

import java.math.BigDecimal;
import java.util.Date;

public interface IDossierDTO {
    Long getId();

    String getLabel();

    Long getYear();

    Long getNum();

    String getInitiales();

    String getFirstnameClient();

    String getLastnameClient();

    String getCompanyClient();

    Long getIdClient();

    String getAdverseFirstnameClient();

    String getAdverseLastnameClient();

    String getAdverseCompanyClient();

    Long getAdverseIdClient();

    BigDecimal getBalance();

    String getVckeyOwner();

    Date getCloseDossier();

    EnumDossierType getType();
}
