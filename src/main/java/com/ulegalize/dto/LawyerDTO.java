package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import com.ulegalize.LawyerDuty;
import com.ulegalize.enumeration.EnumValid;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LawyerDTO extends AbstractRestObject {

    private Long id;
    // for security
    List<ItemLongDto> securityGroupDTOList = new ArrayList<>();
    private String alias;
    private String idUser;
    private String fullName;
    private String initials;
    private String summary;
    private String biography;
    private String specialities;
    private String color;
    private byte[] picture;
    private String email;
    private ItemStringDto userEmailItem;
    private Integer functionId;
    private ItemDto functionIdItem;
    private Long securityGroupId;
    private String phone;
    private List<String> vcKeySelected;
    private String language;
    private ItemLongDto securityGroupItem;
    private boolean shareDossier;

    private List<LawyerDuty> duties;
    private boolean isValid;
    private EnumValid enumValid;
    private boolean isNotification;

    //come from LawfirmUsers
    private boolean isActive;

    public LawyerDTO() {
    }

    public LawyerDTO(Long id, String idUser, String email, String language, String fullName, EnumValid emailVerified) {
        this.id = id;
        this.idUser = idUser;
        this.email = email;
        this.language = language;
        this.fullName = fullName;
        this.enumValid = emailVerified;
    }
}
