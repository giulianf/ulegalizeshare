package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Security group user dto.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SecurityGroupUserDTO extends AbstractRestObject {

    /**
     * The Security group dto list.
     */
// for security
    List<ItemLongDto> securityGroupDTOList = new ArrayList<>();
    /**
     * The Id.
     */
    private Long id;
    /**
     * The User id.
     */
    private Long userId;
    /**
     * The Security group id.
     */
    private Long securityGroupId;
    /**
     * The Security group item.
     */
    private ItemLongDto securityGroupItem;
    /**
     * The Role id.
     */
    private Integer roleId;
    /**
     * The Description.
     */
    private String description;
    /**
     * The Nb users.
     */
    private Integer nbUsers;
    /**
     * The Picture.
     */
    private byte[] picture;
    /**
     * The Full name.
     */
    private String fullName;
    /**
     * The Email.
     */
    private String email;
    /**
     * The User email item.
     */
    private ItemStringDto userEmailItem;
    /**
     * The Function id.
     */
    private Integer functionId;
    /**
     * The Function id item.
     */
    private ItemDto functionIdItem;
    /**
     * The Share dossier.
     */
    private boolean shareDossier;
    /**
     * The Is valid.
     */
    private boolean isValid;


    /**
     * Instantiates a new Security group user dto.
     */
    public SecurityGroupUserDTO() {
    }

}
