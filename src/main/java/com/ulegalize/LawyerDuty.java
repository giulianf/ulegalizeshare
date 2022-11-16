package com.ulegalize;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * The type Lawyer duty.
 */
public class LawyerDuty {

	/**
	 * The Id.
	 */
	private Long id;
	/**
	 * The Start.
	 */
	@Setter
	@Getter
	private Date start;
	/**
	 * The End.
	 */
	@Setter
	@Getter
	private Date end;
	/**
	 * The Remark.
	 */
	private String remark;

	/**
	 * The Lawyer id.
	 */
	@JsonProperty("lawyer_id")
	private Long lawyerId;

	/**
	 * Instantiates a new Lawyer duty.
	 */
	public LawyerDuty() {

	}

	/**
	 * Instantiates a new Lawyer duty.
	 *
	 * @param id       the id
	 * @param start    the start
	 * @param end      the end
	 * @param remark   the remark
	 * @param lawyerId the lawyer id
	 */
	public LawyerDuty(Long id, Date start, Date end, String remark, Long lawyerId) {
		this.id = id;
		this.start = start;
		this.end = end;
		this.remark = remark;
		this.lawyerId = lawyerId;
	}

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets remark.
	 *
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * Sets remark.
	 *
	 * @param remark the remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
