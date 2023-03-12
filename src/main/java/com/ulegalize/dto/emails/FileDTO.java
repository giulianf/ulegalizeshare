package com.ulegalize.dto.emails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileDTO implements Serializable {

    private byte[] file;
    private String fileName;
    private String id;
    private String drivePath;
}
