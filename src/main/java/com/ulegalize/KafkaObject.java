package com.ulegalize;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.ulegalize.security.UlegalizeToken;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KafkaObject<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private UlegalizeToken ulegalizeToken;

    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
    private T objectTransfert;


    public T getObjectTransfert() {
        return objectTransfert;
    }

    public void setObjectTransfert(T objectTransfert) {
        this.objectTransfert = objectTransfert;
    }
}