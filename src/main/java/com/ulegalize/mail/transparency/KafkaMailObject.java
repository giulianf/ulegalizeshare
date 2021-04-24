package com.ulegalize.mail.transparency;

import com.ulegalize.security.UlegalizeToken;
import lombok.*;

import java.io.Serializable;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KafkaMailObject implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private UlegalizeToken ulegalizeToken;

    @Getter
    @Setter
    private Map<String, Object> context;


}