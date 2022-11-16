package com.ulegalize;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


/**
 * The type Abstract rest object.
 */
public abstract class AbstractRestObject {

	/**
	 * The Creation date.
	 */
	@Getter
	@Setter
	protected Date creationDate;
	/**
	 * The Update date.
	 */
	@Getter
	@Setter
	protected Date updateDate;
}
