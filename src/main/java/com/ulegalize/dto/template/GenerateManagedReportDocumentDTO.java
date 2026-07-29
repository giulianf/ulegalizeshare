package com.ulegalize.dto.template;

import java.io.Serializable;

import com.ulegalize.enumeration.DriveType;

public record GenerateManagedReportDocumentDTO(

    String reportId,

    Long dossierId,

    String reportName,

    String driveFolderPath,

    String vcKey,

    Long userId,

    String summary,

    String answers,

    String prestations,

    DriveType driveType

) implements Serializable {
}
