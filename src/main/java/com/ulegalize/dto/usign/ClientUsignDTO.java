package com.ulegalize.dto.usign;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ClientUsignDTO implements Serializable {
    public ClientUsignDTO() {
    }

    private Long id;
    private String fullName;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private int left = 0;
    private int top = 0;
    private int width = 160;
    private int height = 80;
    private int pageNumber = 1;

    private Date birthdate;

}
