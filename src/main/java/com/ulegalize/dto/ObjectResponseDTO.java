package com.ulegalize.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * The type Object response dto.
 */
@Data
@NoArgsConstructor
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
     * full path if exist.
     */
    String fullPath;

}
