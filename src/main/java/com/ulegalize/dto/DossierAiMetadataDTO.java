package com.ulegalize.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DossierAiMetadataDTO implements Serializable {
    private Boolean reviewed;

    private String aiProvider;

    private String model;

    private List<String> generatedFields;
}
