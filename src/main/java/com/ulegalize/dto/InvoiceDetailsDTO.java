package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * The type Invoice details dto.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDetailsDTO {

    /**
     * The Id.
     */
    private Long id;
    /**
     * The Facture id.
     */
    private Long factureId;
    /**
     * The Description.
     */
    private String description;

    /**
     * The Tva.
     */
    private BigDecimal tva;
    /**
     * The Tva item.
     */
    private ItemBigDecimalDto tvaItem;

    /**
     * The Montant.
     */
    private BigDecimal montant;
    /**
     * The Montant ht.
     */
    private BigDecimal montantHt;
}
