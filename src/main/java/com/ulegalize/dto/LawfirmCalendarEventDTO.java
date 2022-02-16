package com.ulegalize.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ulegalize.AbstractRestObject;
import com.ulegalize.enumeration.EnumCalendarEventType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class LawfirmCalendarEventDTO extends AbstractRestObject implements Serializable {

    private Long id;
    private EnumCalendarEventType eventType = EnumCalendarEventType.PERM;
    private ItemEventDto eventTypeItem = new ItemEventDto(EnumCalendarEventType.PERM.getCode(), "", EnumCalendarEventType.PERM.getColor());

    @Deprecated
    private DossierDTO dossier;
    @Deprecated
    private ContactSummary contact;

    @JsonProperty("dossier_id")
    private Long dossierId;
    private ItemLongDto dossierItem;

    @JsonProperty("contact_id")
    private Long contactId;
    private ItemLongDto contactItem;

    private List<String> participantsEmail;
    private List<ItemStringDto> participantsEmailItem;


    @JsonProperty("user_id")
    private Long userId;
    private ItemLongDto userItem;

    private boolean approved;

    private String title;
    private String note;
    private String location;
    private String color;
    private boolean allDay;
    private Date start;
    private Date end;
    private String pathFile;
    private String microText;
    private String audioText;
    private boolean speechToTextActivated = false;

    private boolean roomAttached;
    private String urlRoom;

    public LawfirmCalendarEventDTO() {

    }

}
