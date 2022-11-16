package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * The type Update share request dto.
 */
@Data
@NoArgsConstructor
public class UpdateShareRequestDTO implements Serializable {
    /**
     * The Vc key.
     */
    private String vc_key;
    /**
     * The Id doss.
     */
    private Long id_doss;
    /**
     * The All member.
     */
    private Boolean all_member;
    /**
     * The Vcu id.
     */
    private Long vcu_id;
}
