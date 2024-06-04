package com.ulegalize.dto.drive;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileResponse {
    /**
     * content type
     */
    String contentType;
    /**
     * name
     */
    String name;
    /**
     * binary
     */
    String binary;
}
