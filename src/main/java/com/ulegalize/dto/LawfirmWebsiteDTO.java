package com.ulegalize.dto;

import com.ulegalize.AbstractRestObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The type Lawfirm website dto.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LawfirmWebsiteDTO extends AbstractRestObject {
	/**
	 * Instantiates a new Lawfirm website dto.
	 */
	public LawfirmWebsiteDTO() {
	}

	/**
	 * The Vckey.
	 */
	private String vckey;
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
	 * The Active.
	 */
	private boolean active;
	/**
	 * The Accept appointments.
	 */
	private boolean acceptAppointments;

}
