package com.ulegalize.dto;

import lombok.Getter;

/**
 * The type Dossier manager dto.
 */
@Getter
public class DossierManagerDTO extends Item<Long> {
    /**
     * id
     */
    private Long id;
    /**
     * dossier id
     */
    private Long dossierId;

    private AvatarDTO avatar;


    /**
     * Instantiates a new Item event dto.
     */
    public DossierManagerDTO() {
        super(null, "");
    }

    /**
     * Instantiates a new Item event dto.
     *
     * @param userId    the user id
     * @param label     the label
     * @param dossierId the dossier Id
     * @param id        the dossier manager Id
     * @param initiales
     */
    public DossierManagerDTO(Long userId, String label, Long dossierId, Long id, String avatarUrl, Integer avatarVersion, String initiales) {
        super(userId, label);
        this.dossierId = dossierId;
        this.id = id;
        this.avatar = new AvatarDTO(userId, avatarVersion, avatarUrl, initiales);
    }
}
