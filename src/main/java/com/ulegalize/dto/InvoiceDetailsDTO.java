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
     * quantity
     */
    private Integer quantityDetail;
    /**
     * untity
     */
    private String unity;

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
    /**
     * The percentage Frais.
     */
    private int percentageValue;
    /**
     * The percentage Frais.
     */
    private boolean percentageFrais;
    /**
     * Calculate Honoraire.
     */
    private boolean honoraireCalculate;
}
