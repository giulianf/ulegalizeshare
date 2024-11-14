package com.ulegalize.dto;

import com.ulegalize.dto.template.CompleteDossierDTO;
import com.ulegalize.enumeration.EnumDossierContactType;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompleteDossierDTOTest {
    @Test
    public void testDefaultConstructor() {
        CompleteDossierDTO dto = new CompleteDossierDTO();
        // Count the number of List fields in CompleteDossierDTO
        int listCount = 0;

        // Get all fields of the CompleteDossierDTO class
        Field[] fields = CompleteDossierDTO.class.getDeclaredFields();

        for (Field field : fields) {
            // Check if the field is a List type
            if (List.class.isAssignableFrom(field.getType())) {
                listCount++;
            }
        }

        // Assert the expected number of List fields
        int expectedListCount = EnumDossierContactType.values().length; // Update this to the actual expected count
        assertEquals(expectedListCount, listCount, "The number of List fields in CompleteDossierDTO does not match the expected count.");

    }

}
