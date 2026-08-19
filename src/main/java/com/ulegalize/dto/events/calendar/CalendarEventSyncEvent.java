package com.ulegalize.dto.events.calendar;

public record CalendarEventSyncEvent(
    Long eventId,
    String msEventId
) {}
