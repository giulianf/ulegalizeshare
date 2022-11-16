package com.ulegalize.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * The type App metadata.
 */
public class AppMetadata {
    /**
     * Instantiates a new App metadata.
     */
    public AppMetadata() {
    }

    /**
     * The Signedup submitted.
     */
    @Getter
    @Setter
    private Boolean signedup_submitted;
    /**
     * The Signedup submitted portal.
     */
    @Getter
    @Setter
    private Boolean signedup_submitted_portal;
    /**
     * The Kpi access.
     */
    @Getter
    @Setter
    private Boolean kpi_access;
    /**
     * The Vc key.
     */
    @Getter
    @Setter
    private String vcKey;
}
