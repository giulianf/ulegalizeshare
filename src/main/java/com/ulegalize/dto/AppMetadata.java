package com.ulegalize.dto;

import lombok.Getter;
import lombok.Setter;
public class AppMetadata {
    public AppMetadata() {
    }

    @Getter
    @Setter
    private Boolean signedup_submitted;
    @Getter
    @Setter
    private Boolean signedup_submitted_portal;
    @Getter
    @Setter
    private Boolean kpi_access;
    @Getter
    @Setter
    private String vcKey;
}
