package com.ulegalize.dto;

import java.util.List;

import com.ulegalize.enumeration.DriveType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Share file dto.
 */
@Data
@NoArgsConstructor
public class ShareFileDTO {
  /**
   * The Id.
   */
  Long id;
  /**
   * The Users item.
   */
  List<ItemStringDto> usersItem;
  /**
   * The Users id.
   */
  List<Long> usersId;
  /**
   * The Obj.
   */
  private String obj;
  /**
   * The Msg.
   */
  private String msg;
  /**
   * The Right.
   */
  private int right = 0;
  /**
   * The Right item.
   */
  private ItemDto rightItem;
  /**
   * The Size.
   */
  private Long size;
  /**
   * The Shared with.
   */
  private List<String> shared_with;
  private boolean sendNotification;
  private String vcKey;
  private DriveType driveType;
}
