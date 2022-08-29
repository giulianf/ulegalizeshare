package com.ulegalize.dto;

import lombok.Data;

@Data
public class NomenclatureConfigDTO {
    private Long vcNomenclature;
    private String vcKey, label, parameter;

    public NomenclatureConfigDTO() {
    }

    public NomenclatureConfigDTO(Long vcNomenclature, String vcKey, String label, String parameter) {
        this.vcNomenclature = vcNomenclature;
        this.vcKey = vcKey;
        this.label = label;
        this.parameter = parameter;
    }
}

