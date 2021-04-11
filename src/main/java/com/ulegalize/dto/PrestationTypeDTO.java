package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrestationTypeDTO {

    private Integer idTs;
    private String vcKey;
    private String description;
    private String userUpd;
    private Date dateUpd;
    private boolean archived;

}
