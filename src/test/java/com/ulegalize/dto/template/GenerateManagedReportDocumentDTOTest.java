package com.ulegalize.dto.template;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ulegalize.enumeration.DriveType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GenerateManagedReportDocumentDTOTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserialization() throws Exception {
        GenerateManagedReportDocumentDTO dto = new GenerateManagedReportDocumentDTO(
            "report-123",
            "dossierReference",
            "administre",
            "reportName",
            "driveFolderPath",
            "vcKey",
            789L,
            "summary",
            "answers",
            "prestations",
            "comments",
            DriveType.openstack
        );

        String json = objectMapper.writeValueAsString(dto);

        assertTrue(json.contains("\"reportId\":\"report-123\""));
        assertTrue(json.contains("\"dossierReference\":\"dossierReference\""));
        assertTrue(json.contains("\"administre\":\"administre\""));
        assertTrue(json.contains("\"reportName\":\"reportName\""));
        assertTrue(json.contains("\"driveFolderPath\":\"driveFolderPath\""));
        assertTrue(json.contains("\"vcKey\":\"vcKey\""));
        assertTrue(json.contains("\"userId\":789"));
        assertTrue(json.contains("\"summary\":\"summary\""));
        assertTrue(json.contains("\"answers\":\"answers\""));
        assertTrue(json.contains("\"prestations\":\"prestations\""));
        assertTrue(json.contains("\"comments\":\"comments\""));
        assertTrue(json.contains("\"driveType\":\"openstack\""));

        GenerateManagedReportDocumentDTO deserialized = objectMapper.readValue(json, GenerateManagedReportDocumentDTO.class);

        assertEquals(dto, deserialized);
        assertEquals(dto.reportId(), deserialized.reportId());
        assertEquals(dto.dossierReference(), deserialized.dossierReference());
        assertEquals(dto.administre(), deserialized.administre());
        assertEquals(dto.reportName(), deserialized.reportName());
        assertEquals(dto.driveFolderPath(), deserialized.driveFolderPath());
        assertEquals(dto.vcKey(), deserialized.vcKey());
        assertEquals(dto.userId(), deserialized.userId());
        assertEquals(dto.summary(), deserialized.summary());
        assertEquals(dto.answers(), deserialized.answers());
        assertEquals(dto.prestations(), deserialized.prestations());
        assertEquals(dto.comments(), deserialized.comments());
        assertEquals(dto.driveType(), deserialized.driveType());
    }

    @Test
    public void testSerializationDeserializationWithNullFields() throws Exception {
        GenerateManagedReportDocumentDTO dto = new GenerateManagedReportDocumentDTO(
            "report-123",
            null,
            null,
            "reportName",
            null,
            "vcKey",
            null,
            null,
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
