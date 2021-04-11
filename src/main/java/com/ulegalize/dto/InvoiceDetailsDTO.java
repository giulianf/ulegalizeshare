package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDetailsDTO {

    private Long id;
    private Long factureId;
    private String description;

    private BigDecimal tva;
    private ItemBigDecimalDto tvaItem;

    private BigDecimal montant;
    private BigDecimal montantHt;
}
