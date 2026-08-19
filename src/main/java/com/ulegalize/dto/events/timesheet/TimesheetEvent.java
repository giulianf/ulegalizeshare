package com.ulegalize.dto.events.timesheet;

public record TimesheetEvent(
    String vcKey,
    Long userId,
    Long idTs
) {}
