package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import lombok.Data;

@Data
public class LawfirmWebsiteDTO extends AbstractRestObject {
	public LawfirmWebsiteDTO(){}

	private String vckey;
	private String title;
	private String intro;
	private String philosophy;
	private String about;
	private boolean active;
	private boolean acceptAppointments;

}
