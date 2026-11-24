package com.ulegalize.dto.payment;

import com.ulegalize.dto.events.payment.ActivePaymentEvent;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.*;

class ActivePaymentEventTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void shouldSerializeAndDeserialize() throws Exception {
        ActivePaymentEvent original = new ActivePaymentEvent(
            "MYVC",
            true,
            false,
            true,
            true
        );

        String json = objectMapper.writeValueAsString(original);

        assertTrue(json.contains("\"vcKey\":\"MYVC\""));
        assertTrue(json.contains("\"active\":true"));
        assertTrue(json.contains("\"activeEInvoice\":false"));
        assertTrue(json.contains("\"activeCnb\":true"));
        assertTrue(json.contains("\"activeAi\":true"));

        ActivePaymentEvent result =
            objectMapper.readValue(json, ActivePaymentEvent.class);

        assertEquals(original, result);
    }

    @Test
    void shouldDeserializeLegacyEventWithoutAiField() throws Exception {
        String legacyJson = """
            {
              "vcKey": "MYVC",
              "active": true,
              "activeEInvoice": false,
              "activeCnb": true
            }
            """;

        ActivePaymentEvent result =
            objectMapper.readValue(legacyJson, ActivePaymentEvent.class);

        assertEquals("MYVC", result.vcKey());
        assertTrue(result.active());
        assertFalse(result.activeEInvoice());
        assertTrue(result.activeCnb());
        assertFalse(result.activeAi());
    }

    @Test
    void shouldSerializeInactiveAiModule() throws Exception {
        ActivePaymentEvent original = new ActivePaymentEvent(
            "MYVC",
            true,
            true,
            false,
            false
        );

        String json = objectMapper.writeValueAsString(original);

        ActivePaymentEvent result =
            objectMapper.readValue(json, ActivePaymentEvent.class);

        assertFalse(result.activeAi());
        assertEquals(original, result);
    }
}
