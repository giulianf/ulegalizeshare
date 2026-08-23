package com.ulegalize.dto.calendar;

public record TaskAssigneeDTO(
    Long id,
    String fullName,
    String initials,
    String avatarUrl
) {}
