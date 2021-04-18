package com.ulegalize;

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
    @Getter
    @Setter
    private T objectTransfert;


}