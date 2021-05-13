package com.ulegalize.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ulegalize.enumeration.DriveType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@ToString
public class UlegalizeToken implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    protected Long userId;

    @Getter
    @Setter
    protected String username;


    @Getter
    @Setter
    protected String userEmail;

    @Getter
    @Setter
    protected String vcKey;

    protected String password;

    @Getter
    @Setter
    protected Boolean enabled;

    @Getter
    @Setter
    protected List<EnumRights> enumRights;
    @Getter
    @Setter
    protected String token;

    @Getter
    @Setter
    protected Boolean temporary;
    @Getter
    @Setter
    protected String language;
    @Getter
    @Setter
    protected String symbolCurrency;
    @Getter
    @Setter
    protected String fullname;
    @Getter
    @Setter
    protected DriveType driveType;
    @Getter
    @Setter
    protected String dropboxToken;

    @Getter
    @Setter
    protected String clientFrom;

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }

}