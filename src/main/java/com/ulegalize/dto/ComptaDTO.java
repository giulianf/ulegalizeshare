package com.ulegalize.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Data
public class ComptaDTO {
    public ComptaDTO(){}
    Long id;
    Integer idType;
    ItemDto idTypeItem;
    Integer idCompte;
    LocalDate dateValue;
    BigDecimal montant;
    BigDecimal montantHt;
    Integer idTransaction;
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

    String vcKey;

    ItemDto poste;
    String tiersFullname;

    // for invoice
    private boolean invoiceChecked;
    private boolean alreadyInvoiced;
    private Long factureExtFraisId;
    private Long factExtId;
    private String factExtRef;

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
                     Long factureExtFraisId, Long factExtId, String factExtRef) {
        this.id = id;
        this.vcKey = vcKey;
        this.idPost = idPost;
        this.poste = new ItemDto(idPost, posteDescription);
        this.montant = montant;
        this.montantHt = montantHt;
        this.tiersFullname = tiersFullname;

        this.invoiceChecked = factureFraisId != null;
        this.factureExtFraisId = factureExtFraisId;
        // if it s different then the prestation has been already linked
        this.alreadyInvoiced = factureFraisId != null && factureExtFraisId != null
                && !Objects.equals(factureExtFraisId, factureFraisId);
        this.factExtId = factExtId;
        this.factExtRef = factExtRef;
    }
}
