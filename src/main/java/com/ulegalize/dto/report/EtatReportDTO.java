package com.ulegalize.dto.report;

import com.ulegalize.dto.ComptaDTO;
import com.ulegalize.dto.FinanceDTO;
import com.ulegalize.dto.InvoiceDTO;
import com.ulegalize.dto.template.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Etat ReportDTO
 */
@Data
@NoArgsConstructor
public class EtatReportDTO {
    /**
     * dossier id
     */
    private Long dossierId;
    /**
     * complete dossier
     */
    private CompleteDossierDTO completeDossierDTO;
    /**
     * finance
     */
    private FinanceDTO financeDTO;
    /**
     * invoice list
     */
    private List<InvoiceDTO> invoiceList;
    /**
     * tiers list
     */
    private List<ComptaDTO> tiersAffaireList;
    /**
     * honoraire list
     */
    private List<ComptaDTO> honoraireAffaireList;

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
     * @param completeDossierDTO complete dossier
     */
    public EtatReportDTO(CompleteDossierDTO completeDossierDTO) {
        this.completeDossierDTO = completeDossierDTO;
    }

}
