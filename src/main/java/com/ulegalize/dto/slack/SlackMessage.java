package com.ulegalize.dto.slack;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * The type Slack message.
 */
@AllArgsConstructor
@Builder(builderClassName = "Builder")
@Data
public class SlackMessage implements Serializable {

    /**
     * The Username.
     */
    private String username;
    /**
     * The Text.
     */
    private String text;
    /**
     * The Icon emoji.
     */
    private String icon_emoji;
    /**
     * The Attachments.
     */
    private List<Attachment> attachments;
}