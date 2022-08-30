package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DossierContactDTO {

    private ItemDto client;

    private ItemDto clientType;
}
