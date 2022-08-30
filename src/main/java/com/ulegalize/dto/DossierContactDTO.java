package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DossierContactDTO {

    private ItemLongDto client;

    private ItemDto clientType;
}
