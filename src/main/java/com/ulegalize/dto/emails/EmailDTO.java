package com.ulegalize.dto.emails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * email dto
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDTO {
    /**
     * ext Id
     */
    private UUID extId;
    /**
     * ext Id format String
     */
    private String extIdString;
    /**
     * ext inbox id
     */
    private UUID extInboxId;
    /**
     * id
     */
    private String id;
    /**
     * from
     */
    private String from;
    /**
     * item from
     */
    private ItemEmailDTO itemFrom;
    /**
     * subject
     */
    private String subject;
    /**
     * created date
     */
    private ZonedDateTime createdDate;
    /**
     * attachement
     */
    private List<FileDTO> attachments = new ArrayList<>();
    /**
     * to
     */
    private List<String> to = new ArrayList<>();
    /**
     * bcc
     */
    private List<String> bcc = new ArrayList<>();
    /**
     * cc
     */
    private List<String> cc = new ArrayList<>();
    /**
     * body
     */
    private String body;
    /**
     * read
     */
    private Boolean read;
    /**
     * reply to
     */
    private String replyTo;
    /**
     * id dossier
     */
    private Long idDossier;
    /**
     * email type
     */
    private EnumEmailType emailType;
}
