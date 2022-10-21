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
import java.util.List;

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

    private EnumVCOwner owner;
    private String vckeyOwner;

    private Long idUserResponsible;

    private Long id_matiere_rubrique;
    private ItemLongDto matiere_rubrique;

    private String keywords;
    private String quality;
    private String memo;
    private Integer success_fee_perc;
    private BigDecimal success_fee_montant;
    private Integer couthoraire;
    private String emailClient;
    private String partiesName;
    @JsonFormat(timezone = "GMT+02:00", pattern = "yyyy-MM-dd")
    private Date birthdateClient;
    private Boolean isDigital;
    private BigDecimal balance = BigDecimal.ZERO;
    private String initiales;

    private List<DossierContactDTO> dossierContactDTO;

    private Date lastAccessDate;
    // used for the creation
    private List<Long> shareUsers;
    private String nomenclature;
    private String drivePath;
    private ItemLongDto virtualcabNomenclature;
    private List<ItemLongDto> tagsList;
    private String tagsName;

    public DossierDTO(Long dossierId, Long year, Long number, String initiales,
                      BigDecimal balance, String vckey, EnumVCOwner enumVCOwner,
                      Date closeDossier, Date openDossier,
                      EnumDossierType type,
                      Date lastAccessDate,
                      String partiesName,
                      String nomenclature, String drivePath, String tagsName) {
        this.id = dossierId;
        this.year = year;
        this.num = number;
        this.initiales = initiales;
        this.balance = balance;
        this.type = type;
        this.closeDossier = closeDossier;
        this.openDossier = openDossier;
        this.owner = enumVCOwner;
        this.lastAccessDate = lastAccessDate;
        this.partiesName = partiesName;

        if (!type.equals(EnumDossierType.MD)) {
            if (enumVCOwner != null && enumVCOwner.equals(EnumVCOwner.NOT_SAME_VC)) {
                this.label = DossiersUtils.getDossierLabel(nomenclature, vckey) + " - " + partiesName; //2019 / 0012 - CABNAME blahaz/azklk
            } else {
                this.label = DossiersUtils.getDossierLabelItem(nomenclature) + " - " + partiesName; //2019 / 0012 blahaz/azklk
            }
        } else {
            if (enumVCOwner != null && enumVCOwner.equals(EnumVCOwner.NOT_SAME_VC)) {
                this.label = DossiersUtils.getDossierLabel(nomenclature, vckey) + " - " + partiesName; //2019 / 0012 - CABNAME blahaz/azklk
            } else {
                this.label = type.getDossType() + " - " + DossiersUtils.getDossierLabelItem(nomenclature) + " - " + partiesName; // MD 2019 / 0012 blabla, blabla
            }
        }
        this.nomenclature = nomenclature;
        this.drivePath = drivePath;
        this.tagsName = tagsName;

    }

}
