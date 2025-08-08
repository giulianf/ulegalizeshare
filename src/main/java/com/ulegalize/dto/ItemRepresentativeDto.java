package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The type Item string dto.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemRepresentativeDto implements Serializable {
    private Long id;
    /**
     * representative quality
     */
    private String representativeQuality;
    /**
     * representative client name
     */
    private ItemLongDto representativeClientItem;

    private String representativeClientTitle;
    private String representativeClientFirstname;
    private String representativeClientLastname;

}
