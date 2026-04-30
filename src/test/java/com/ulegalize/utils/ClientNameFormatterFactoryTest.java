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

        // Test with includeEmail = true
        String result = formatter.formatFullname("John", "Doe", "john.doe@example.com", null, null, null, true);
        assertEquals("John Doe (john.doe@example.com)", result);

        result = formatter.formatFullname("John", "Doe", null, null, null, null, true);
        assertEquals("John Doe", result);

        // Test with includeEmail = false
        result = formatter.formatFullname("John", "Doe", "john.doe@example.com", null, null, null, false);
        assertEquals("John Doe", result);
    }

    @Test
    @DisplayName("Test Factory for Company")
    void testFactoryForCompany() {
        ClientNameFormatter formatter = factory.getFormatter(EnumClientType.COMPANY);

        // Test with includeEmail = true (email should not affect company output)
        String result = formatter.formatFullname(null, null, null, "Acme Corp", "123 Business St", null, true);
        assertEquals("Acme Corp - 123 Business St", result);

        result = formatter.formatFullname(null, null, null, "Acme Corp", null, null, true);
        assertEquals("Acme Corp", result);

        // Test with includeEmail = false
        result = formatter.formatFullname(null, null, "contact@acme.com", "Acme Corp", "123 Business St", null, false);
        assertEquals("Acme Corp - 123 Business St", result);
    }

    @Test
    @DisplayName("Test Factory for Court")
    void testFactoryForCourt() {
        ClientNameFormatter formatter = factory.getFormatter(EnumClientType.COURT);

        // Test with includeEmail = true (email should not affect court output)
        String result = formatter.formatFullname(null, null, null, "Court of Justice", null, "District 1", true);
        assertEquals("Court of Justice - District 1", result);

        result = formatter.formatFullname(null, null, null, "Court of Justice", null, null, true);
        assertEquals("Court of Justice", result);

        // Test with includeEmail = false
        result = formatter.formatFullname(null, null, "court@example.com", "Court of Justice", null, "District 1", false);
        assertEquals("Court of Justice - District 1", result);
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

        // Test with includeEmail = true
        String result = formatter.formatFullname("Jane", "Smith", "jane.smith@example.com", null, null, null, true);
        assertEquals("Jane Smith (jane.smith@example.com)", result);

        result = formatter.formatFullname("Jane", "Smith", null, null, null, null, true);
        assertEquals("Jane Smith", result);

        // Test with includeEmail = false
        result = formatter.formatFullname("Jane", "Smith", "jane.smith@example.com", null, null, null, false);
        assertEquals("Jane Smith", result);
    }

    @Test
    @DisplayName("Test Edge Cases (Null and Empty Strings)")
    void testEdgeCases() {
        // NATURAL_PERSON with empty fields
        ClientNameFormatter formatter = factory.getFormatter(EnumClientType.NATURAL_PERSON);
        String result = formatter.formatFullname("", "", null, null, null, null, true);
        assertEquals("", result);

        result = formatter.formatFullname("", "", "email@test.com", null, null, null, false);
        assertEquals("", result);

        // COMPANY with empty fields
        formatter = factory.getFormatter(EnumClientType.COMPANY);
        result = formatter.formatFullname(null, null, null, "", "", null, true);
        assertEquals("", result);

        // COURT with empty fields
        formatter = factory.getFormatter(EnumClientType.COURT);
        result = formatter.formatFullname(null, null, null, "", null, "", true);
        assertEquals("", result);
    }
    @Test
    @DisplayName("Test formatFullname with includeEmail flag")
    void testFormatFullnameWithIncludeEmailFlag() {
        ClientNameFormatter formatter = factory.getFormatter(EnumClientType.NATURAL_PERSON);

        // Should include email when includeEmail is true
        String result = formatter.formatFullname("John", "Doe", "john.doe@example.com", null, null, null, true);
        assertEquals("John Doe (john.doe@example.com)", result);

        // Should NOT include email when includeEmail is false
        result = formatter.formatFullname("John", "Doe", "john.doe@example.com", null, null, null, false);
        assertEquals("John Doe", result);

        // Should NOT include email when email is null even if includeEmail is true
        result = formatter.formatFullname("John", "Doe", null, null, null, null, true);
        assertEquals("John Doe", result);
    }
}
