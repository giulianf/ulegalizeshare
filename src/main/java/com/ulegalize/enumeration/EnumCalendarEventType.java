package com.ulegalize.enumeration;

public enum EnumCalendarEventType {

	PERM("PERM", "Permanence", "Permanent", "Permanent", "red"),
	TASK("TASK", "Tâche", "Taak", "Task", "orange"),
	RDV("RDV", "Rendez-vous", "Afspraak", "Appointment", "azure"),
	AUD("AUD", "Audience", "Publiek", "Audience", "green"),
	OTH("OTH", "Autre", "Andere", "Other", "grey");

	private String code;
	private String labelFr;
	private String labelNl;
	private String labelEn;
	private String color;

	EnumCalendarEventType(String code, String labelFr, String labelNl, String labelEn, String color) {
		this.code = code;
		this.labelFr = labelFr;
		this.labelNl = labelNl;
		this.labelEn = labelEn;
		this.color = color;
	}


	public static EnumCalendarEventType fromCode(String code) {
		for (EnumCalendarEventType enumCalendarEventType : values()) {
			if (enumCalendarEventType.getCode().equalsIgnoreCase(code))
				return enumCalendarEventType;
		}
		return null;
	}

	public String getCode() {
		return code;
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

	public String getColor() {
		return color;
	}
}
