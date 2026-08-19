package com.ulegalize.dto.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ulegalize.dto.events.payment.LaPosteUpdateStatusEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LaPosteUpdateStatusEventTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserialization() throws Exception {
        LaPosteUpdateStatusEvent original = new LaPosteUpdateStatusEvent("EXT-123", "DELIVERED", 456L);

        String json = objectMapper.writeValueAsString(original);

        assertTrue(json.contains("\"extDocumentId\":\"EXT-123\""));
        assertTrue(json.contains("\"status\":\"DELIVERED\""));
        assertTrue(json.contains("\"customResourceId\":456"));

        LaPosteUpdateStatusEvent result = objectMapper.readValue(json, LaPosteUpdateStatusEvent.class);

        assertEquals(original, result);
    }

    @Test
    public void testSerializationDeserializationWithNulls() throws Exception {
        LaPosteUpdateStatusEvent original = new LaPosteUpdateStatusEvent("EXT-123", "PENDING", null);

        String json = objectMapper.writeValueAsString(original);

        assertTrue(json.contains("\"extDocumentId\":\"EXT-123\""));
        assertTrue(json.contains("\"status\":\"PENDING\""));
        // Depending on Jackson configuration, null might be present as null or absent.
        // But readValue should handle it either way.

        LaPosteUpdateStatusEvent result = objectMapper.readValue(json, LaPosteUpdateStatusEvent.class);

        assertEquals(original, result);
    }
}
