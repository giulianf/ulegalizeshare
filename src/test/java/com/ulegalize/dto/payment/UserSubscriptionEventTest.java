package com.ulegalize.dto.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ulegalize.dto.events.payment.UserSubscriptionEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserSubscriptionEventTest {

  private final ObjectMapper objectMapper = new ObjectMapper();

  @Test
  public void testSerializationDeserialization() throws Exception {
    UserSubscriptionEvent original = new UserSubscriptionEvent("MYVC", 10);

    String json = objectMapper.writeValueAsString(original);

    assertTrue(json.contains("\"vcKey\":\"MYVC\""));
    assertTrue(json.contains("\"totalUser\":10"));

    UserSubscriptionEvent result = objectMapper.readValue(json, UserSubscriptionEvent.class);

    assertEquals(original, result);
  }
}
