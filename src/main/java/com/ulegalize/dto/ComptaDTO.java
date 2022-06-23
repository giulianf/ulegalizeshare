package com.ulegalize.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ComptaDTO {
    public ComptaDTO() {
    }

    Long id;
    Integer idType;
    ItemDto idTypeItem;
    Integer idCompte;
    ItemDto compte;
    LocalDate dateValue;
    BigDecimal montant;
    BigDecimal montantHt;
    Integer idTransaction;
    String transactionLabel;
    BigDecimal ratio;
    Integer gridId;
    Integer idPost;
    Long idUser;
    ItemLongDto idUserItem;
    Long idDoss;
    ItemLongDto idDossierItem;
    Long idFacture;
    ItemLongDto idFactureItem;
    String memo;
    boolean isDeleted;

    String vcKey;

    ItemDto poste;

    ItemDto transaction;
    String tiersFullname;

    // for invoice
    private boolean invoiceChecked;
    private boolean alreadyInvoiced;
    private Long factureLinkedFraisId;
    private Long factureExtFraisId;
    private Long factExtId;
    private String factExtRef;
    private String yearDossier;
    private Long numDossier;
    private String posteDescription;

    /**
     * used for invoice
     *
     * @param id
     * @param vcKey
     * @param idPost
     * @param posteDescription
     * @param montant
     * @param montantHt
     * @param tiersFullname
     * @param factureFraisId
     */
    public ComptaDTO(Long id, String vcKey,
                     Integer idPost, String posteDescription,
                     BigDecimal montant, BigDecimal montantHt,
                     String tiersFullname,
                     Long factureFraisId,
                     Integer idTransaction, String transactionLabel,
                     boolean invoiceChecked, boolean alreadyInvoiced,
                     Long factExtId, String factExtRef) {
        this.id = id;
        this.vcKey = vcKey;
        this.idPost = idPost;
        this.posteDescription = posteDescription;
        this.poste = new ItemDto(idPost, posteDescription);
        this.transaction= new ItemDto(idTransaction, transactionLabel);
        this.montant = montant;
        this.montantHt = montantHt;
        this.tiersFullname = tiersFullname;

        this.invoiceChecked = invoiceChecked;
        this.factureExtFraisId = factureFraisId;
        this.alreadyInvoiced = alreadyInvoiced;
        this.factureLinkedFraisId = factureFraisId;
        this.factExtId = factExtId;
        this.factExtRef = factExtRef;
    }
}
