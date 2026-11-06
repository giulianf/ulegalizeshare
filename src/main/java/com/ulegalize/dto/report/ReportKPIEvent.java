package com.ulegalize.dto.report;

import java.time.Instant;
import java.util.Map;

public record ReportKPIEvent(
    Instant generatedAt,

    // Workspaces
    Long totalWorkspace,
    Long newWorkspaceWeek,

    // Users
    Long totalUser,
    Long newTotalUserWeek,
    Long verifiedUsers,

    // Engagement
    Long activeUsers7Days,
    Long activeUsers30Days,

    // Acquisition
    Map<String, Long> usersByClientFrom
) {
}
