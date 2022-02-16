package com.ulegalize.mail.transparency;

import com.ulegalize.dto.ItemByteDto;
import com.ulegalize.enumeration.EnumLanguage;
import lombok.*;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KafkaMailObject implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private String eventId;
    @Getter
    @Setter
    private EnumMailTemplate enumMailTemplate;
    @Getter
    @Setter
    private EnumLanguage enumLanguage;
    @Getter
    @Setter
    private String template;
    @Getter
    @Setter
    private String subject;
    @Getter
    @Setter
    private String location;
    @Getter
    @Setter
    private Map<String, Object> context;

    // start date of the event
    @Getter
    @Setter
    private ZonedDateTime start;
    // end date of the event
    @Getter
    @Setter
    private ZonedDateTime end;
    // organizer of the event
    @Getter
    @Setter
    private String organizer;
    // jitsi if the room must be link to the body of the event
    @Getter
    @Setter
    private Boolean roomAttached;
    @Getter
    @Setter
    private Boolean isModerator = true;
    // jitsi : this is the url room
    @Getter
    @Setter
    private String urlRoom;
    // File attached to event or email
    @Getter
    @Setter
    private List<ItemByteDto> fileAttached;
    // participant of the event
    @Getter
    @Setter
    private List<String> attendeesEmail;
}