package com.ulegalize.utils;

import com.ulegalize.enumeration.EnumLanguage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void testValidateEmail() {
        // Valid emails
        assertTrue(Utils.validateEmail("test@example.com"));
        assertTrue(Utils.validateEmail("user.name+tag@example.co.uk"));
        assertTrue(Utils.validateEmail("user@subdomain.example.com"));
        assertTrue(Utils.validateEmail("123456@example.com"));

        // Invalid emails
        assertFalse(Utils.validateEmail("invalid-email"));
        assertFalse(Utils.validateEmail("@example.com"));
        assertFalse(Utils.validateEmail("test@.com"));
        assertFalse(Utils.validateEmail("test@example..com"));
        assertFalse(Utils.validateEmail("test @example.com"));
        assertFalse(Utils.validateEmail(null));
    }

    @Test
    void testGetLabel() {
        // Test with default package and FR language
        assertEquals("Tribunal", Utils.getLabel(EnumLanguage.FR, "COURT", null));
        assertEquals("Personne physique", Utils.getLabel(EnumLanguage.FR, "NATURAL_PERSON", ""));

        // Test with default package and EN language
        assertEquals("Court", Utils.getLabel(EnumLanguage.EN, "COURT", null));
        assertEquals("Natural person", Utils.getLabel(EnumLanguage.EN, "NATURAL_PERSON", ""));

        // Test with null language
        assertEquals("", Utils.getLabel(null, "COURT", null));
    }
}
