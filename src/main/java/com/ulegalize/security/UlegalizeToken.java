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

/**
 * The type Ulegalize token.
 */
@NoArgsConstructor
@ToString
public class UlegalizeToken implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The User id.
     */
    @Getter
    @Setter
    protected Long userId;

    /**
     * The Username.
     */
    @Getter
    @Setter
    protected String username;


    /**
     * The User email.
     */
    @Getter
    @Setter
    protected String userEmail;

    /**
     * The Vc key.
     */
    @Getter
    @Setter
    protected String vcKey;

    /**
     * The Password.
     */
    protected String password;

    /**
     * The Enabled.
     */
    @Getter
    @Setter
    protected Boolean enabled;

    /**
     * The Enum rights.
     */
    @Getter
    @Setter
    protected List<EnumRights> enumRights;
    /**
     * The Token.
     */
    @Getter
    @Setter
    protected String token;

    /**
     * The Temporary.
     */
    @Getter
    @Setter
    protected Boolean temporary;
    /**
     * The Language.
     */
    @Getter
    @Setter
    protected String language;
    /**
     * The Symbol currency.
     */
    @Getter
    @Setter
    protected String symbolCurrency;
    /**
     * The Fullname.
     */
    @Getter
    @Setter
    protected String fullname;
    /**
     * The Drive type.
     */
    @Getter
    @Setter
    protected DriveType driveType;
    /**
     * The Dropbox token.
     */
    @Getter
    @Setter
    protected String dropboxToken;
    /**
     * The Onedrive token.
     */
    @Getter
    @Setter
    protected String onedriveToken;

    /**
     * The Client from.
     */
    @Getter
    @Setter
    protected String clientFrom;

    /**
     * Gets password.
     *
     * @return the password
     */
    @JsonIgnore
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }

}