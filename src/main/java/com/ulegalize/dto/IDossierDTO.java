package com.ulegalize.dto;

import java.math.BigDecimal;

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
}
