package com.ulegalize.exceptions;

/**
 * The type Kafka no retry exception.
 */
public class KafkaNoRetryException extends RuntimeException {

    /**
     * Instantiates a new Kafka no retry exception.
     */
    public KafkaNoRetryException() {
        super();
    }

    /**
     * Instantiates a new Kafka no retry exception.
     *
     * @param error the error
     */
    public KafkaNoRetryException(String error) {
        super(error);
    }
}
