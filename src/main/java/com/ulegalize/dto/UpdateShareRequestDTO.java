package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class UpdateShareRequestDTO implements Serializable {
    private String vc_key;
    private Long id_doss;
    private Boolean all_member;
    private Long vcu_id;
}
