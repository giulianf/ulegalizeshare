package com.ulegalize.dto.emails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * file dto
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileDTO implements Serializable {

    /**
     * file list
     */
    private byte[] file;
    /**
     * file name
     */
    private String fileName;
    /**
     * id
     */
    private String id;
    /**
     * drive path
     */
    private String drivePath;
}
