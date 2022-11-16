package com.ulegalize.dto.usign;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Client usign dto.
 */
@Data
public class ClientUsignDTO implements Serializable {
    /**
     * Instantiates a new Client usign dto.
     */
    public ClientUsignDTO() {
    }

    /**
     * The Id.
     */
    private Long id;
    /**
     * The Full name.
     */
    private String fullName;
    /**
     * The Firstname.
     */
    private String firstname;
    /**
     * The Lastname.
     */
    private String lastname;
    /**
     * The Phone.
     */
    private String phone;
    /**
     * The Email.
     */
    private String email;
    /**
     * The Language.
     */
    private String language;
    /**
     * The Client from.
     */
    private String clientFrom;
    /**
     * The Status.
     */
    private String status;
    /**
     * The Order by index.
     */
    private Integer orderByIndex;

    /**
     * The Left.
     */
    private int left = 0;
    /**
     * The Top.
     */
    private int top = 0;
    /**
     * The Width.
     */
    private int width = 160;
    /**
     * The Height.
     */
    private int height = 80;
    /**
     * The Page number.
     */
    private int pageNumber = 1;
    /**
     * The Sequence.
     */
    private int sequence = 1;

    /**
     * The Birthdate.
     */
    private Date birthdate;
    /**
     * The Client id.
     */
    private Long clientId;
}
