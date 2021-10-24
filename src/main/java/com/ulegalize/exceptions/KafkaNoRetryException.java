package com.ulegalize.exceptions;

public class KafkaNoRetryException extends RuntimeException {

    public KafkaNoRetryException() {
        super();
    }

    public KafkaNoRetryException(String error) {
        super(error);
    }
}
