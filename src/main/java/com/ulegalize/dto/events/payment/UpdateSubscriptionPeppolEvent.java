package com.ulegalize.dto.events.payment;

public record UpdateSubscriptionPeppolEvent(
    String vcKey,
    int einvoiceCount
) {}
