package com.ulegalize.dto;

import lombok.Data;

/**
 * The type Nomenclature config dto.
 */
@Data
public class NomenclatureConfigDTO {
    /**
     * The Vc nomenclature.
     */
    private Long vcNomenclature;
    /**
     * The Vc key.
     */
    private String vcKey, /**
     * The Description.
     */
    description, /**
     * The Parameter.
     */
    parameter;

    /**
     * Instantiates a new Nomenclature config dto.
     */
    public NomenclatureConfigDTO() {
    }

    /**
     * Instantiates a new Nomenclature config dto.
     *
     * @param vcNomenclature the vc nomenclature
     * @param vcKey          the vc key
     * @param description    the description
     * @param parameter      the parameter
     */
    public NomenclatureConfigDTO(Long vcNomenclature, String vcKey, String description, String parameter) {
        this.vcNomenclature = vcNomenclature;
        this.vcKey = vcKey;
        this.description = description;
        this.parameter = parameter;
    }
}

