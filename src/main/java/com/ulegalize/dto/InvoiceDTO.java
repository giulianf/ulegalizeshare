package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Invoice dto.
 */
@Data
@NoArgsConstructor
public class InvoiceDTO {

    /**
     * The Id.
     */
    private Long id;
    /**
     * The Id string.
     */
    private String idString;
    /**
     * The Dossier.
     */
    private String dossier;
    /**
     * The Dossier year.
     */
    private String dossierYear;
    /**
     * The Dossier number.
     */
    private String dossierNumber;
    /**
     * The Dossier id.
     */
    private Long dossierId;
    /**
     * The Dossier item.
     */
    private ItemLongDto dossierItem;
    /**
     * The Vc key.
     */
    private String vcKey;
    /**
     * The Num facture.
     */
    private Integer numFacture;
    /**
     * The Year facture.
     */
    private Integer yearFacture;
    /**
     * The Reference.
     */
    private String reference;
    /**
     * The Type id.
     */
    private Long typeId;
    /**
     * The Type item.
     */
    private ItemLongDto typeItem;
    /**
     * The Montant.
     */
// ttc
    private BigDecimal montant;
    /**
     * The Montant ht.
     */
// htva
    private BigDecimal montantHt;
    /**
     * The Total honoraire.
     */
    private BigDecimal totalHonoraire;
    /**
     * The Valid.
     */
    private Boolean valid;
    /**
     * The Date value.
     */
    private ZonedDateTime dateValue;
    /**
     * The Date echeance.
     */
    private ZonedDateTime dateEcheance;
    /**
     * The Poste id.
     */
    private Integer posteId;
    /**
     * The Poste item.
     */
    private ItemDto posteItem;
    /**
     * The Echeance id.
     */
    private Integer echeanceId;
    /**
     * The Echeance item.
     */
    private ItemDto echeanceItem;
    /**
     * The Client id.
     */
    private Long clientId;
    /**
     * The Client item.
     */
    private ItemLongDto clientItem;
    /**
     * The Bank account id.
     */
    private Integer bankAccountId;
    /**
     * The Bank account item.
     */
    private ItemIntegerDto bankAccountItem;

    /**
     * The Invoice details dto list.
     */
    private List<InvoiceDetailsDTO> invoiceDetailsDTOList = new ArrayList<>();
    /**
     * The Prestation id list.
     */
    private List<Long> prestationIdList = new ArrayList<>();
    /**
     * The Frais admin id list.
     */
    private List<Long> fraisAdminIdList = new ArrayList<>();
    /**
     * The Debours id list.
     */
    private List<Long> deboursIdList = new ArrayList<>();
    /**
     * The Frais collaboration id list.
     */
    private List<Long> fraisCollaborationIdList = new ArrayList<>();

}
