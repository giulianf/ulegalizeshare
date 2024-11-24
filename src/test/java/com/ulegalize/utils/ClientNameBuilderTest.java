package com.ulegalize.utils;

import com.ulegalize.enumeration.EnumClientType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClientNameBuilderTest {

    @Test
    @DisplayName("Test Builder for Natural Person")
    void testBuilderForNaturalPerson() {
        String result = new ClientNameBuilder(EnumClientType.NATURAL_PERSON)
                .firstname("John")
                .lastname("Doe")
                .email("john.doe@example.com")
                .build();

        assertEquals("John Doe (john.doe@example.com)", result);

        result = new ClientNameBuilder(EnumClientType.NATURAL_PERSON)
                .firstname("John")
                .lastname("Doe")
                .build();

        assertEquals("John Doe", result);
    }

    @Test
    @DisplayName("Test Builder for Company")
    void testBuilderForCompany() {
        String result = new ClientNameBuilder(EnumClientType.COMPANY)
                .company("Acme Corp")
                .address("123 Business St")
                .build();

        assertEquals("Acme Corp - 123 Business St", result);
    }

    @Test
    @DisplayName("Test Builder for Court")
    void testBuilderForCourt() {
        String result = new ClientNameBuilder(EnumClientType.COURT)
                .company("Court of Justice")
                .district("District 1")
                .build();

        assertEquals("Court of Justice - District 1", result);
    }

    @Test
    @DisplayName("Test Builder with Missing Required Fields")
    void testBuilderWithMissingFields() {
        String result = new ClientNameBuilder(EnumClientType.COURT)
                .build();

        assertNull(result); // This depends on your implementation. Adjust if needed.
    }

    @Test
    @DisplayName("Test Builder for Colleague (Alias of Natural Person)")
    void testBuilderForColleague() {
        String result = new ClientNameBuilder(EnumClientType.COLLEGUE)
                .firstname("Jane")
                .lastname("Smith")
                .email("jane.smith@example.com")
                .build();

        assertEquals("Jane Smith (jane.smith@example.com)", result);
    }

    @Test
    @DisplayName("Test Builder for Edge Cases (Null and Empty Strings)")
    void testBuilderForEdgeCases() {
        String result = new ClientNameBuilder(EnumClientType.NATURAL_PERSON)
                .firstname("")
                .lastname("")
                .email(null)
                .build();

        assertEquals("", result); // Empty names result in a single space. Adjust if needed.

        result = new ClientNameBuilder(EnumClientType.COMPANY)
                .company("")
                .address("")
                .build();

        assertEquals("", result); // Adjust if empty fields should be handled differently.
    }
}
