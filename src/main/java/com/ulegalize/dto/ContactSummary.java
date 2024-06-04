package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumClientType;
import com.ulegalize.enumeration.EnumTitle;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Contact summary.
 */
@Data
@NoArgsConstructor
public class ContactSummary implements Serializable {
    /**
     * The Id.
     */
    private Long id;
    /**
     * The Full name.
     */
    private String fullName;
    /**
     * The Firstname.
     */
    private String firstname;
    /**
     * The Lastname.
     */
    private String lastname;
    /**
     * The Phone.
     */
    private String phone;
    /**
     * The Email.
     */
    private String email;

    /**
     * The Company.
     */
    private String company;
    /**
     * The Type.
     */
    private Long type = EnumClientType.NATURAL_PERSON.getId();
    /**
     * The Type item.
     */
    private ItemDto typeItem;
    /**
     * The Title.
     */
    private EnumTitle title = null;
    /**
     * The Title item.
     */
    private ItemStringDto titleItem;
    /**
     * The Language.
     */
    private String language;
    /**
     * The Language item.
     */
    private ItemStringDto languageItem;
    /**
     * The Address.
     */
    private String address = "";
    /**
     * The Cp.
     */
    private String cp = "";
    /**
     * The City.
     */
    private String city = "";
    /**
     * The Tel.
     */
    private String tel = "";
    /**
     * The Mobile.
     */
    private String mobile = null;
    /**
     * The Fax.
     */
    private String fax = null;
    /**
     * The Nrnat.
     */
    private String nrnat = "";
    /**
     * The Etr.
     */
    private String etr = "";
    /**
     * The nationality.
     */
    private String nationality;
    /**
     * The nationality tem.
     */
    private ItemStringDto nationalityItem;
    /**
     * The Tva.
     */
    private String tva = null;
    /**
     * The Birthdate.
     */
    private Date birthdate;

    /**
     * The Country.
     */
    private String country = "";
    /**
     * The Country item.
     */
    private ItemStringDto countryItem;

    /**
     * The User id.
     */
    private Long userId;
    /**
     * The Vc key.
     */
    private String vcKey;
    /**
     * The Iban.
     */
    private String iban;
    /**
     * The Bic.
     */
    private String bic;
    /**
     * The Job.
     */
    private String job;
    /**
     * Dossier contact quality.
     */
    private String quality;
    /**
     * Dossier contact reference .
     */
    private String reference;
    /**
     * Birthplace .
     */
    private String birthplace;
    /**
     * NAF FRench
     */
    private ItemStringDto nafItem;
    /**
     * convention collective French
     */
    private ItemStringDto ccItem;

}
