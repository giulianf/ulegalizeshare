package com.ulegalize.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class ItemByteDto {
    @Getter
    @Setter
    private byte[] fileByte;
    @Getter
    @Setter
    private String filename;

}
