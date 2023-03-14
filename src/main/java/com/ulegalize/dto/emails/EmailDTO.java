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
     * ext inbox id
     */
    private UUID extInboxId;
    /**
     * id
     */
    private String id;
    private String from;
    private ItemEmailDTO itemFrom;
    private String subject;
    private ZonedDateTime createdDate;
    private List<FileDTO> attachments = new ArrayList<>();
    private List<String> to = new ArrayList<>();
    private List<String> bcc = new ArrayList<>();
    private List<String> cc = new ArrayList<>();
    private String body;
    private Boolean read;
    private String replyTo;
    private Long idDossier;
    private EnumEmailType emailType;
}
