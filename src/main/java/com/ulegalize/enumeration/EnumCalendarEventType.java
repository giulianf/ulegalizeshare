package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumCalendarEventType {

	PERM("PERM", "red"),
	RECORD("RECORD", "orange"),
	TASK("TASK", "orange"),
	RDV("RDV", "azure"),
	AUD("AUD", "green"),
	OTH("OTH", "grey");

	@Getter
	private String code;
	@Getter
	private String color;

	EnumCalendarEventType(String code, String color) {
		this.code = code;
		this.color = color;
	}


	public static EnumCalendarEventType fromCode(String code) {
		for (EnumCalendarEventType enumCalendarEventType : values()) {
			if (enumCalendarEventType.getCode().equalsIgnoreCase(code))
				return enumCalendarEventType;
		}
		return null;
	}
}
