package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * The type Finance dto.
 */
@Data
@NoArgsConstructor
public class FinanceDTO implements Serializable {

    /**
     * The Couthoraire.
     */
    private Integer couthoraire;
    /**
     * The Honoraires.
     */
    private BigDecimal honoraires = BigDecimal.ZERO;
    /**
     * honoraire with tax
     */
    private BigDecimal honorairesTax = BigDecimal.ZERO;
    /**
     * The Invoiced.
     */
    private BigDecimal invoiced = BigDecimal.ZERO;
    /**
     * The Prestations.
     */
    private BigDecimal prestations = BigDecimal.ZERO;
    /**
     * The Frais admin.
     */
    private BigDecimal fraisAdmin = BigDecimal.ZERO;
    /**
     * The Debours.
     */
    private BigDecimal debours = BigDecimal.ZERO;
    /**
     * The Collaboration.
     */
    private BigDecimal collaboration = BigDecimal.ZERO;
    /**
     * The Tiers account.
     */
    private BigDecimal tiersAccount = BigDecimal.ZERO;
    /**
     * The Total honoraire.
     */
    private BigDecimal totalHonoraire = BigDecimal.ZERO;
    /**
     * Total debours (htva)
     */
    private BigDecimal totalDebours = BigDecimal.ZERO;
    /**
     * The Total invoice.
     */
    private BigDecimal totalInvoice = BigDecimal.ZERO;
    /**
     * invoice tax
     */
    private BigDecimal totalInvoiceTax = BigDecimal.ZERO;
    /**
     * Solde frais et honoraires à facturer HTVA
     */
    private BigDecimal soldHonoraireToInvoice = BigDecimal.ZERO;
    /**
     * The Balance.
     */
    private BigDecimal balance = BigDecimal.ZERO;
}
