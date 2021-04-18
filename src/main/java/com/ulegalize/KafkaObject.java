package com.ulegalize;

import com.ulegalize.security.LawfirmToken;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KafkaObject<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private LawfirmToken lawfirmToken;
    @Getter
    @Setter
    private T objectTransfert;


}