package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumVCOwner;
import lombok.Data;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * The type Share affaire dto.
 */
@Data
public class ShareAffaireDTO implements Serializable {

    /**
     * The Id.
     */
    private Long id;
    /**
     * The Affaire id.
     */
    private Long affaireId;
    /**
     * The Vc key.
     */
    private String vcKey;
    /**
     * The Affaire id list.
     */
    private List<Long> affaireIdList;
    /**
     * The Vc key item.
     */
    private ItemStringDto vcKeyItem;
    /**
     * The All members.
     */
    private boolean allMembers;
    /**
     * The User id selected.
     */
    private List<Long> userIdSelected;
    /**
     * The User id.
     */
    private Long userId;
    /**
     * The Enum vc owner.
     */
    private EnumVCOwner enumVCOwner;
    /**
     * The User email.
     */
    private String userEmail;
    /**
     * The Fullname.
     */
    private String fullname;

    /**
     * The Nomenclature.
     */
    private String nomenclature;
    /**
     * The label dossier.
     */
    private String labelDossier;
    /**
     * The idUserResponsible.
     */
    private Long idUserResponsible;
    /**
     * The Shared date.
     */
    private ZonedDateTime sharedDate;

    /**
     * Instantiates a new Share affaire dto.
     */
    public ShareAffaireDTO() {
    }

    /**
     * Instantiates a new Share affaire dto.
     *
     * @param id           the id
     * @param affaireId    the affaire id
     * @param userId       the user id
     * @param vcKey        the vc key
     * @param enumVCOwner  the enum vc owner
     * @param userEmail    the user email
     * @param fullname     the fullname
     * @param nomenclature the nomenclature
     * @param sharedDate   the shared date
     */
    public ShareAffaireDTO(Long id,
                           Long affaireId,
                           Long userId,
                           String vcKey,
                           EnumVCOwner enumVCOwner,
                           String userEmail,
                           String fullname,
                           String nomenclature,
                           String labelDossier,
                           Long idUserResponsible,
                           ZonedDateTime sharedDate) {
        this.id = id;
        this.affaireId = affaireId;
        this.userId = userId;
        this.vcKey = vcKey;
        this.vcKeyItem = new ItemStringDto(vcKey, vcKey);
        this.enumVCOwner = enumVCOwner;
        this.userEmail = userEmail;
        this.fullname = fullname;
        this.nomenclature = nomenclature;
        this.labelDossier = labelDossier;
        this.idUserResponsible = idUserResponsible;
        this.sharedDate = sharedDate;
    }
}
