package com.ulegalize.dto.payment;

public record UserSubscriptionEvent(
    String vcKey,
    int totalUser
) {}
