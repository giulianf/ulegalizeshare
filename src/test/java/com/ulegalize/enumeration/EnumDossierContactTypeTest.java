package com.ulegalize.enumeration;

import com.ulegalize.dto.DossierManagerDTO;
import com.ulegalize.utils.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumDossierContactTypeTest {
    @Test
    public void testDefaultConstructor() {
        assertEquals(28, EnumDossierContactType.values().length);
    }

    @Test
    public void testTranslate_fr() {
        for (EnumDossierContactType enumDossierContactType : EnumDossierContactType.values()) {
            String labeLMatiere = Utils.getLabel(EnumLanguage.FR, enumDossierContactType.name(), null);
            assertNotNull(labeLMatiere);
        }
    }
    @Test
    public void testTranslate_en() {
        for (EnumDossierContactType enumDossierContactType : EnumDossierContactType.values()) {
            String labeLMatiere = Utils.getLabel(EnumLanguage.EN, enumDossierContactType.name(), null);
            assertNotNull(labeLMatiere);
        }
    }

    @Test
    public void testTranslate_de() {
        for (EnumDossierContactType enumDossierContactType : EnumDossierContactType.values()) {
            String labeLMatiere = Utils.getLabel(EnumLanguage.DE, enumDossierContactType.name(), null);
            assertNotNull(labeLMatiere);
        }
    }


    @Test
    public void testTranslate_nl() {
        for (EnumDossierContactType enumDossierContactType : EnumDossierContactType.values()) {
            String labeLMatiere = Utils.getLabel(EnumLanguage.NL, enumDossierContactType.name(), null);
            assertNotNull(labeLMatiere);
        }
    }

}
