package com.ulegalize.dto.template;

import java.io.Serializable;

import com.ulegalize.enumeration.DriveType;

public record GenerateManagedReportDocumentDTO(

    String reportId,

    String dossierReference,
    String administre,

    String reportName,

    String driveFolderPath,

    String vcKey,

    Long userId,

    String summary,

    String answers,

    String prestations,
    String comments,

    DriveType driveType

) implements Serializable {
}
