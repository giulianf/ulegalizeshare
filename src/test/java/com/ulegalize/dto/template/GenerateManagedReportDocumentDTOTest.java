package com.ulegalize.dto.template;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GenerateManagedReportDocumentDTOTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserialization() throws Exception {
        GenerateManagedReportDocumentDTO dto = new GenerateManagedReportDocumentDTO(
            "report-123",
            456L,
            "reportName",
            "driveFolderPath",
            "vcKey",
            789L,
            "summary",
            "answers",
            "prestations"
        );

        String json = objectMapper.writeValueAsString(dto);

        assertTrue(json.contains("\"reportId\":\"report-123\""));
        assertTrue(json.contains("\"dossierId\":456"));
        assertTrue(json.contains("\"reportName\":\"reportName\""));
        assertTrue(json.contains("\"driveFolderPath\":\"driveFolderPath\""));
        assertTrue(json.contains("\"vcKey\":\"vcKey\""));
        assertTrue(json.contains("\"userId\":789"));
        assertTrue(json.contains("\"summary\":\"summary\""));
        assertTrue(json.contains("\"answers\":\"answers\""));
        assertTrue(json.contains("\"prestations\":\"prestations\""));

        GenerateManagedReportDocumentDTO deserialized = objectMapper.readValue(json, GenerateManagedReportDocumentDTO.class);

        assertEquals(dto, deserialized);
        assertEquals(dto.reportId(), deserialized.reportId());
        assertEquals(dto.dossierId(), deserialized.dossierId());
        assertEquals(dto.reportName(), deserialized.reportName());
        assertEquals(dto.driveFolderPath(), deserialized.driveFolderPath());
        assertEquals(dto.vcKey(), deserialized.vcKey());
        assertEquals(dto.userId(), deserialized.userId());
        assertEquals(dto.summary(), deserialized.summary());
        assertEquals(dto.answers(), deserialized.answers());
        assertEquals(dto.prestations(), deserialized.prestations());
    }

    @Test
    public void testSerializationDeserializationWithNullFields() throws Exception {
        GenerateManagedReportDocumentDTO dto = new GenerateManagedReportDocumentDTO(
            "report-123",
            null,
            "reportName",
            null,
            "vcKey",
            null,
            null,
            null,
            null
        );

        String json = objectMapper.writeValueAsString(dto);
        GenerateManagedReportDocumentDTO deserialized = objectMapper.readValue(json, GenerateManagedReportDocumentDTO.class);

        assertEquals(dto, deserialized);
    }
}
