package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShareUserAffaireDTO implements Serializable {

    private Long affaireId;
    private List<Long> userEmail;

}
