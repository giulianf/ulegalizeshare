package com.ulegalize.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DossierManagerDTOTest {
    @Test
    public void testDefaultConstructor() {
        DossierManagerDTO dto = new DossierManagerDTO();
        assertNull(dto.getId());
        assertNull(dto.getDossierId());
        assertNull(dto.getValue());
    }

    @Test
    public void testParameterizedConstructor() {
        Long userId = 123L;
        String label = "Test Label";
        Long dossierId = 456L;
        Long id = 789L;
        String avatar = "avatar";
        Integer avatarVersion = 1;

        DossierManagerDTO dto = new DossierManagerDTO(userId, label, dossierId, id, avatar, avatarVersion);
        assertEquals(userId, dto.getValue());
        assertEquals(dossierId, dto.getDossierId());
        assertEquals(id, dto.getId());
    }
}
