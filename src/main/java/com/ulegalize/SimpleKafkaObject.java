package com.ulegalize;

import java.io.Serializable;

import com.ulegalize.security.UlegalizeToken;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SimpleKafkaObject<T> implements Serializable {

  private UlegalizeToken ulegalizeToken;

  private T payload;
}
