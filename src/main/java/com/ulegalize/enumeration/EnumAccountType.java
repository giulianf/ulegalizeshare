package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumAccountType {

	PRO_ACCOUNT(1),
	ACCOUNT_TIERS(2),
	CASH(3);

	@Getter
	private int id;

	EnumAccountType(int id) {
		this.id = id;
	}


	public static EnumAccountType fromId(int id) {
		for (EnumAccountType enumAccountType : values()) {
			if (enumAccountType.getId() == id)
				return enumAccountType;
		}
		return null;
	}
}
