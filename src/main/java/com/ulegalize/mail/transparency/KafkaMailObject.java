package com.ulegalize.mail.transparency;

import com.ulegalize.enumeration.EnumLanguage;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
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
    private Map<String, Object> context;

    // use for ics
    @Getter
    @Setter
    private LocalDateTime start;
    @Getter
    @Setter
    private LocalDateTime end;
    @Getter
    @Setter
    private String organizer;


}