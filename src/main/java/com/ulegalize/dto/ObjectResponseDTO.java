package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * The type Object response dto.
 */
@Data
@NoArgsConstructor
public class ObjectResponseDTO implements Serializable {
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
    ZonedDateTime lastModified;
    /**
     * The Container.
     */
    String container;
    /**
     * full path if exist.
     */
    String fullPath;

}
