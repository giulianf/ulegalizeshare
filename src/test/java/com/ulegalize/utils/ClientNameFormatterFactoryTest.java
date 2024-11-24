package com.ulegalize.utils;

import com.ulegalize.enumeration.EnumClientType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClientNameFormatterFactoryTest {

    private final ClientNameFormatterFactory factory = new ClientNameFormatterFactory();

    @Test
    @DisplayName("Test Factory for Natural Person")
    void testFactoryForNaturalPerson() {
        ClientNameFormatter formatter = factory.getFormatter(EnumClientType.NATURAL_PERSON);

        String result = formatter.formatFullname("John", "Doe", "john.doe@example.com", null, null, null);
        assertEquals("John Doe (john.doe@example.com)", result);

        result = formatter.formatFullname("John", "Doe", null, null, null, null);
        assertEquals("John Doe", result);
    }

    @Test
    @DisplayName("Test Factory for Company")
    void testFactoryForCompany() {
        ClientNameFormatter formatter = factory.getFormatter(EnumClientType.COMPANY);

        String result = formatter.formatFullname(null, null, null, "Acme Corp", "123 Business St", null);
        assertEquals("Acme Corp - 123 Business St", result);

        result = formatter.formatFullname(null, null, null, "Acme Corp", null, null);
        assertEquals("Acme Corp", result);
    }

    @Test
    @DisplayName("Test Factory for Court")
    void testFactoryForCourt() {
        ClientNameFormatter formatter = factory.getFormatter(EnumClientType.COURT);

        String result = formatter.formatFullname(null, null, null, "Court of Justice", null, "District 1");
        assertEquals("Court of Justice - District 1", result);

        result = formatter.formatFullname(null, null, null, "Court of Justice", null, null);
        assertEquals("Court of Justice", result);
    }

    @Test
    @DisplayName("Test Factory with Invalid Client Type")
    void testFactoryWithInvalidClientType() {
        assertThrows(IllegalArgumentException.class, () -> factory.getFormatter(null));
    }

    @Test
    @DisplayName("Test Factory for Colleague (Alias of Natural Person)")
    void testFactoryForColleague() {
        ClientNameFormatter formatter = factory.getFormatter(EnumClientType.COLLEGUE);

        String result = formatter.formatFullname("Jane", "Smith", "jane.smith@example.com", null, null, null);
        assertEquals("Jane Smith (jane.smith@example.com)", result);

        result = formatter.formatFullname("Jane", "Smith", null, null, null, null);
        assertEquals("Jane Smith", result);
    }

    @Test
    @DisplayName("Test Edge Cases (Null and Empty Strings)")
    void testEdgeCases() {
        // NATURAL_PERSON with empty fields
        ClientNameFormatter formatter = factory.getFormatter(EnumClientType.NATURAL_PERSON);
        String result = formatter.formatFullname("", "", null, null, null, null);
        assertEquals("", result);

        // COMPANY with empty fields
        formatter = factory.getFormatter(EnumClientType.COMPANY);
        result = formatter.formatFullname(null, null, null, "", "", null);
        assertEquals("", result);

        // COURT with empty fields
        formatter = factory.getFormatter(EnumClientType.COURT);
        result = formatter.formatFullname(null, null, null, "", null, "");
        assertEquals("", result);
    }
}
