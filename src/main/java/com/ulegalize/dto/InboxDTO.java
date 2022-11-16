package com.ulegalize.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * The type Inbox dto.
 */
@Data
@AllArgsConstructor
public class InboxDTO {


    /**
     * The Id.
     */
    private String id;
    /**
     * The Filename.
     */
    private String filename;
    /**
     * The Rec date.
     */
    private Date recDate;

    /**
     * Instantiates a new Inbox dto.
     */
    public InboxDTO() {
    }


}
