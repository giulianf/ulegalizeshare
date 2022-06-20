package com.ulegalize.dto.bigleLegal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@NoArgsConstructor
public class InvoiceTemplateDTO extends MainTemplateDTO {
    private Boolean isValid;

    private String address;

    private String amountHtLbl;

    private String amountttLbl;

    @JsonProperty("AnnexeLbl")
    private String annexeLbl;

    private String clientCity;

    private String clientCountry;

    private String clientCp;

    private String clientName;

    private String clientStreet;

    private String companyName;

    private String country;

    private String currency;

    private String dateLbl;

    private String descriptionLbl;

    private String dossierLbl;

    private String dossierNumber;

    private String echeanceDate;

    private Integer echeanceVisible;

    private String email;

    private String endDateLbl;

    private String invoiceDate;

    private String invoiceHeaderLbl;

    private Long invoiceNumber;

    private List<Item> item;

    private List<ItemPrestation> itemPrestation;
    private List<ItemDebours> itemDebours;
    private List<ItemFraisAdmin> itemFraisAdmins;
    private List<ItemFraisColla> itemFraisCollas;

    private List<ItemVat> itemVat;

    private String logo;

    private String ourRefLbl;

    private String pageLbl;

    private String postalCode;
    private String city;

    private String prestationLbl;
    private String fraisAdminLbl;
    private String deboursLbl;
    private String collabLbl;

    private String rateLbl;

    private String refInvoice;

    @JsonProperty("TitleName")
    private String titleName;

    private BigDecimal totalAmount;

    private BigDecimal totalHtAmount;

    private String mesureLbl;
    private String unitPriceLbl;
    private String unitLbl;
    private String tiersLbl;
}
