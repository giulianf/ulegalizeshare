package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumCalendarEventType {

	PERM("PERM", "Permanence", "Permanent", "Permanent", "Ständigen", "red"),
	RECORD("RECORD", "Tâche enregistrement", "Taak opnemen", "Task recording", "Task speichern", "orange"),
	TASK("TASK", "Tâche", "Taak", "Task", "Aufgabe", "orange"),
	RDV("RDV", "Rendez-vous", "Afspraak", "Appointment", "Termin", "azure"),
	AUD("AUD", "Audience", "Publiek", "Audience", "Anhörung", "green"),
	OTH("OTH", "Autre", "Andere", "Other", "Ander", "grey");

	@Getter
	private String code;
	@Getter
	private String labelFr;
	@Getter
	private String labelNl;
	@Getter
	private String labelEn;
	@Getter
	private String labelDe;
	@Getter
	private String color;

	EnumCalendarEventType(String code, String labelFr, String labelNl, String labelEn, String labelDe, String color) {
		this.code = code;
		this.labelFr = labelFr;
		this.labelNl = labelNl;
		this.labelEn = labelEn;
		this.labelDe = labelDe;
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
