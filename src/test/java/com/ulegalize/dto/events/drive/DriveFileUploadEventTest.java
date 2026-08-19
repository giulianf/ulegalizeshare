package com.ulegalize.dto.events.drive;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DriveFileUploadEventTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserialization() throws Exception {
        DriveFileUploadEvent original = new DriveFileUploadEvent(
                "my-container",
                "base64-encoded-file-content",
                "document.pdf",
                "/shared/documents"
        );

        String json = objectMapper.writeValueAsString(original);

        assertTrue(json.contains("\"container\":\"my-container\""));
        assertTrue(json.contains("\"file\":\"base64-encoded-file-content\""));
        assertTrue(json.contains("\"filename\":\"document.pdf\""));
        assertTrue(json.contains("\"folderPathUri\":\"/shared/documents\""));

        DriveFileUploadEvent result = objectMapper.readValue(json, DriveFileUploadEvent.class);

        assertEquals(original, result);
    }

    @Test
    public void testSerializationDeserializationWithNulls() throws Exception {
        DriveFileUploadEvent original = new DriveFileUploadEvent(null, null, null, null);

        String json = objectMapper.writeValueAsString(original);
        DriveFileUploadEvent result = objectMapper.readValue(json, DriveFileUploadEvent.class);

        assertEquals(original, result);
    }
}
