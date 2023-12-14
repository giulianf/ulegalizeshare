package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Dossier contact dto.
 */
@Data
@NoArgsConstructor
public class DossierManagerDTO {
    /**
     * id
     */
    private Long id;
    /**
     * dossier id
     */
    private Long dossierId;

    /**
     * The Client.
     */
    private ItemLongDto client;

}
