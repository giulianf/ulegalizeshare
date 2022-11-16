package com.ulegalize.exceptions;

/**
 * The type Kafka exception.
 */
public class KafkaException extends Exception {

    /**
     * Instantiates a new Kafka exception.
     */
    public KafkaException() {
        super();
    }

    /**
     * Instantiates a new Kafka exception.
     *
     * @param error the error
     */
    public KafkaException(String error) {
        super(error);
    }
}
