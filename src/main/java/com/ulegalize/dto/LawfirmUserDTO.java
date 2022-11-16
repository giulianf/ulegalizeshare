package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import com.ulegalize.enumeration.EnumRole;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * The type Lawfirm user dto.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LawfirmUserDTO extends AbstractRestObject {
    /**
     * Instantiates a new Lawfirm user dto.
     */
    public LawfirmUserDTO() {
    }

    /**
     * The Id.
     */
    private Long id;
    /**
     * The Is public.
     */
    private boolean isPublic;
    /**
     * The Is selected.
     */
    private boolean isSelected;
    /**
     * The Is active.
     */
    private boolean isActive;
    /**
     * The Couthoraire.
     */
    private Integer couthoraire;
    /**
     * The Use self couthoraire.
     */
    private boolean useSelfCouthoraire;
    /**
     * The Is prestataire.
     */
    private boolean isPrestataire;
    /**
     * The Valid from.
     */
    private Date validFrom;
    /**
     * The Valid to.
     */
    private Date validTo;
    /**
     * The Id role.
     */
    private EnumRole idRole;
    /**
     * The Lawyer alias.
     */
    private String lawyerAlias;
    /**
     * The Lawyer fullname.
     */
    private String lawyerFullname;
    /**
     * The Email.
     */
    private String email;

}
