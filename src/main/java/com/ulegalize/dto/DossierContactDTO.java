package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The type Dossier contact dto.
 */
@Data
@NoArgsConstructor
public class DossierContactDTO implements Serializable {
    private static final long serialVersionUID = 1L;

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
    /**
     * quality
     */
    private String quality;
}
