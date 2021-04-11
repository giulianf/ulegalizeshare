package com.ulegalize.enumeration;

public enum EnumAccountType {

	PRO_ACCOUNT(1, "Compte professionnel", "Professioneel account", "Professional account"),
	ACCOUNT_TIERS(2, "Compte tiers / CARPA", "Account van derden / CARPA", "Third-party account / CARPA"),
	CASH(3, "Espèces", "Contant geld", "Cash");

	private int id;
	private String labelFr;
	private String labelNl;
	private String labelEn;

	EnumAccountType(int id, String labelFr, String labelNl, String labelEn) {
		this.id = id;
		this.labelFr = labelFr;
		this.labelNl = labelNl;
		this.labelEn = labelEn;
	}


	public static EnumAccountType fromId(int id) {
		for (EnumAccountType enumAccountType : values()) {
			if (enumAccountType.getId() == id)
				return enumAccountType;
		}
		return null;
	}


	public String getLabelFr() {
		return labelFr;
	}

	public String getLabelNl() {
		return labelNl;
	}

	public String getLabelEn() {
		return labelEn;
	}

	public int getId() {
		return id;
	}
}
