package com.ulegalize.dto.events.payment;

public record ActivePaymentEvent(
    String vcKey,
    boolean active,
    boolean activeEInvoice,
    boolean activeCnb
) {
}
