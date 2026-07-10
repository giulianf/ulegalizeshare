package com.ulegalize.dto.template;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ManagedReportGeneratedDTOTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserialization() throws Exception {
        ManagedReportGeneratedDTO dto = new ManagedReportGeneratedDTO(
            "report-123",
            "driveFileId-456",
            "driveFilePath",
            "fileName.pdf",
            true,
            null
        );

        String json = objectMapper.writeValueAsString(dto);

        assertTrue(json.contains("\"reportId\":\"report-123\""));
        assertTrue(json.contains("\"driveFileId\":\"driveFileId-456\""));
        assertTrue(json.contains("\"driveFilePath\":\"driveFilePath\""));
        assertTrue(json.contains("\"fileName\":\"fileName.pdf\""));
        assertTrue(json.contains("\"success\":true"));

        ManagedReportGeneratedDTO deserialized = objectMapper.readValue(json, ManagedReportGeneratedDTO.class);

        assertEquals(dto, deserialized);
        assertEquals(dto.reportId(), deserialized.reportId());
        assertEquals(dto.driveFileId(), deserialized.driveFileId());
        assertEquals(dto.driveFilePath(), deserialized.driveFilePath());
        assertEquals(dto.fileName(), deserialized.fileName());
        assertEquals(dto.success(), deserialized.success());
        assertEquals(dto.errorMessage(), deserialized.errorMessage());
    }

    @Test
    public void testSerializationDeserializationOnFailure() throws Exception {
        ManagedReportGeneratedDTO dto = new ManagedReportGeneratedDTO(
            "report-123",
            null,
            null,
            null,
            false,
            "Something went wrong"
        );

        String json = objectMapper.writeValueAsString(dto);
        ManagedReportGeneratedDTO deserialized = objectMapper.readValue(json, ManagedReportGeneratedDTO.class);

        assertEquals(dto, deserialized);
        assertEquals(dto.success(), deserialized.success());
        assertEquals(dto.errorMessage(), deserialized.errorMessage());
    }
}
