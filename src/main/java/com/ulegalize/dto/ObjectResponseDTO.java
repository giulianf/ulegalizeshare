package com.ulegalize.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ObjectResponseDTO {
    String id;
    String name;
    String url;
    String etag;
    Long size;
    Date lastModified;
    String container;

    public ObjectResponseDTO() {
    }

}
