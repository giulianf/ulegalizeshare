package com.ulegalize.dto.payment;

public record UpdateSubscriptionPeppolEvent(
    String vcKey,
    int einvoiceCount
) {}
