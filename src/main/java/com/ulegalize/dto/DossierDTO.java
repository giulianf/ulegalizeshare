package com.ulegalize.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ulegalize.enumeration.EnumDossierType;
import com.ulegalize.enumeration.EnumVCOwner;
import com.ulegalize.utils.ClientsUtils;
import com.ulegalize.utils.DossiersUtils;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

@Data
@NoArgsConstructor
public class DossierDTO implements IDossierDTO {

    private Long id;
    // used in v1
    private String label;
    private String fullnameDossier;
    private Long year;
    private Long num;
    private String note;
    //    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date openDossier;
    private Date closeDossier;
    private EnumDossierType type;
    private ItemStringDto typeItem;

    private boolean isOwner;
    private String vckeyOwner;

    private Long idUserResponsible;
    private Long idClient;
    private ItemLongDto client;
    private Long idAdverseClient;
    private ItemLongDto adverseClient;
    private Long conseilIdAdverseClient;
    private ItemLongDto conseilAdverseClient;

    private Long id_matiere_rubrique;
    private ItemLongDto matiere_rubrique;

    private String keywords;
    private String quality;
    private String memo;
    private Integer success_fee_perc;
    private BigDecimal success_fee_montant;
    private Integer couthoraire;
    private String emailClient;

    private String adverseFirstnameClient;

    private String adverseLastnameClient;
    private String adverseCompanyClient;

    private Long adverseIdClient;

    private String firstnameClient;
    private String lastnameClient;
    private String companyClient;
    @JsonFormat(timezone = "GMT+02:00", pattern = "yyyy-MM-dd")
    private Date birthdateClient;
    private Boolean isDigital;
    private BigDecimal balance = BigDecimal.ZERO;
    private String initiales;


    public DossierDTO(Long dossierId, Long year, Long number, String initiales,
                      String firstnameClient, String lastnameClient, String companyClient, Long idClient,
                      String adverseFirstnameClient, String adverseLastnameClient, String adverseCompanyClient, Long idClientAdverse,
                      BigDecimal balance, String vckey, Optional<EnumVCOwner> enumVCOwner, Date closeDossier) {
        this.id = dossierId;
        this.year = year;
        this.num = number;
        this.initiales = initiales;
        this.firstnameClient = firstnameClient;
        this.lastnameClient = lastnameClient;
        this.companyClient = companyClient;
        this.client = new ItemLongDto(idClient, ClientsUtils.getFullname(lastnameClient, firstnameClient, companyClient));

        this.idClient = idClient;
        this.adverseFirstnameClient = adverseFirstnameClient;
        this.adverseLastnameClient = adverseLastnameClient;
        this.adverseCompanyClient = adverseCompanyClient;
        this.adverseClient = new ItemLongDto(idClientAdverse, ClientsUtils.getFullname(adverseLastnameClient, adverseFirstnameClient, adverseCompanyClient));

        this.idAdverseClient = idClientAdverse;
        this.balance = balance;
        this.closeDossier = closeDossier;
        if (enumVCOwner.isPresent() && enumVCOwner.get().equals(EnumVCOwner.NOT_SAME_VC)) {
            this.label = DossiersUtils.getDossierLabel(String.valueOf(year), num, vckey) + " - " + lastnameClient + " " + firstnameClient + " / " + adverseLastnameClient + " " + adverseFirstnameClient; //2019 / 0012 - CABNAME blahaz/azklk

        } else {
            this.label = DossiersUtils.getDossierLabelItem(String.valueOf(year), num) + " - " + lastnameClient + " " + firstnameClient + " / " + adverseLastnameClient + " " + adverseFirstnameClient; //2019 / 0012 blahaz/azklk

        }

    }

}
