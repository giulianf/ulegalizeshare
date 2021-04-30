package com.ulegalize.exceptions;

public class KafkaNoRetryException extends Exception {

    public KafkaNoRetryException() {
        super();
    }

    public KafkaNoRetryException(String error) {
        super(error);
    }
}
