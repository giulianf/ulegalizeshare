package com.ulegalize.dto.drive;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ulegalize.dto.events.drive.DriveFileEvent;
import com.ulegalize.enumeration.DriveType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DriveFileEventTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserialization() throws Exception {
        DriveFileEvent original = new DriveFileEvent("container", "/old/path", "/new/path", DriveType.openstack);

        String json = objectMapper.writeValueAsString(original);

        assertTrue(json.contains("\"container\":\"container\""));
        assertTrue(json.contains("\"path\":\"/old/path\""));
        assertTrue(json.contains("\"newPath\":\"/new/path\""));
        assertTrue(json.contains("\"driveType\":\"openstack\""));

        DriveFileEvent result = objectMapper.readValue(json, DriveFileEvent.class);

        assertEquals(original, result);
    }

    @Test
    public void testSerializationDeserializationWithNullEnum() throws Exception {
        DriveFileEvent original = new DriveFileEvent("container", "/old/path", "/new/path", null);

        String json = objectMapper.writeValueAsString(original);
        DriveFileEvent result = objectMapper.readValue(json, DriveFileEvent.class);

        assertEquals(original, result);
    }
}
