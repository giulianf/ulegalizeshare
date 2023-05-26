package com.ulegalize.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ulegalize.AbstractRestObject;
import com.ulegalize.enumeration.EnumCalendarEventType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * The type Lawfirm calendar event dto.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LawfirmCalendarEventDTO extends AbstractRestObject implements Serializable {

    /**
     * The Id.
     */
    private Long id;
    /**
     * The Event type.
     */
    private EnumCalendarEventType eventType = EnumCalendarEventType.PERM;
    /**
     * The Event type item.
     */
    private ItemEventDto eventTypeItem = new ItemEventDto(EnumCalendarEventType.PERM.getCode(), "", EnumCalendarEventType.PERM.getColor());

    /**
     * The Dossier.
     */
    @Deprecated
    private DossierDTO dossier;
    /**
     * The Contact.
     */
    @Deprecated
    private ContactSummary contact;

    /**
     * The Dossier id.
     */
    @JsonProperty("dossier_id")
    private Long dossierId;
    /**
     * The Dossier item.
     */
    private ItemLongDto dossierItem;

    /**
     * The Contact id.
     */
    @JsonProperty("contact_id")
    private Long contactId;
    /**
     * The Contact item.
     */
    private ItemLongDto contactItem;

    /**
     * The Participants email.
     */
    private List<String> participantsEmail;
    /**
     * The Participants email item.
     */
    private List<ItemStringDto> participantsEmailItem;


    /**
     * The User id.
     */
    @JsonProperty("user_id")
    private Long userId;
    /**
     * The User id.
     */
    @JsonProperty("vc_key")
    private String vcKey;
    /**
     * The User item.
     */
    private ItemLongDto userItem;

    /**
     * The Approved.
     */
    private boolean approved;

    /**
     * The Title.
     */
    private String title;
    /**
     * The last Note.
     */
    private String note;
    /**
     * The Location.
     */
    private String location;
    /**
     * The Color.
     */
    private String color;
    /**
     * The All day.
     */
    private boolean allDay;
    /**
     * The Start.
     */
    private Date start;
    /**
     * The End.
     */
    private Date end;
    /**
     * The Path file.
     */
    private String pathFile;
    /**
     * The Micro text.
     */
    private String microText;
    /**
     * The Audio text.
     */
    private String audioText;
    /**
     * The Slot.
     */
    private int slot;
    /**
     * The Speech to text activated.
     */
    private boolean speechToTextActivated = false;

    /**
     * The Room attached.
     */
    private boolean roomAttached;
    /**
     * The Url room.
     */
    private String urlRoom;
    /**
     * The status of event.
     */
    private String calendarStatus;

    /**
     * Instantiates a new Lawfirm calendar event dto.
     */
    public LawfirmCalendarEventDTO() {

    }

}
