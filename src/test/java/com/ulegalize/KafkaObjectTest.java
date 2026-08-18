package com.ulegalize;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ulegalize.dto.payment.ActivePaymentEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KafkaObjectTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testSerializationDeserializationWithRecord() throws Exception {
        ActivePaymentEvent event = new ActivePaymentEvent("MYVC", true, false, true);
        KafkaObject<ActivePaymentEvent> kafkaObject = new KafkaObject<>();
        kafkaObject.setObjectTransfert(event);

        String json = objectMapper.writeValueAsString(kafkaObject);

        // Check that @class is present in the objectTransfert field
        assertTrue(json.contains("\"@class\":\"com.ulegalize.dto.payment.ActivePaymentEvent\""));
        assertTrue(json.contains("\"vcKey\":\"MYVC\""));

        // Deserialize back
        // Note: For generic type, we might need a TypeReference, but let's see how it behaves with plain class
        KafkaObject deserialized = objectMapper.readValue(json, KafkaObject.class);

        assertEquals(event, deserialized.getObjectTransfert());
    }
}
