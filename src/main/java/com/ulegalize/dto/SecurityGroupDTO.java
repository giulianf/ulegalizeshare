package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import com.ulegalize.enumeration.EnumSecurityAppGroups;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The type Security group dto.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SecurityGroupDTO extends AbstractRestObject {

    /**
     * The Id.
     */
// for security
    private Long id;
    /**
     * The Security group id.
     */
    private Long securityGroupId;
    /**
     * The Security group item.
     */
    private ItemLongDto securityGroupItem;
    /**
     * The Description.
     */
    private String description;
    /**
     * The App group.
     */
    private EnumSecurityAppGroups appGroup;
    /**
     * The Nb users.
     */
    private Integer nbUsers;


    /**
     * Instantiates a new Security group dto.
     */
    public SecurityGroupDTO() {
    }

}
