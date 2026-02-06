package com.ulegalize.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FactureManagerDTOTest {
    @Test
    public void testDefaultConstructor() {
        FactureManagerDTO dto = new FactureManagerDTO();
        assertNull(dto.getId());
        assertNull(dto.getFactureId());
        assertNull(dto.getValue());
    }

    @Test
    public void testParameterizedConstructor() {
        Long userId = 123L;
        String label = "Test Label";
        Long factureId = 456L;
        Long id = 789L;
        String avatarUrl = "avatarUrl";
        String initialesGestionnaire = "jt";

        FactureManagerDTO dto = new FactureManagerDTO(userId, label, factureId, id, avatarUrl, 1, initialesGestionnaire);
        assertEquals(userId, dto.getValue());
        assertEquals(factureId, dto.getFactureId());
        assertEquals(id, dto.getId());
    }
}
