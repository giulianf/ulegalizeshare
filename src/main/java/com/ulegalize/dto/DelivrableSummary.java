package com.ulegalize.dto;

import com.ulegalize.utils.DossiersUtils;
import com.ulegalize.utils.PrestationUtils;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * The Delivrable summary.
 */
@Data
@NoArgsConstructor
public class DelivrableSummary {

    /**
     * The Id.
     */
    private Long id;
    /**
     * The Dossier id.
     */
    private Long dossierId;
    /**
     * The Dossier.
     */
    private String dossier;
    /**
     * The initiales gestionnaire.
     */
    private String initialesGestionnaire;
    /**
     * The Dossier item.
     */
    private ItemLongDto dossierItem;

    /**
     * The Id gest.
     */
    private Long idGest;
    /**
     * The Id gest item.
     */
    private ItemLongDto idGestItem;
    /**
     * The Ts type description.
     */
    private String typeDescription;
    /**
     * The Couthoraire.
     */
    private BigDecimal couthoraire;
    /**
     * The Date action.
     */
    private ZonedDateTime dateAction;
    /**
     * The Dh.
     */
    private BigDecimal dh;
    /**
     * The Dm.
     */
    private BigDecimal dm;
    /**
     * The Comment.
     */
    private String comment;
    /**
     * The Total ht.
     */
    private BigDecimal totalHt;
    /**
     * The Total ttc.
     */
    private BigDecimal totalTTC;
    /**
     * The Vat.
     */
    private BigDecimal vat;
    /**
     * The Vat item.
     */
    private ItemBigDecimalDto vatItem;
    /**
     * The Forfait.
     */
    private boolean forfait;
    /**
     * The Forfait ht.
     */
    private BigDecimal forfaitHt = BigDecimal.ZERO;

    /**
     * The Invoice checked.
     */
// for invoice
    private boolean invoiceChecked;
    /**
     * The Already invoiced.
     */
    private boolean alreadyInvoiced;
    /**
     * The Facture timesheet linked id.
     */
    private Long factureDelivrableLinkedId;
    /**
     * The Facture Delivrable ext id.
     */
    private Long factureDelivrableExtId;
    /**
     * The Fact ext id.
     */
    private Long factExtId;
    /**
     * The Fact ext ref.
     */
    private String factExtRef;
    /**
     * The Year dossier.
     */
    private String yearDossier;
    /**
     * The Num dossier.
     */
    private Long numDossier;
    /**
     * The Email.
     */
    private String email;
    /**
     * List of managers.
     */
    private List<Long> managerDossierIds;


    /**
     * Used for invoice
     *
     * @param id                 the id
     * @param dossierId          the dossier id
     * @param labelDossier       the label
     * @param yearDossier         the year dossier
     * @param initialesGestionnaire         the initial dossier
     * @param numDossier         the num dossier
     * @param idGest             the id gest
     * @param email              the email
     * @param typeDescription  the ts type description
     * @param couthoraire        the couthoraire
     * @param dateAction         the date action
     * @param dh                 the dh
     * @param dm                 the dm
     * @param comment            the comment
     * @param vat                the vat
     * @param forfait            the forfait
     * @param forfaitHt          the forfait ht
     * @param factureDelivrableId the facture Delivrable id
     * @param invoiceChecked     the invoice checked
     * @param alreadyInvoiced    the already invoiced
     * @param factExtId          the fact ext id
     * @param factExtRef         the fact ext ref
     */
    public DelivrableSummary(Long id, Long dossierId,
                             String labelDossier, String yearDossier,
                             String initialesGestionnaire,
                             Long numDossier, Long idGest, String email,
                             String typeDescription, BigDecimal couthoraire, ZonedDateTime dateAction, BigDecimal dh, BigDecimal dm, String comment,
                             BigDecimal vat,
                             Boolean forfait, BigDecimal forfaitHt, Long factureDelivrableId,
                             boolean invoiceChecked, boolean alreadyInvoiced,
                             Long factExtId, String factExtRef) {

        this(id, dossierId, labelDossier, yearDossier, initialesGestionnaire, numDossier, idGest,
                email, typeDescription, couthoraire, dateAction, dh, dm, comment, vat,
                forfait, forfaitHt, factureDelivrableId, invoiceChecked, alreadyInvoiced, factExtId,
                factExtRef, null);
    }

    /**
     * Used for report
     *
     * @param id                    the id
     * @param dossierId             the dossier id
     * @param labelDossier          the label
     * @param yearDossier           the year dossier
     * @param initialesGestionnaire the initial dossier
     * @param numDossier            the num dossier
     * @param idGest                the id gest
     * @param email                 the email
     * @param typeDescription                the ts type
     * @param couthoraire           the couthoraire
     * @param dateAction            the date action
     * @param dh                    the dh
     * @param dm                    the dm
     * @param comment               the comment
     * @param vat                   the vat
     * @param forfait               the forfait
     * @param forfaitHt             the forfait ht
     * @param factureDelivrableId    the facture Delivrable id
     * @param invoiceChecked        the invoice checked
     * @param alreadyInvoiced       the already invoiced
     * @param factExtId             the fact ext id
     * @param factExtRef            the fact ext ref
     * @param managerDossierIds     managerDossierIds
     */
    public DelivrableSummary(Long id, Long dossierId,
                             String labelDossier, String yearDossier,
                             String initialesGestionnaire,
                             Long numDossier, Long idGest, String email,
                             String typeDescription, BigDecimal couthoraire, ZonedDateTime dateAction, BigDecimal dh, BigDecimal dm, String comment,
                             BigDecimal vat,
                             Boolean forfait, BigDecimal forfaitHt, Long factureDelivrableId,
                             boolean invoiceChecked, boolean alreadyInvoiced,
                             Long factExtId, String factExtRef, List<Long> managerDossierIds) {
        this.managerDossierIds = managerDossierIds;

        this.id = id;
        this.dossierId = dossierId;
        this.yearDossier = yearDossier;
        this.numDossier = numDossier;
        this.initialesGestionnaire = initialesGestionnaire;
        this.dossier = DossiersUtils.getDossierLabelItem(labelDossier);
        this.idGest = idGest;
        this.email = email;
        this.idGestItem = new ItemLongDto(idGest, email);
        this.typeDescription = typeDescription;
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
        this.factureDelivrableExtId = factureDelivrableId;
        this.factureDelivrableLinkedId = factureDelivrableId;
        this.alreadyInvoiced = alreadyInvoiced;
        this.factExtId = factExtId;
        this.factExtRef = factExtRef;
    }

}
