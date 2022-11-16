package com.ulegalize.dto;

import lombok.Data;

import java.util.Date;

/**
 * The type Object response dto.
 */
@Data
public class ObjectResponseDTO {
    /**
     * The Id.
     */
    String id;
    /**
     * The Name.
     */
    String name;
    /**
     * The Url.
     */
    String url;
    /**
     * The Etag.
     */
    String etag;
    /**
     * The Size.
     */
    Long size;
    /**
     * The Last modified.
     */
    Date lastModified;
    /**
     * The Container.
     */
    String container;

    /**
     * Instantiates a new Object response dto.
     */
    public ObjectResponseDTO() {
    }

}
