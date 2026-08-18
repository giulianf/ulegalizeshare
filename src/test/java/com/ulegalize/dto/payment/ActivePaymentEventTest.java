package com.ulegalize.dto.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ActivePaymentEventTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserialization() throws Exception {
        ActivePaymentEvent original = new ActivePaymentEvent("MYVC", true, false, true);

        String json = objectMapper.writeValueAsString(original);

        assertTrue(json.contains("\"vcKey\":\"MYVC\""));
        assertTrue(json.contains("\"active\":true"));
        assertTrue(json.contains("\"activeEInvoice\":false"));
        assertTrue(json.contains("\"activeCnb\":true"));

        ActivePaymentEvent result = objectMapper.readValue(json, ActivePaymentEvent.class);

        assertEquals(original, result);
    }
}
