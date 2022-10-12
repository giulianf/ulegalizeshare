package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumClientType;
import com.ulegalize.enumeration.EnumTitle;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ContactSummary implements Serializable {
    public ContactSummary(){}

    private Long id;
    private String fullName;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;

    private String company;
    private Long type = EnumClientType.NATURAL_PERSON.getId();
    private ItemDto typeItem;
    private EnumTitle title = EnumTitle.F;
    private ItemStringDto titleItem;
    private String language;
    private ItemStringDto languageItem;
    private String address = "";
    private String cp = "";
    private String city = "";
    private String tel = "";
    private String mobile = null;
    private String fax = null;
    private String nrnat = "";
    private String etr = "";
    private String tva = null;
    private Date birthdate;

    private String country = "";
    private ItemStringDto countryItem;

    private Long userId;
    private String vcKey;
    private String iban;
    private String bic;
    private String job;

}
