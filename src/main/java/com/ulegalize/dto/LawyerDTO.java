package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import com.ulegalize.LawyerDuty;
import com.ulegalize.enumeration.EnumValid;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Lawyer dto.
 */
@ToString(exclude = "picture")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class LawyerDTO extends AbstractRestObject {

    /**
     * The Id.
     */
    private Long id;
    /**
     * The lawfirm user Id.
     */
    private Long lawfirmUserId;
    /**
     * The Security group dto list.
     */
// for security
    List<ItemLongDto> securityGroupDTOList = new ArrayList<>();
    /**
     * The Alias.
     */
    private String alias;
    /**
     * The Id user.
     */
    private String idUser;
    /**
     * The Full name.
     */
    private String fullName;
    /**
     * The Initials.
     */
    private String initials;
    /**
     * The Summary.
     */
    private String summary;
    /**
     * The Biography.
     */
    private String biography;
    /**
     * The Specialities.
     */
    private String specialities;
    /**
     * The Color.
     */
    private String color;
    /**
     * The Picture.
     */
    private byte[] picture;
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
     * The Security group id.
     */
    private Long securityGroupId;
    /**
     * The Phone.
     */
    private String phone;
    /**
     * The Vc key selected.
     */
    private List<String> vcKeySelected;
    /**
     * The Language.
     */
    private String language;
    /**
     * The Security group item.
     */
    private ItemLongDto securityGroupItem;
    /**
     * The Share dossier.
     */
    private boolean shareDossier;

    /**
     * The Duties.
     */
    private List<LawyerDuty> duties;
    /**
     * The Is valid.
     */
    private boolean isValid;
    /**
     * The Enum valid.
     */
    private EnumValid enumValid;
    /**
     * The Is notification.
     */
    private boolean isNotification;

    /**
     * The Is active.
     */
//come from LawfirmUsers
    private boolean isActive;
    /**
     * The Is selected.
     */
    private boolean isSelected;
    /**
     * The Client from.
     */
    private String clientFrom;

    /**
     * User's primary email
     */
    private String ulegalizeEmail;
    /**
     * all Dossier has Access
     */
    private boolean allDossierAccess;
    /**
     * all Dossier has Access
     */
    private LocalDateTime loginDate;

    /**
     * Instantiates a new Lawyer dto.
     *
     * @param id            the id
     * @param idUser        the id user
     * @param email         the email
     * @param language      the language
     * @param fullName      the full name
     * @param emailVerified the email verified
     * @param loginDate the email verified
     */
    public LawyerDTO(Long id, String idUser, String email, String language, String fullName, EnumValid emailVerified, LocalDateTime loginDate){
        this.id = id;
        this.idUser = idUser;
        this.email = email;
        this.language = language;
        this.fullName = fullName;
        this.enumValid = emailVerified;
        this.loginDate = loginDate;
    }
}
