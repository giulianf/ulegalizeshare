package com.ulegalize.dto.drive;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileResponse {
    String contentType;
    String name;
    String binary;
}
