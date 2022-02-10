package com.ulegalize.dto;

import com.ulegalize.utils.DossiersUtils;
import com.ulegalize.utils.PrestationUtils;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
public class PrestationSummary {

    private Long id;
    private Long dossierId;
    private String dossier;
    private ItemLongDto dossierItem;

    private Long idGest;
    private ItemLongDto idGestItem;
    private Integer tsType;
    private ItemDto tsTypeItem;
    private String tsTypeDescription;
    private Integer couthoraire;
    private ZonedDateTime dateAction;
    private BigDecimal dh;
    private BigDecimal dm;
    private String comment;
    private BigDecimal totalHt;
    private BigDecimal totalTTC;
    private BigDecimal vat;
    private ItemBigDecimalDto vatItem;
    private boolean forfait;
    private BigDecimal forfaitHt = BigDecimal.ZERO;

    // for invoice
    private boolean invoiceChecked;
    private boolean alreadyInvoiced;
    private Long factureTimesheetLinkedId;
    private Long factureTimesheetExtId;
    private Long factExtId;
    private String factExtRef;
    private String yearDossier;
    private Long numDossier;
    private String email;


    public PrestationSummary() {

    }

    /**
     * Used for invoice
     *
     * @param id
     * @param dossierId
     * @param yearDossier
     * @param numDossier
     * @param idGest
     * @param email
     * @param tsType
     * @param tsTypeDescription
     * @param couthoraire
     * @param dateAction
     * @param dh
     * @param dm
     * @param comment
     * @param vat
     * @param forfait
     * @param forfaitHt
     * @param factureTimesheetId
     * @param invoiceChecked
     * @param alreadyInvoiced
     * @param factExtId
     * @param factExtRef
     */
    public PrestationSummary(Long id, Long dossierId, String yearDossier, Long numDossier, Long idGest, String email, Integer tsType,
                             String tsTypeDescription, Integer couthoraire, ZonedDateTime dateAction, BigDecimal dh, BigDecimal dm, String comment,
                             BigDecimal vat,
                             Boolean forfait, BigDecimal forfaitHt, Long factureTimesheetId,
                             boolean invoiceChecked, boolean alreadyInvoiced,
                             Long factExtId, String factExtRef) {

        this.id = id;
        this.dossierId = dossierId;
        this.yearDossier = yearDossier;
        this.numDossier = numDossier;
        this.dossier = DossiersUtils.getDossierLabelItem(yearDossier, numDossier);
        this.idGest = idGest;
        this.email = email;
        this.idGestItem = new ItemLongDto(idGest, email);
        this.tsType = tsType;
        this.tsTypeItem = new ItemDto(tsType, tsTypeDescription);
        this.tsTypeDescription = tsTypeDescription;
        this.couthoraire = couthoraire;
        this.dateAction = dateAction;
        this.dh = dh;
        this.dm = dm;
        this.comment = comment;
        this.totalHt = PrestationUtils.calculateHVAT(forfait, dm, dh, couthoraire, forfaitHt);
        this.totalTTC = PrestationUtils.calculateVAT(forfait, dm, dh, couthoraire, forfaitHt, vat);
        this.vat = vat;
        this.vatItem = new ItemBigDecimalDto(vat, vat.toString());
        this.forfait = forfait;
        this.forfaitHt = forfaitHt;

        this.invoiceChecked = invoiceChecked;
        this.factureTimesheetExtId = factureTimesheetId;
        this.factureTimesheetLinkedId = factureTimesheetId;
        this.alreadyInvoiced = alreadyInvoiced;
        this.factExtId = factExtId;
        this.factExtRef = factExtRef;
    }

}
