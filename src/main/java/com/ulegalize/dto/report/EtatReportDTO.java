package com.ulegalize.dto.report;

import com.ulegalize.dto.ComptaDTO;
import com.ulegalize.dto.InvoiceDTO;
import com.ulegalize.dto.template.CompleteDossierDTO;
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

    private List<InvoiceDTO> invoiceList;
    private List<ComptaDTO> tiersAffaireList;
    private List<ComptaDTO> honoraireAffaireList;
    private CompleteDossierDTO completeDossierDTO;

    /**
     * @param completeDossierDTO complete dossier
     */
    public EtatReportDTO(CompleteDossierDTO completeDossierDTO) {
        this.completeDossierDTO = completeDossierDTO;
    }

}
