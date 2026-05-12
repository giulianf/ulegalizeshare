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
    @Getter
    @Setter
    private T objectTransfert;
}
