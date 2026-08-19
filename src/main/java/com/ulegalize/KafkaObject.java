package com.ulegalize;

import java.io.Serializable;

import com.ulegalize.security.UlegalizeToken;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
