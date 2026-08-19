package com.ulegalize.dto.events.payment;

public record UserSubscriptionEvent(
    String vcKey,
    int totalUser
) {}
