package com.ulegalize.dto.events.drive;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ulegalize.enumeration.DriveType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DriveFilesEventTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserialization() throws Exception {
        DriveFilesEvent original = new DriveFilesEvent(List.of("/path1", "/path2"), "container", DriveType.openstack);

        String json = objectMapper.writeValueAsString(original);

        assertTrue(json.contains("\"paths\":[\"/path1\",\"/path2\"]"));
        assertTrue(json.contains("\"container\":\"container\""));
        assertTrue(json.contains("\"driveType\":\"openstack\""));

        DriveFilesEvent result = objectMapper.readValue(json, DriveFilesEvent.class);

        assertEquals(original, result);
    }

    @Test
    public void testSerializationDeserializationWithNulls() throws Exception {
        DriveFilesEvent original = new DriveFilesEvent(null, null, null);

        String json = objectMapper.writeValueAsString(original);
        DriveFilesEvent result = objectMapper.readValue(json, DriveFilesEvent.class);

        assertEquals(original, result);
    }
}
