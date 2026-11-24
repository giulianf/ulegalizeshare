package com.ulegalize;

import com.ulegalize.dto.events.payment.ActivePaymentEvent;
import org.junit.jupiter.api.Test;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.*;

class KafkaObjectTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void testSerializationDeserializationWithRecord() throws Exception {

        ActivePaymentEvent event =
            new ActivePaymentEvent("MYVC", true, false, true, true);

        KafkaObject<ActivePaymentEvent> kafkaObject =
            new KafkaObject<>();

        kafkaObject.setObjectTransfert(event);

        String json = objectMapper.writeValueAsString(kafkaObject);

        // No Java class metadata
        assertFalse(json.contains("\"@class\""));

        assertTrue(json.contains("\"vcKey\":\"MYVC\""));
        assertTrue(json.contains("\"active\":true"));
        assertTrue(json.contains("\"activeEInvoice\":false"));
        assertTrue(json.contains("\"activeCnb\":true"));
        assertTrue(json.contains("\"activeAi\":true"));

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

        assertTrue(deserialized.getObjectTransfert().activeAi());
    }
}
