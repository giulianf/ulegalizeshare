package com.ulegalize.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import com.ulegalize.utils.DossiersUtils;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Frais admin dto.
 */
@Data
@NoArgsConstructor
public class FraisAdminDTO {
  /**
   * The Type.
   */
  @Deprecated // for v1 during creation of usign
  private Long type;
  /**
   * The Vc key.
   */
  private String vcKey;
  /**
   * The Archived.
   */
  private boolean archived;

  /**
   * The Id.
   */
  private Long id;
  /**
   * The Id doss.
   */
  private Long idDoss;
  /**
   * The Id user responsible.
   */
  private Long idUserResponsible;

  /**
   * The Id debour type.
   */
  private Long idDebourType;
  /**
   * The Id debour type item.
   */
  private ItemLongDto idDebourTypeItem;
  /**
   * The Id mesure type.
   */
  private Integer idMesureType;
  /**
   * The Id mesure type item.
   */
  private ItemDto idMesureTypeItem;
  /**
   * The Mesure description.
   */
  private String mesureDescription;
  /**
   * The Debour description.
   */
  private String debourDescription;
  /**
   * The Unit.
   */
  private Integer unit;
  /**
   * The Comment.
   */
  private String comment;
  /**
   * The Date action.
   */
  private ZonedDateTime dateAction;
  /**
   * The Price per unit.
   */
  private BigDecimal pricePerUnit;
  /**
   * The Vat.
   */
  private BigDecimal vat;
  /**
   * The Vat item.
   */
  private ItemBigDecimalDto vatItem;
  /**
   * The Total ht.
   */
  private BigDecimal totalHt;
  /**
   * The Total ttc.
   */
  private BigDecimal totalTTC;
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
   * The Facture ext frais id.
   */
  private Long factureExtFraisId;
  /**
   * The Facture linked frais id.
   */
  private Long factureLinkedFraisId;
  /**
   * The Fact ext id.
   */
  private Long factExtId;
  /**
   * The Fact ext ref.
   */
  private String factExtRef;
  /**
   * The Dossier.
   */
  private String dossier;
  /**
   * The Year dossier.
   */
  private String yearDossier;
  /**
   * The Num dossier.
   */
  private Long numDossier;
  /**
   * The Debour type description.
   */
  private String debourTypeDescription;

  /**
   * Instantiates a new Frais admin dto.
   *
   * @param idDebourType the id debour type
   * @param idMesureType the id mesure type
   * @param description  the description
   * @param pricePerUnit the price per unit
   */
  public FraisAdminDTO(Long idDebourType, Integer idMesureType, String description, BigDecimal pricePerUnit) {
    this.idDebourType = idDebourType;
    this.idMesureType = idMesureType;
    this.mesureDescription = description;
    this.pricePerUnit = pricePerUnit;
  }

  /**
   * Instantiates a new Frais admin dto.
   *
   * @param idDebourType      the id debour type
   * @param vcKey             the vc key
   * @param debourDescription the debour description
   * @param pricePerUnit      the price per unit
   * @param mesureTypeId      the mesure type id
   * @param mesureDescription the mesure description
   * @param archived          the archived
   */
  public FraisAdminDTO(Long idDebourType, String vcKey, String debourDescription, BigDecimal pricePerUnit, Integer mesureTypeId, String mesureDescription, Boolean archived ) {
    this.idDebourType = idDebourType;
    this.vcKey = vcKey;
    this.archived = archived;
    this.debourDescription = debourDescription;
    this.mesureDescription = mesureDescription;
    this.idMesureType = mesureTypeId;
    this.idMesureTypeItem = new ItemDto(mesureTypeId, mesureDescription);
    this.pricePerUnit = pricePerUnit;
  }

  /**
   * used for invoice
   *
   * @param id                    the id
   * @param idDebourType          the id debour type
   * @param debourTypeDescription the debour type description
   * @param pricePerUnit          the price per unit
   * @param unit                  the unit
   * @param mesureTypeId          the mesure type id
   * @param mesureDescription     the mesure description
   * @param idDoss                the id doss
   * @param nomenclature          the nomenclature
   * @param dateAction            the date action
   * @param comment               the comment
   * @param factureFraisId        the facture frais id
   * @param invoiceChecked        the invoice checked
   * @param alreadyInvoiced       the already invoiced
   * @param factExtId             the fact ext id
   * @param factExtRef            the fact ext ref
   * @param totalHt               totalht
   * @param total                 total
   * @param vat                   vat
   */
  public FraisAdminDTO(Long id,
                       Long idDebourType, String debourTypeDescription,
                       BigDecimal pricePerUnit, Integer unit,
                       Integer mesureTypeId, String mesureDescription,
                       Long idDoss, String nomenclature,
                       ZonedDateTime dateAction, String comment,
                       Long factureFraisId,
                       boolean invoiceChecked, boolean alreadyInvoiced,
                       Long factExtId, String factExtRef,
                       BigDecimal totalHt, BigDecimal total, BigDecimal vat) {
    this.id = id;
    this.idDebourType = idDebourType;
    this.debourTypeDescription = debourTypeDescription;
    this.idDebourTypeItem = new ItemLongDto(idDebourType, debourTypeDescription);
    this.idDoss = idDoss;
    this.dossier = DossiersUtils.getDossierLabelItem(nomenclature);
    this.mesureDescription = mesureDescription;
    this.idMesureType = mesureTypeId;
    this.idMesureTypeItem = new ItemDto(mesureTypeId, mesureDescription);
    this.pricePerUnit = pricePerUnit;
    this.unit = unit;
    this.dateAction = dateAction;
    this.comment = comment;

    this.invoiceChecked = invoiceChecked;
    this.alreadyInvoiced = alreadyInvoiced;
    this.factureLinkedFraisId = factureFraisId;
    this.factExtId = factExtId;
    this.factExtRef = factExtRef;

    this.totalHt = totalHt;
    this.totalTTC = total;
    this.vat = vat;

  }


}
