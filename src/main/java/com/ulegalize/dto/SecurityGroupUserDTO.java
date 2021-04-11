package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SecurityGroupUserDTO extends AbstractRestObject {

    // for security
    List<ItemLongDto> securityGroupDTOList = new ArrayList<>();
    private Long id;
    private Long userId;
    private Long securityGroupId;
    private ItemLongDto securityGroupItem;
    private Integer roleId;
    private String description;
    private Integer nbUsers;
    private byte[] picture;
    private String fullName;
    private String email;
    private ItemStringDto userEmailItem;
    private Integer functionId;
    private ItemDto functionIdItem;
    private boolean shareDossier;
    private boolean isValid;


    public SecurityGroupUserDTO() {
    }

}
