package com.ulegalize.dto.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InvoiceStatusEventTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserialization() throws Exception {
        InvoiceStatusEvent original = new InvoiceStatusEvent("MYVC", 12345L, "PROVIDER", "PAID");

        String json = objectMapper.writeValueAsString(original);

        assertTrue(json.contains("\"vcKey\":\"MYVC\""));
        assertTrue(json.contains("\"invoiceId\":12345"));
        assertTrue(json.contains("\"provider\":\"PROVIDER\""));
        assertTrue(json.contains("\"status\":\"PAID\""));

        InvoiceStatusEvent result = objectMapper.readValue(json, InvoiceStatusEvent.class);

        assertEquals(original, result);
    }
}
