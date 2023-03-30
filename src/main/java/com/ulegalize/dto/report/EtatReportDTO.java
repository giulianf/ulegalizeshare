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
    private Long dossierId;
    private CompleteDossierDTO completeDossierDTO;

    private FinanceDTO financeDTO;

    private List<InvoiceDTO> invoiceList;
    private List<ComptaDTO> tiersAffaireList;
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
