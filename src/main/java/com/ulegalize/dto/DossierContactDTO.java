package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Dossier contact dto.
 */
@Data
@NoArgsConstructor
public class DossierContactDTO {

    /**
     * The Client.
     */
    private ItemLongDto client;

    /**
     * The Client type.
     */
    private ItemDto clientType;

    /**
     * reference
     */
    private String reference;
}
