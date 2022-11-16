package com.ulegalize.dto.slack;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * The type Attachment.
 */
@AllArgsConstructor
@Builder(builderClassName = "Builder")
@Data
public class Attachment implements Serializable {

    /**
     * The Color.
     */
    private String color;
    /**
     * The Fields.
     */
    private List<Fields> fields;
}