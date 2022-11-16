package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * The type Share user affaire dto.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShareUserAffaireDTO implements Serializable {

    /**
     * The Affaire id.
     */
    private Long affaireId;
    /**
     * The User email.
     */
    private List<String> userEmail;

}
