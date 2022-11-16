package com.ulegalize.dto;

import lombok.Data;

import java.util.List;

/**
 * The type Share file dto.
 */
@Data
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

    /**
     * Instantiates a new Share file dto.
     */
    public ShareFileDTO() {
    }

}
