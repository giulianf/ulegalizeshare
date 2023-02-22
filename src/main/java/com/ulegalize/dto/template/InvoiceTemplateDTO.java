package com.ulegalize.dto.template;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.util.List;

/**
 * The type Invoice template dto.
 */
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class InvoiceTemplateDTO extends MainTemplateDTO {
    /**
     * The Is valid.
     */
    private Boolean isValid;

    /**
     * The Address.
     */
    private String address;

    /**
     * The Amount ht lbl.
     */
    private String amountHtLbl;

    /**
     * The Amounttt lbl.
     */
    private String amountttLbl;

    /**
     * The Annexe lbl.
     */
    @JsonProperty("AnnexeLbl")
    private String annexeLbl;

    /**
     * The Client city.
     */
    private String clientCity;

    /**
     * The Client country.
     */
    private String clientCountry;

    /**
     * The Client cp.
     */
    private String clientCp;

    /**
     * The Client name.
     */
    private String clientName;
    /**
     * The Client title.
     */
    private String clientTitle;

    /**
     * The Client street.
     */
    private String clientStreet;

    /**
     * The Company name.
     */
    private String companyName;
    /**
     * The Company VAT.
     */
    private String companyVat;
    /**
     * The invoice year
     */
    private Integer invoiceYear;

    /**
     * The Country.
     */
    private String country;

    /**
     * The Currency.
     */
    private String currency;

    /**
     * The Date lbl.
     */
    private String dateLbl;

    /**
     * The Description lbl.
     */
    private String descriptionLbl;

    /**
     * The Dossier lbl.
     */
    private String dossierLbl;

    /**
     * The Dossier number.
     */
    private String dossierNumber;

    /**
     * The Echeance date.
     */
    private String echeanceDate;

    /**
     * The Echeance visible.
     */
    private Integer echeanceVisible;

    /**
     * The Email.
     */
    private String email;

    /**
     * The End date lbl.
     */
    private String endDateLbl;

    /**
     * The Invoice date.
     */
    private String invoiceDate;

    /**
     * The Invoice header lbl.
     */
    private String invoiceHeaderLbl;

    /**
     * The Invoice number.
     */
    private Long invoiceNumber;

    /**
     * The Item.
     */
    private List<Item> item;

    /**
     * The Item prestation.
     */
    private List<ItemPrestation> itemPrestation;
    /**
     * The Item debours.
     */
    private List<ItemDebours> itemDebours;
    /**
     * The Item frais admins.
     */
    private List<ItemFraisAdmin> itemFraisAdmins;
    /**
     * The Item frais collas.
     */
    private List<ItemFraisColla> itemFraisCollas;

    /**
     * The Item vat.
     */
    private List<ItemVat> itemVat;

    /**
     * The Logo.
     */
    private String logo;

    /**
     * The Our ref lbl.
     */
    private String ourRefLbl;

    /**
     * The Page lbl.
     */
    private String pageLbl;

    /**
     * The Postal code.
     */
    private String postalCode;
    /**
     * The City.
     */
    private String city;

    /**
     * The Prestation lbl.
     */
    private String prestationLbl;
    /**
     * The Frais admin lbl.
     */
    private String fraisAdminLbl;
    /**
     * The Debours lbl.
     */
    private String deboursLbl;
    /**
     * The Collab lbl.
     */
    private String collabLbl;

    /**
     * The Rate lbl.
     */
    private String rateLbl;

    /**
     * The Ref invoice.
     */
    private String refInvoice;

    /**
     * The Title name.
     */
    @JsonProperty("TitleName")
    private String titleName;

    /**
     * The Total amount.
     */
    private BigDecimal totalAmount;

    /**
     * The Total ht amount.
     */
    private BigDecimal totalHtAmount;

    /**
     * The Mesure lbl.
     */
    private String mesureLbl;
    /**
     * The Unit price lbl.
     */
    private String unitPriceLbl;
    /**
     * The Unit lbl.
     */
    private String unitLbl;
    /**
     * The Tiers lbl.
     */
    private String tiersLbl;
    /**
     * The Template name from user choice.
     */
    private String templateName;
}
