package com.ulegalize;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ulegalize.dto.payment.ActivePaymentEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SimpleKafkaObjectTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserializationWithRecord() throws Exception {
        ActivePaymentEvent event = new ActivePaymentEvent("MYVC", true, false, true);
        SimpleKafkaObject<ActivePaymentEvent> simpleKafkaObject = new SimpleKafkaObject<>(
            1L, "VC", "test@test.com", "username", event
        );

        String json = objectMapper.writeValueAsString(simpleKafkaObject);

        // SimpleKafkaObject does NOT have @JsonTypeInfo, so @class should NOT be present
        assertFalse(json.contains("\"@class\""));

        // When deserializing, we need to provide the full type information
        SimpleKafkaObject<ActivePaymentEvent> result = objectMapper.readValue(
            json, new TypeReference<SimpleKafkaObject<ActivePaymentEvent>>() {}
        );

        assertEquals(event, result.getPayload());
        assertEquals(1L, result.getUserId());
    }
}
