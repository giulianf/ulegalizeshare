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

    // use for ics
    @Getter
    @Setter
    private ZonedDateTime start;
    @Getter
    @Setter
    private ZonedDateTime end;
    @Getter
    @Setter
    private String organizer;
    // jitsi
    @Getter
    @Setter
    private Boolean roomAttached;
    @Getter
    @Setter
    private Boolean isModerator;
    @Getter
    @Setter
    private String roomName;
    @Getter
    @Setter
    private List<ItemByteDto> fileAttached;
}