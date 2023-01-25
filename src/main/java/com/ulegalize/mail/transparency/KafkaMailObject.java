package com.ulegalize.mail.transparency;

import com.ulegalize.dto.ItemByteDto;
import com.ulegalize.enumeration.EnumLanguage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

/**
 * The type Kafka mail object.
 */
@NoArgsConstructor
@AllArgsConstructor
public class KafkaMailObject implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The Event id.
     */
    @Getter
    @Setter
    private String eventId;
    /**
     * The Enum mail template.
     */
    @Getter
    @Setter
    private EnumMailTemplate enumMailTemplate;
    /**
     * The Enum language.
     */
    @Getter
    @Setter
    private EnumLanguage enumLanguage;
    /**
     * The Template.
     */
    @Getter
    @Setter
    private String template;
    /**
     * The Subject.
     */
    @Getter
    @Setter
    private String subject;
    /**
     * The Location.
     */
    @Getter
    @Setter
    private String location;
    /**
     * The Context.
     */
    @Getter
    @Setter
    private Map<String, Object> context;

    /**
     * The Start.
     */
// start date of the event
    @Getter
    @Setter
    private ZonedDateTime start;
    /**
     * The End.
     */
// end date of the event
    @Getter
    @Setter
    private ZonedDateTime end;
    /**
     * The Organizer.
     */
// organizer of the event
    @Getter
    @Setter
    private String organizer;
    /**
     * The Room attached.
     */
// jitsi if the room must be link to the body of the event
    @Getter
    @Setter
    private Boolean roomAttached;
    /**
     * The Is moderator.
     */
    @Getter
    @Setter
    private Boolean isModerator = true;
    /**
     * The Url room.
     */
// jitsi : this is the url room
    @Getter
    @Setter
    private String urlRoom;
    /**
     * The File attached.
     */
// File attached to event or email
    @Getter
    @Setter
    private List<ItemByteDto> fileAttached;
    /**
     * The Attendees email.
     */
// participant of the event
    @Getter
    @Setter
    private List<String> attendeesEmail;

    /**
     * The Reply to.
     */
    @Getter
    @Setter
    private String replyTo;
    /**
     * html content
     */
    @Getter
    @Setter
    private String htmlContent;

    @Override
    public String toString() {
        return "KafkaMailObject{" +
                "eventId='" + eventId + '\'' +
                ", enumMailTemplate=" + enumMailTemplate +
                ", enumLanguage=" + enumLanguage +
                ", template='" + template + '\'' +
                ", subject='" + subject + '\'' +
                ", location='" + location + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", organizer='" + organizer + '\'' +
                ", roomAttached=" + roomAttached +
                ", isModerator=" + isModerator +
                ", urlRoom='" + urlRoom + '\'' +
                ", attendeesEmail=" + attendeesEmail +
                ", replyTo=" + replyTo +
                '}';
    }
}
