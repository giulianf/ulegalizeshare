package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumVCOwner;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The interface Dossier dto.
 */
public interface IDossierDTO {
    /**
     * Gets id.
     *
     * @return the id
     */
    Long getId();

    /**
     * Gets label.
     *
     * @return the label
     */
    String getLabel();

    /**
     * Gets year.
     *
     * @return the year
     */
    Long getYear();

    /**
     * Gets num.
     *
     * @return the num
     */
    Long getNum();

    /**
     * Gets initiales.
     *
     * @return the initiales
     */
    String getInitiales();

    /**
     * Gets parties name.
     *
     * @return the parties name
     */
    String getPartiesName();

    /**
     * Gets balance.
     *
     * @return the balance
     */
    BigDecimal getBalance();

    /**
     * Gets vckey owner.
     *
     * @return the vckey owner
     */
    String getVckeyOwner();

    /**
     * Gets close dossier.
     *
     * @return the close dossier
     */
    Date getCloseDossier();

    /**
     * Gets open dossier.
     *
     * @return the open dossier
     */
    Date getOpenDossier();

    /**
     * Gets type.
     *
     * @return the type
     */
    String getTypeString();
    /**
     * Gets type.
     *
     * @return the type
     */
    Boolean getMediation();

    /**
     * Gets owner.
     *
     * @return the owner
     */
    EnumVCOwner getOwner();

    /**
     * Gets last access date.
     *
     * @return the last access date
     */
    Date getLastAccessDate();

    /**
     * Gets nomenclature.
     *
     * @return the nomenclature
     */
    String getNomenclature();

    /**
     * Gets label dossier.
     *
     * @return the label of the dossier
     */
    String getLabelDossier();

    /**
     * Gets drive path.
     *
     * @return the drive path
     */
    String getDrivePath();

    /**
     * Gets virtualcab nomenclature.
     *
     * @return the virtualcab nomenclature
     */
    ItemLongDto getVirtualcabNomenclature();

    /**
     * Gets tags name.
     *
     * @return the tags name
     */
    String getTagsName();

    /**
     * Gets cout horaire
     *
     * @return Cout horaire
     */
    BigDecimal getCouthoraire();
}
