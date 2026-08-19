package com.ulegalize.dto.events.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReportEventTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserialization() throws Exception {
        ReportEvent original = new ReportEvent(100L, 50L, 5L);

        String json = objectMapper.writeValueAsString(original);

        assertTrue(json.contains("\"totalWorkspace\":100"));
        assertTrue(json.contains("\"totalUser\":50"));
        assertTrue(json.contains("\"newTotalUserWeek\":5"));

        ReportEvent result = objectMapper.readValue(json, ReportEvent.class);

        assertEquals(original, result);
    }

    @Test
    public void testSerializationDeserializationWithNulls() throws Exception {
        ReportEvent original = new ReportEvent(null, null, null);

        String json = objectMapper.writeValueAsString(original);
        ReportEvent result = objectMapper.readValue(json, ReportEvent.class);

        assertEquals(original, result);
    }
}
