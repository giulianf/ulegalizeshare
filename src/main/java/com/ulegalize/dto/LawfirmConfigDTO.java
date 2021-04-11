package com.ulegalize.dto;

import lombok.Data;

@Data
public class LawfirmConfigDTO {
    private String vcKey, description, parameter;

    public LawfirmConfigDTO(){}
    public LawfirmConfigDTO(String vcKey, String description, String parameter) {
        this.vcKey = vcKey;
        this.description = description;
        this.parameter = parameter;
    }
}

