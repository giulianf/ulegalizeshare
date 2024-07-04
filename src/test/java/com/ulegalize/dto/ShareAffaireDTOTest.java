package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumVCOwner;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ShareAffaireDTOTest {
    @Test
    public void testDefaultConstructor() {
        ShareAffaireDTO dto = new ShareAffaireDTO();
        assertNull(dto.getId());
        assertNull(dto.getIdUserResponsible());
        assertNull(dto.getNomenclature());
    }

    @Test
    public void testParameterizedConstructor() {
        Long id = 1L;
        Long affaireId = 2L;
        Long userId = 3L;
        String vcKey = "AV";
        EnumVCOwner enumVCOwner= EnumVCOwner.OWNER_VC;
        String userEmail = "test@ulegalize.com";
        String fullname = "";
        String nomenclature = "/ddd";
        Long idUserResponsible = 100L;
        ZonedDateTime sharedDate = ZonedDateTime.now();

        ShareAffaireDTO dto = new ShareAffaireDTO(id, affaireId, userId, vcKey, enumVCOwner, userEmail, fullname, nomenclature, idUserResponsible, sharedDate);
        assertEquals(userId, dto.getUserId());
        assertEquals(idUserResponsible, dto.getIdUserResponsible());
        assertEquals(id, dto.getId());
    }
}
