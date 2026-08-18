package com.ulegalize.dto.payment;

public record LaPosteUpdateStatusEvent(
    String extDocumentId,
    String status,
    String customResourceId
) {}
