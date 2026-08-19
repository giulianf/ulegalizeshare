package com.ulegalize.dto.events.payment;
public record ReportEvent(
    Long totalWorkspace,
    Long totalUser,
    Long newTotalUserWeek
) {}
