package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import com.ulegalize.enumeration.DriveType;
import com.ulegalize.enumeration.EnumRefCurrency;
import lombok.Data;

import java.util.List;

@Data
public class LawfirmDTO extends AbstractRestObject {


	private String vckey;
	private String name;
	private String alias;
	private String abbreviation;
	private String numentreprise;
	private String objetsocial;
	private EnumRefCurrency currency;
	private ItemStringDto currencyItem;
	private String website;
	private int couthoraire;
	private Integer startInvoiceNumber;

	private String street;
	private String city;
	private String postalCode;
	private String countryCode;
	private ItemStringDto countryItem;


	private String title;
	private String intro;
	private String philosophy;
	private String about;


	private String email;
	private String phoneNumber;
	private String fax;

	private boolean isNotification;

	private byte[] logo;

	private boolean acceptAppointments;

	private DriveType driveType;

	private List<LawyerDTO> lawyers;

	public LawfirmDTO() {

	}

	public LawfirmDTO(String vckey,
					  String name,
					  String alias,
					  String abbreviation,
					  String numentreprise,
					  String objetsocial,
					  EnumRefCurrency currency,
					  String website,
					  int couthoraire,
					  Integer startInvoiceNumber,
					  String street,
					  String city,
					  String postalCode,
					  String countryCode,
					  String email,
					  String phoneNumber,
					  String fax,
					  Boolean isNotification,
					  byte[] logo,
					  DriveType driveType) {
		this.vckey = vckey;
		this.name = name;
		this.alias = alias;
		this.abbreviation = abbreviation;
		this.numentreprise = numentreprise;
		this.objetsocial = objetsocial;
		this.currency = currency;
		this.website = website;
		this.couthoraire = couthoraire;
		this.startInvoiceNumber = startInvoiceNumber;
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
		this.countryCode = countryCode;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.fax = fax;
		this.logo = logo;
		this.driveType = driveType;
		this.isNotification = isNotification;
	}
}
