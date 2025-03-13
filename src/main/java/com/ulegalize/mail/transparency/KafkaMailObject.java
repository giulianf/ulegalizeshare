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
@Getter
@Setter
public class KafkaMailObject implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The Event id.
     */
    private String eventId;
    /**
     * The Enum mail template.
     */
    private EnumMailTemplate enumMailTemplate;
    /**
     * The Enum language.
     */
    private EnumLanguage enumLanguage;
    /**
     * The Template.
     */
    private String template;
    /**
     * The Subject.
     */
    private String subject;
    /**
     * The Location.
     */
    private String location;
    /**
     * The Context.
     */
    private Map<String, Object> context;

    /**
     * The Start.
     */
// start date of the event
    private ZonedDateTime start;
    /**
     * The End.
     */
// end date of the event
    private ZonedDateTime end;
    /**
     * The Organizer.
     */
// organizer of the event
    private String organizer;
    /**
     * The Room attached.
     */
// jitsi if the room must be link to the body of the event
    private Boolean roomAttached;
    /**
     * The Is moderator.
     */
    private Boolean isModerator = true;
    /**
     * The Url room.
     */
// jitsi : this is the url room
    private String urlRoom;
    /**
     * The File attached.
     */
// File attached to event or email
    private List<ItemByteDto> fileAttached;
    /**
     * The Attendees email.
     */
// participant of the event
    private List<String> attendeesEmail;

    /**
     * The Reply to.
     */
    private String replyTo;
    /**
     * html content
     */
    private String htmlContent;
    /**
     * color id
     */
    private String colorId;

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
                ", colorId=" + colorId +
                '}';
    }
}
