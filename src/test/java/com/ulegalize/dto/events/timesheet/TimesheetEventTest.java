package com.ulegalize.dto.events.timesheet;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TimesheetEventTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserialization() throws Exception {
        TimesheetEvent original = new TimesheetEvent("VC-123", 456L, 789L);

        String json = objectMapper.writeValueAsString(original);

        assertTrue(json.contains("\"vcKey\":\"VC-123\""));
        assertTrue(json.contains("\"userId\":456"));
        assertTrue(json.contains("\"idTs\":789"));

        TimesheetEvent result = objectMapper.readValue(json, TimesheetEvent.class);

        assertEquals(original, result);
    }

    @Test
    public void testSerializationDeserializationWithNulls() throws Exception {
        TimesheetEvent original = new TimesheetEvent(null, null, null);

        String json = objectMapper.writeValueAsString(original);
        TimesheetEvent result = objectMapper.readValue(json, TimesheetEvent.class);

        assertEquals(original, result);
    }
}
