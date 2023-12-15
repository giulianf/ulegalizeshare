package com.ulegalize.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ulegalize.enumeration.EnumDossierType;
import com.ulegalize.enumeration.EnumVCOwner;
import com.ulegalize.utils.DossiersUtils;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The type Dossier dto.
 */
@Data
@NoArgsConstructor
public class DossierDTO implements IDossierDTO {

    /**
     * The Id.
     */
    private Long id;
    /**
     * The Label.
     */
// used in v1
    private String label;
    /**
     * The Fullname dossier.
     */
    private String fullnameDossier;
    /**
     * The Year.
     */
    private Long year;
    /**
     * The Num.
     */
    private Long num;
    /**
     * The Note.
     */
    private String note;
    /**
     * The Open dossier.
     */
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date openDossier;
    /**
     * The Close dossier.
     */
    private Date closeDossier;
    /**
     * The Type.
     */
    private EnumDossierType type;
    /**
     * The Type item.
     */
    private ItemStringDto typeItem;

    /**
     * The Owner.
     */
    private EnumVCOwner owner;
    /**
     * The Vckey owner.
     */
    private String vckeyOwner;

    /**
     * The Id user responsible.
     */
    private Long idUserResponsible;

    /**
     * The Id matiere rubrique.
     */
    private Long id_matiere_rubrique;
    /**
     * The Matiere rubrique.
     */
    private ItemLongDto matiere_rubrique;

    /**
     * The Keywords.
     */
    private String keywords;
    /**
     * The Quality.
     */
    private String quality;
    /**
     * The Memo.
     */
    private String memo;
    /**
     * The Success fee perc.
     */
    private Integer success_fee_perc;
    /**
     * The Success fee montant.
     */
    private BigDecimal success_fee_montant;
    /**
     * The Couthoraire.
     */
    private Integer couthoraire;
    /**
     * The Email client.
     */
    private String emailClient;
    /**
     * The Parties name.
     */
    private String partiesName;
    /**
     * The Birthdate client.
     */
    @JsonFormat(timezone = "GMT+02:00", pattern = "yyyy-MM-dd")
    private Date birthdateClient;
    /**
     * The Is digital.
     */
    private Boolean isDigital;
    /**
     * The Balance.
     */
    private BigDecimal balance = BigDecimal.ZERO;
    /**
     * The Initiales.
     */
    private String initiales;

    /**
     * The Dossier contact dto.
     */
    private List<DossierContactDTO> dossierContactDTO;

    /**
     * The Last access date.
     */
    private Date lastAccessDate;
    /**
     * The Share users.
     */
// used for the creation
    private List<Long> shareUsers;
    /**
     * The Nomenclature.
     */
    private String nomenclature;
    /**
     * Label of the Dossier must be equals to the nomenclature.
     */
    private String labelDossier;
    /**
     * The Drive path.
     */
    private String drivePath;
    /**
     * The Virtualcab nomenclature.
     */
    private ItemLongDto virtualcabNomenclature;
    /**
     * The Tags list.
     */
    private List<ItemLongDto> tagsList;
    /**
     * The managers list.
     */
    private List<DossierManagerDTO> managersList;
    /**
     * The Tags name.
     */
    private String tagsName;

    /**
     * Instantiates a new Dossier dto.
     *
     * @param dossierId      the dossier id
     * @param year           the year
     * @param number         the number
     * @param initiales      the initiales
     * @param balance        the balance
     * @param vckey          the vckey
     * @param enumVCOwner    the enum vc owner
     * @param closeDossier   the close dossier
     * @param openDossier    the open dossier
     * @param type           the type
     * @param lastAccessDate the last access date
     * @param partiesName    the parties name
     * @param nomenclature   the nomenclature
     * @param labelDossier   the labelDossier
     * @param drivePath      the drive path
     * @param tagsName       the tags name
     */
    public DossierDTO(Long dossierId, Long year, Long number, String initiales,
                      BigDecimal balance, String vckey, EnumVCOwner enumVCOwner,
                      Date closeDossier, Date openDossier,
                      EnumDossierType type,
                      Date lastAccessDate,
                      String partiesName,
                      String nomenclature,
                      String labelDossier,
                      String drivePath, String tagsName) {
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
                this.label = DossiersUtils.getDossierLabel(labelDossier, vckey) + " - " + partiesName; //2019 / 0012 - CABNAME blahaz/azklk
            } else {
                this.label = DossiersUtils.getDossierLabelItem(labelDossier) + " - " + partiesName; //2019 / 0012 blahaz/azklk
            }
        } else {
            if (enumVCOwner != null && enumVCOwner.equals(EnumVCOwner.NOT_SAME_VC)) {
                this.label = DossiersUtils.getDossierLabel(labelDossier, vckey) + " - " + partiesName; //2019 / 0012 - CABNAME blahaz/azklk
            } else {
                this.label = type.getDossType() + " - " + DossiersUtils.getDossierLabelItem(labelDossier) + " - " + partiesName; // MD 2019 / 0012 blabla, blabla
            }
        }
        this.labelDossier = labelDossier;
        this.nomenclature = nomenclature;
        this.drivePath = drivePath;
        this.tagsName = tagsName;

    }

}
