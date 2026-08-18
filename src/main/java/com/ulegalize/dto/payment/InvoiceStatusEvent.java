package com.ulegalize.dto.payment;

public record InvoiceStatusEvent(
    String vcKey,
    Long invoiceId,
    String provider,
    String status
) {}
