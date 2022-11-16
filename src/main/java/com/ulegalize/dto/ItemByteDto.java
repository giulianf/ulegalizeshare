package com.ulegalize.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The type Item byte dto.
 */
@NoArgsConstructor
public class ItemByteDto {
    /**
     * The File byte.
     */
    @Getter
    @Setter
    private byte[] fileByte;
    /**
     * The Filename.
     */
    @Getter
    @Setter
    private String filename;

}
