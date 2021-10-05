package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class InvoiceDTO {

    private Long id;
    private String dossier;
    private String dossierYear;
    private String dossierNumber;
    private Long dossierId;
    private ItemLongDto dossierItem;
    private String vcKey;
    private Integer numFacture;
    private Integer yearFacture;
    private String reference;
    private Long typeId;
    private ItemLongDto typeItem;
    private BigDecimal montant;
    private BigDecimal totalHonoraire;
    private Boolean valid;
    private ZonedDateTime dateValue;
    private ZonedDateTime dateEcheance;
    private Integer posteId;
    private ItemDto posteItem;
    private Integer echeanceId;
    private ItemDto echeanceItem;
    private Long clientId;
    private ItemLongDto clientItem;

    private List<InvoiceDetailsDTO> invoiceDetailsDTOList = new ArrayList<>();
    private List<Long> prestationIdList = new ArrayList<>();

}
