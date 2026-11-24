package com.ulegalize;

import com.ulegalize.dto.events.payment.ActivePaymentEvent;
import org.junit.jupiter.api.Test;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.*;

class SimpleKafkaObjectTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void shouldSerializeAndDeserializeWithRecord() throws Exception {
        ActivePaymentEvent event = new ActivePaymentEvent(
            "MYVC",
            true,
            false,
            true,
            true
        );

        SimpleKafkaObject<ActivePaymentEvent> simpleKafkaObject =
            new SimpleKafkaObject<>(
                1L,
                "VC",
                "test@test.com",
                "username",
                event
            );

        String json = objectMapper.writeValueAsString(simpleKafkaObject);

        // Kafka wrapper must not contain Jackson type metadata.
        assertFalse(json.contains("\"@class\""));

        // Verify the AI entitlement is included in the Kafka payload.
        assertTrue(json.contains("\"activeAi\":true"));

        SimpleKafkaObject<ActivePaymentEvent> result =
            objectMapper.readValue(
                json,
                new TypeReference<SimpleKafkaObject<ActivePaymentEvent>>() {}
            );

        assertEquals(event, result.getPayload());
        assertTrue(result.getPayload().activeAi());
        assertEquals(1L, result.getUserId());
    }

    @Test
    void shouldDeserializeLegacyKafkaEventWithoutAiField() throws Exception {
        String legacyJson = """
            {
              "userId": 1,
              "payload": {
                "vcKey": "MYVC",
                "active": true,
                "activeEInvoice": false,
                "activeCnb": true
              }
            }
            """;

        SimpleKafkaObject<ActivePaymentEvent> result =
            objectMapper.readValue(
                legacyJson,
                new TypeReference<SimpleKafkaObject<ActivePaymentEvent>>() {}
            );

        assertNotNull(result.getPayload());
        assertEquals("MYVC", result.getPayload().vcKey());
        assertTrue(result.getPayload().active());
        assertFalse(result.getPayload().activeEInvoice());
        assertTrue(result.getPayload().activeCnb());
        assertFalse(result.getPayload().activeAi());
    }
}
