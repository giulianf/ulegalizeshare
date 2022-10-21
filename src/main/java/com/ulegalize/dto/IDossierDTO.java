package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumDossierType;
import com.ulegalize.enumeration.EnumVCOwner;

import java.math.BigDecimal;
import java.util.Date;

public interface IDossierDTO {
    Long getId();

    String getLabel();

    Long getYear();

    Long getNum();

    String getInitiales();

    String getPartiesName();

    BigDecimal getBalance();

    String getVckeyOwner();

    Date getCloseDossier();

    Date getOpenDossier();

    EnumDossierType getType();

    EnumVCOwner getOwner();

    Date getLastAccessDate();

    String getNomenclature();

    String getDrivePath();

    ItemLongDto getVirtualcabNomenclature();

    String getTagsName();
}
