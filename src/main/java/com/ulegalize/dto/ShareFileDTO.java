package com.ulegalize.dto;

import lombok.Data;

import java.util.List;

@Data
public class ShareFileDTO {

    Long id;
    List<ItemStringDto> usersItem;
    List<Long> usersId;
    private String obj;
    private String msg;
    private int right = 0;
    private ItemDto rightItem;
    private Long size;
    private List<String> shared_with;

    public ShareFileDTO() {
    }

}
