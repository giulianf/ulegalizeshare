package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import com.ulegalize.enumeration.EnumRole;
import lombok.Data;

import java.util.Date;

@Data
public class LawfirmUserDTO extends AbstractRestObject {
    public LawfirmUserDTO(){}

    private Long id;
    private boolean isPublic;
    private boolean isSelected;
    private boolean isActive;
    private Integer couthoraire;
    private boolean useSelfCouthoraire;
    private boolean isPrestataire;
    private Date validFrom;
    private Date validTo;
    private EnumRole idRole;
    private String lawyerAlias;
    private String lawyerFullname;
    private String email;

}
