package com.ulegalize.dto.payment;

public record ActivePaymentEvent(
    String vcKey,
    boolean active,
    boolean activeEInvoice,
    boolean activeCnb
) {
}
