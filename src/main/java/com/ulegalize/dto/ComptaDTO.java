package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumLanguage;
import com.ulegalize.enumeration.EnumRefTransaction;
import com.ulegalize.utils.Utils;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * The type Compta dto.
 */
@Data
public class ComptaDTO {
    /**
     * Instantiates a new Compta dto.
     */
    public ComptaDTO() {
    }

    /**
     * The Id.
     */
    Long id;
    /**
     * The Id type.
     */
    Integer idType;
    /**
     * The Id type item.
     */
    ItemDto idTypeItem;
    /**
     * The Id compte.
     */
    Integer idCompte;
    /**
     * The Compte.
     */
    ItemDto compte;
    /**
     * The Date value.
     */
    LocalDate dateValue;
    /**
     * The Montant.
     */
    BigDecimal montant;
    /**
     * The Montant ht.
     */
    BigDecimal montantHt;
    /**
     * The Id transaction.
     */
    Integer idTransaction;
    /**
     * The Language.
     */
    String language;
    /**
     * The Ratio.
     */
    BigDecimal ratio;
    /**
     * The Grid id.
     */
    Integer gridId;
    /**
     * The Id post.
     */
    Integer idPost;
    /**
     * The Id user.
     */
    Long idUser;
    /**
     * The Id user item.
     */
    ItemLongDto idUserItem;
    /**
     * The Id doss.
     */
    Long idDoss;
    /**
     * The Id dossier item.
     */
    ItemLongDto idDossierItem;
    /**
     * The Id facture.
     */
    Long idFacture;
    /**
     * The Id facture item.
     */
    ItemLongDto idFactureItem;
    /**
     * The Memo.
     */
    String memo;
    /**
     * The Is deleted.
     */
    boolean isDeleted;

    /**
     * The Vc key.
     */
    String vcKey;

    /**
     * The Poste.
     */
    ItemDto poste;

    /**
     * The Transaction type item.
     */
    ItemDto transactionTypeItem;
    /**
     * The Tiers fullname.
     */
    String tiersFullname;

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
     * The Facture linked frais id.
     */
    private Long factureLinkedFraisId;
    /**
     * The Facture ext frais id.
     */
    private Long factureExtFraisId;
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
     * The Poste description.
     */
    private String posteDescription;

    /**
     * used for invoice
     *
     * @param id               the id
     * @param vcKey            the vc key
     * @param idPost           the id post
     * @param posteDescription the poste description
     * @param montant          the montant
     * @param montantHt        the montant ht
     * @param tiersFullname    the tiers fullname
     * @param factureFraisId   the facture frais id
     * @param invoiceChecked   the invoice checked
     * @param alreadyInvoiced  the already invoiced
     * @param factExtId        the fact ext id
     * @param factExtRef       the fact ext ref
     * @param idTransaction    the id transaction
     * @param language         the language
     */
    public ComptaDTO(Long id, String vcKey,
                     Integer idPost, String posteDescription,
                     BigDecimal montant, BigDecimal montantHt,
                     String tiersFullname,
                     Long factureFraisId,
                     boolean invoiceChecked, boolean alreadyInvoiced,
                     Long factExtId, String factExtRef, Integer idTransaction, String language) {
        this.id = id;
        this.vcKey = vcKey;
        this.idPost = idPost;
        this.posteDescription = posteDescription;
        this.poste = new ItemDto(idPost, posteDescription);
        this.montant = montant;
        this.idTransaction = idTransaction;
        this.montantHt = montantHt;
        this.tiersFullname = tiersFullname;

        this.invoiceChecked = invoiceChecked;
        this.factureExtFraisId = factureFraisId;
        this.alreadyInvoiced = alreadyInvoiced;
        this.factureLinkedFraisId = factureFraisId;
        this.factExtId = factExtId;
        this.factExtRef = factExtRef;

        EnumLanguage enumLanguage = EnumLanguage.fromshortCode(language);
        EnumRefTransaction enumRefTransaction = EnumRefTransaction.fromId(idTransaction);

        if(enumRefTransaction!= null) {
            transactionTypeItem = new ItemDto(idTransaction, Utils.getLabel(enumLanguage, enumRefTransaction.name(), null));
        }
    }
}
