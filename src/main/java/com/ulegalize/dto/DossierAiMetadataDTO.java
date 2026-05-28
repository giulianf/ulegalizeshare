package com.ulegalize.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DossierAiMetadataDTO implements Serializable {

    private List<String> warnings;

    private List<String> missingFields;

    private List<String> importantClauses;

    private String suggestedNextAction;

    private Boolean reviewed;

    private String aiProvider;

    private String model;
}
