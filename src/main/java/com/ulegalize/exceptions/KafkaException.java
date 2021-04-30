package com.ulegalize.exceptions;

public class KafkaException extends Exception {

  public KafkaException() {
    super();
  }

  public KafkaException(String error) {
    super(error);
  }
}
