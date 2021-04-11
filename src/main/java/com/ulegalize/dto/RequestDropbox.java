package com.ulegalize.dto;

import lombok.Data;

@Data
public class RequestDropbox {
    String path;
    String newPath;

    public RequestDropbox() {
    }

}
