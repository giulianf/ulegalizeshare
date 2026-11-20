package com.ulegalize.dto.drive;

import java.util.UUID;

import com.ulegalize.KafkaObject;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;
import com.ulegalize.dto.events.drive.DriveFileEvent;
import com.ulegalize.enumeration.DriveType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
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

        assertFalse(objectMapper.readTree(json).has("aiDocument"));

        DriveFileEvent result = objectMapper.readValue(json, DriveFileEvent.class);

        assertEquals(original, result);
    }

    @Test
    void readsExistingKafkaMessageWithoutAiMetadata() {
        String json = """
            {
              "ulegalizeToken": null,
              "objectTransfert": {
                "container": "workspace",
                "path": "%2Ffrom%2Ffile.pdf",
                "newPath": "%2Fto%2Ffile.pdf",
                "driveType": "onedrive"
              }
            }
            """;

        KafkaObject<DriveFileEvent> message = objectMapper.readValue(
            json, new TypeReference<KafkaObject<DriveFileEvent>>() {});

        DriveFileEvent event = message.getObjectTransfert();
        assertEquals(new DriveFileEvent("workspace", "%2Ffrom%2Ffile.pdf", "%2Fto%2Ffile.pdf", DriveType.onedrive), event);
        assertNull(event.aiDocument());
    }

    @Test
    void roundTripsAiMetadataInKafkaMessage() {
        UUID documentId = UUID.fromString("5f337155-1e9b-42cd-ab83-c751d104a877");
        var aiDocument = new DriveFileEvent.AiDocument(42L, documentId,
            ".ai/dossiers/42/documents/" + documentId + "/summary.txt", "provider-file-id", null, "model");
        var event = new DriveFileEvent("workspace", "%2Ffrom%2Ffile.pdf", "%2Fto%2Ffile.pdf", DriveType.gmail, aiDocument);

        String json = objectMapper.writeValueAsString(new KafkaObject<>(null, event));
        KafkaObject<DriveFileEvent> message = objectMapper.readValue(
            json, new TypeReference<KafkaObject<DriveFileEvent>>() {});

        assertEquals(documentId.toString(),
            objectMapper.readTree(json).path("objectTransfert").path("aiDocument").path("documentId").stringValue());
        assertEquals(event, message.getObjectTransfert());
    }

    @Test
    public void testSerializationDeserializationWithNullEnum() throws Exception {
        DriveFileEvent original = new DriveFileEvent("container", "/old/path", "/new/path", null);

        String json = objectMapper.writeValueAsString(original);
        DriveFileEvent result = objectMapper.readValue(json, DriveFileEvent.class);

        assertEquals(original, result);
    }
}
