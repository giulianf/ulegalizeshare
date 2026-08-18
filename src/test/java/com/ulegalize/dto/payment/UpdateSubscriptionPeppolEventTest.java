package com.ulegalize.dto.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UpdateSubscriptionPeppolEventTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserialization() throws Exception {
        UpdateSubscriptionPeppolEvent original = new UpdateSubscriptionPeppolEvent("MYVC", 5);

        String json = objectMapper.writeValueAsString(original);

        assertTrue(json.contains("\"vcKey\":\"MYVC\""));
        assertTrue(json.contains("\"einvoiceCount\":5"));

        UpdateSubscriptionPeppolEvent result = objectMapper.readValue(json, UpdateSubscriptionPeppolEvent.class);

        assertEquals(original, result);
    }
}
