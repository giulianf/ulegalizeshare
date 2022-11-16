package com.ulegalize.dto.slack;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * The type Fields.
 */
@AllArgsConstructor
@Builder(builderClassName = "Builder")
@Data
public class Fields implements Serializable {

    /**
     * The Title.
     */
    private String title;
    /**
     * The Value.
     */
    private String value;
}