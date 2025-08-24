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
        EnumVCOwner enumVCOwner = EnumVCOwner.OWNER_VC;
        String userEmail = "test@ulegalize.com";
        String fullname = "John Doe";
        String nomenclature = "/ddd";
        String labelDossier = "Case Label";
        Long idUserResponsible = 100L;
        ZonedDateTime sharedDate = ZonedDateTime.now();

        ShareAffaireDTO dto = new ShareAffaireDTO(id, affaireId, userId, vcKey, enumVCOwner, userEmail, fullname, nomenclature, labelDossier, idUserResponsible, sharedDate);

        // Basic field assertions
        assertEquals(id, dto.getId());
        assertEquals(affaireId, dto.getAffaireId());
        assertEquals(userId, dto.getUserId());
        assertEquals(vcKey, dto.getVcKey());
        assertEquals(enumVCOwner, dto.getEnumVCOwner());
        assertEquals(userEmail, dto.getUserEmail());
        assertEquals(fullname, dto.getFullname());
        assertEquals(nomenclature, dto.getNomenclature());
        assertEquals(labelDossier, dto.getLabelDossier());
        assertEquals(idUserResponsible, dto.getIdUserResponsible());
        assertEquals(sharedDate, dto.getSharedDate());

        // vcKeyItem should be initialized with value and label equal to vcKey
        assertNotNull(dto.getVcKeyItem());
        assertEquals(vcKey, dto.getVcKeyItem().getValue());
        assertEquals(vcKey, dto.getVcKeyItem().getLabel());
    }
}
