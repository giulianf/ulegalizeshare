package com.ulegalize.dto.calendar;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ulegalize.enumeration.calendar.EnumCalendarColor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TaskBoardDTO {
  private Long id;
  private String title;
  private String note;
  private Date start;
  private Date end;
  private EnumCalendarColor colorEvent;
  private Long statusId;
  private String statusLabel;
  private String dossierLabel;
  private List<TaskAssigneeDTO> assignees = new ArrayList<>();

  public TaskBoardDTO(
      Long id,
      String title,
      String note,
      Date start,
      Date end,
      EnumCalendarColor colorEvent,
      Long statusId,
      String statusLabel,
      String dossierLabel
  ) {
    this.id = id;
    this.title = title;
    this.note = note;
    this.start = start;
    this.end = end;
    this.colorEvent = colorEvent;
    this.statusId = statusId;
    this.statusLabel = statusLabel;
    this.dossierLabel = dossierLabel;
  }
  public String getColorHex() {
    return colorEvent != null ? colorEvent.getHtmlColor() : null;
  }
}
