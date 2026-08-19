package com.ulegalize.dto.events.payment;

import com.ulegalize.enumeration.InvoiceStatusProvider;

public record InvoiceStatusEvent(
    String vcKey,
    Long invoiceId,
    InvoiceStatusProvider provider,
    String status
) {}
