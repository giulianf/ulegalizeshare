package com.ulegalize;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.ulegalize.security.UlegalizeToken;
import lombok.*;

import java.io.Serializable;

/**
 * The type Kafka object.
 *
 * @param <T> the type parameter
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KafkaObject<T> implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The Ulegalize token.
     */
    @Getter
    @Setter
    private UlegalizeToken ulegalizeToken;
    /**
     * objectTransfert
     */
    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
    private T objectTransfert;


    /**
     * Gets object transfert.
     *
     * @return the object transfert
     */
    public T getObjectTransfert() {
        return objectTransfert;
    }

    /**
     * Sets object transfert.
     *
     * @param objectTransfert the object transfert
     */
    public void setObjectTransfert(T objectTransfert) {
        this.objectTransfert = objectTransfert;
    }
}