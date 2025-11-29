package com.ulegalize.dto;

import java.io.Serial;
import java.io.Serializable;

import lombok.Getter;

/**
 * The type Item string dto.
 */
public class ItemStringDto extends Item<String> implements Serializable {
  /**
   * serial
   */
  @Serial
  private static final long serialVersionUID = 1L;
  /**
   * The Is default.
   */
  @Getter
  private String isDefault;

  /**
   * Instantiates a new Item string dto.
   */
  public ItemStringDto() {
    super("", "");
  }


  /**
   * Instantiates a new Item string dto.
   *
   * @param value the value
   * @param label the label
   */
  public ItemStringDto(String value, String label) {
    super(value, label);
  }
  /**
   * Instantiates a new Item String dto.
   *
   * @param value the value
   * @param label the label
   * @param extra the extra
   */
  public ItemStringDto(String value, String label, String extra) {
    super(value, label);

    this.isDefault = extra;
  }
}
