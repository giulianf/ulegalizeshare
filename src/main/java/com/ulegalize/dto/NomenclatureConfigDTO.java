package com.ulegalize.dto;

import lombok.Data;

@Data
public class NomenclatureConfigDTO {
    private Long vcNomenclature;
    private String vcKey, description, parameter;

    public NomenclatureConfigDTO() {
    }

    public NomenclatureConfigDTO(Long vcNomenclature, String vcKey, String description, String parameter) {
        this.vcNomenclature = vcNomenclature;
        this.vcKey = vcKey;
        this.description = description;
        this.parameter = parameter;
    }
}

