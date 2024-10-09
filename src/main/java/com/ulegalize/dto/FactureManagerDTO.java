package com.ulegalize.dto;

import lombok.Getter;

/**
 * The type Dossier manager dto.
 */
@Getter
public class FactureManagerDTO extends Item<Long> {
    /**
     * id
     */
    private Long id;
    /**
     * dossier id
     */
    private Long factureId;


    /**
     * Instantiates a new Item event dto.
     */
    public FactureManagerDTO() {
        super(null, "");
    }

    /**
     * Instantiates a new Item event dto.
     *
     * @param userId    the user id
     * @param label     the label
     * @param factureId the invoice Id
     * @param id        the dossier manager Id
     */
    public FactureManagerDTO(Long userId, String label, Long factureId, Long id) {
        super(userId, label);
        this.factureId = factureId;
        this.id = id;
    }
}
