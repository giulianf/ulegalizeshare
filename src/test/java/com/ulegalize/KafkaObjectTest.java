package com.ulegalize;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ulegalize.dto.events.payment.ActivePaymentEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KafkaObjectTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void testSerializationDeserializationWithRecord() throws Exception {

        ActivePaymentEvent event =
            new ActivePaymentEvent("MYVC", true, false, true);

        KafkaObject<ActivePaymentEvent> kafkaObject =
            new KafkaObject<>();

        kafkaObject.setObjectTransfert(event);

        String json = objectMapper.writeValueAsString(kafkaObject);

        // No Java class metadata anymore
        assertFalse(json.contains("\"@class\""));

        assertTrue(json.contains("\"vcKey\":\"MYVC\""));

        KafkaObject<ActivePaymentEvent> deserialized =
            objectMapper.readValue(
                json,
                new TypeReference<KafkaObject<ActivePaymentEvent>>() {}
            );

        assertEquals(event, deserialized.getObjectTransfert());

        assertInstanceOf(
            ActivePaymentEvent.class,
            deserialized.getObjectTransfert()
        );
    }
}
