package com.ulegalize;

import java.io.Serializable;

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
  private Long userId;

  private String vcKey;

  private String email;

  private T payload;
}
