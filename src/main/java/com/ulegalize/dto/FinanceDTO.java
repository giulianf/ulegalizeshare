package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class FinanceDTO {

    private Integer couthoraire;
    private BigDecimal honoraires = BigDecimal.ZERO;
    private BigDecimal invoiced = BigDecimal.ZERO;
    private BigDecimal prestations = BigDecimal.ZERO;
    private BigDecimal fraisAdmin = BigDecimal.ZERO;
    private BigDecimal debours = BigDecimal.ZERO;
    private BigDecimal collaboration = BigDecimal.ZERO;
    private BigDecimal tiersAccount = BigDecimal.ZERO;
    private BigDecimal balance = BigDecimal.ZERO;
}
