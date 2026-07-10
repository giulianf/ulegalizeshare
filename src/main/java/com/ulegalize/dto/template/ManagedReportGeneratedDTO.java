package com.ulegalize.dto.template;

import java.io.Serializable;

public record ManagedReportGeneratedDTO(

    String reportId,

    String driveFileId,

    String driveFilePath,

    String fileName,

    boolean success,

    String errorMessage

) implements Serializable {
}
