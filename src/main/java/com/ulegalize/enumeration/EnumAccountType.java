package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumAccountType {

	PRO_ACCOUNT(1, "Compte professionnel", "Professioneel account", "Professional account", "Professionelles Konto"),
	ACCOUNT_TIERS(2, "Compte tiers / CARPA", "Account van derden / CARPA", "Third-party account / CARPA", "Drittkonto / CARPA"),
	CASH(3, "Espèces", "Contant geld", "Cash", "Arten");

	@Getter
	private int id;
	@Getter
	private String labelFr;
	@Getter
	private String labelNl;
	@Getter
	private String labelEn;
	@Getter
	private String labelDe;

	EnumAccountType(int id, String labelFr, String labelNl, String labelEn, String labelDe) {
		this.id = id;
		this.labelFr = labelFr;
		this.labelNl = labelNl;
		this.labelEn = labelEn;
		this.labelDe = labelDe;
	}


	public static EnumAccountType fromId(int id) {
		for (EnumAccountType enumAccountType : values()) {
			if (enumAccountType.getId() == id)
				return enumAccountType;
		}
		return null;
	}
}
