package com.ulegalize.dto.events.payment;

public record LaPosteUpdateStatusEvent(
    String extDocumentId,
    String status,
    Long customResourceId
) {}
