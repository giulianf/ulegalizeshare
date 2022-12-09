package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import com.ulegalize.enumeration.DriveType;
import com.ulegalize.enumeration.EnumRefCurrency;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * The type Lawfirm dto.
 */
@ToString(exclude = "logo")
@Data
@EqualsAndHashCode(callSuper = true)
public class LawfirmDTO extends AbstractRestObject {


	/**
	 * The Vckey.
	 */
	private String vckey;
	/**
	 * The Name.
	 */
	private String name;
	/**
	 * The Alias.
	 */
	private String alias;
	/**
	 * The Abbreviation.
	 */
	private String abbreviation;
	/**
	 * The Numentreprise.
	 */
	private String numentreprise;
	/**
	 * The Objetsocial.
	 */
	private String objetsocial;
	/**
	 * The Country alpha 2.
	 */
	private String countryAlpha2;
	/**
	 * The Currency.
	 */
	private EnumRefCurrency currency;
	/**
	 * The Currency item.
	 */
	private ItemStringDto currencyItem;
	/**
	 * The Website.
	 */
	private String website;
	/**
	 * The Couthoraire.
	 */
	private int couthoraire;
	/**
	 * The Start invoice number.
	 */
	private Integer startInvoiceNumber;
	/**
	 * The Start dossier number.
	 */
	private Long startDossierNumber;

	/**
	 * The Street.
	 */
	private String street;
	/**
	 * The City.
	 */
	private String city;
	/**
	 * The Postal code.
	 */
	private String postalCode;
	/**
	 * The Country code.
	 */
	private String countryCode;
	/**
	 * The Country item.
	 */
	private ItemStringDto countryItem;


	/**
	 * The Title.
	 */
	private String title;
	/**
	 * The Intro.
	 */
	private String intro;
	/**
	 * The Philosophy.
	 */
	private String philosophy;
	/**
	 * The About.
	 */
	private String about;


	/**
	 * The Email.
	 */
	private String email;
	/**
	 * The Phone number.
	 */
	private String phoneNumber;
	/**
	 * The Fax.
	 */
	private String fax;

	/**
	 * The Is notification.
	 */
	private Boolean isNotification;

	/**
	 * The Logo.
	 */
	private byte[] logo;

	/**
	 * The Accept appointments.
	 */
	private boolean acceptAppointments;


	/**
	 * The Lawyers.
	 */
	private List<LawyerDTO> lawyers;
	/**
	 * The Client from.
	 */
	private String clientFrom;


	/**
	 * The Drive type.
	 */
	private DriveType driveType;

	/**
	 * Instantiates a new Lawfirm dto.
	 */
	public LawfirmDTO() {

	}

	/**
	 * Instantiates a new Lawfirm dto.
	 *
	 * @param vckey              the vckey
	 * @param name               the name
	 * @param alias              the alias
	 * @param abbreviation       the abbreviation
	 * @param numentreprise      the numentreprise
	 * @param objetsocial        the objetsocial
	 * @param currency           the currency
	 * @param website            the website
	 * @param couthoraire        the couthoraire
	 * @param startInvoiceNumber the start invoice number
	 * @param startDossierNumber the start dossier number
	 * @param street             the street
	 * @param city               the city
	 * @param postalCode         the postal code
	 * @param countryCode        the country code
	 * @param email              the email
	 * @param phoneNumber        the phone number
	 * @param fax                the fax
	 * @param isNotification     the is notification
	 * @param logo               the logo
	 * @param driveType          the drive type
	 */
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
					  Long startDossierNumber,
					  String street,
					  String city,
					  String postalCode,
					  String countryCode,
					  String email,
					  String phoneNumber,
					  String fax,
					  Boolean isNotification,
					  byte[] logo,
					  DriveType driveType
	) {
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
		this.startDossierNumber = startDossierNumber;
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
		this.countryCode = countryCode;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.fax = fax;
		this.logo = logo;
		this.driveType = driveType;

		if (isNotification != null){
			this.isNotification = isNotification;
		}
	}
}
