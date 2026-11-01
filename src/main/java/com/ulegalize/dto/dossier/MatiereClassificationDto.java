package com.ulegalize.dto.dossier;

import java.util.List;

public record MatiereClassificationDto(
    Long id,
    String description,
    String typeCode,
    List<RubriqueClassificationDto> rubriques
) {}
