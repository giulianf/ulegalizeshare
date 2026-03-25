package com.ulegalize.dto;

import lombok.Getter;

/**
 * The type Item long dto.
 */
public class ItemAvatarDto extends Item<Long> {
  /**
   * initial
   */
  @Getter
  private String initial;
  /**
   * initial
   */
  @Getter
  private String avatarUrl;

  /**
   * Instantiates a new Item long dto.
   */
  public ItemAvatarDto() {
    super(null, "");
  }

  /**
   * Instantiates a new Item long dto.
   *
   * @param value     the value
   * @param label     the label
   * @param initial   the initial
   * @param avatarUrl the avatarUrl
   */
  public ItemAvatarDto(Long value, String label, String initial, String avatarUrl) {
    super(value, label);

    this.initial = initial;
    this.avatarUrl = avatarUrl;
  }

}
