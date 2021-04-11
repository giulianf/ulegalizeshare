package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import com.ulegalize.enumeration.EnumSecurityAppGroups;
import lombok.Data;

@Data
public class SecurityGroupDTO extends AbstractRestObject {

    // for security
    private Long id;
    private Long securityGroupId;
    private ItemLongDto securityGroupItem;
    private String description;
    private EnumSecurityAppGroups appGroup;
    private Integer nbUsers;


    public SecurityGroupDTO() {
    }

}
