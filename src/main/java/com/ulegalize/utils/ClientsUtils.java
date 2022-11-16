package com.ulegalize.utils;

/**
 * The type Clients utils.
 */
public class ClientsUtils {

    /**
     * Instantiates a new Clients utils.
     */
    private ClientsUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Gets fullname.
     *
     * @param lastname  the lastname
     * @param firstname the firstname
     * @param company   the company
     * @return the fullname
     */
    public static String getFullname(String lastname, String firstname, String company) {
        String companyName = company != null && !company.isEmpty() ? " - " + company : "";
        return lastname + " " + firstname + " " + companyName;
    }

    /**
     * Gets fullname.
     *
     * @param fullname the fullname
     * @param company  the company
     * @return the fullname
     */
    public static String getFullname(String fullname, String company) {
        String companyName = company != null && !company.isEmpty() ? " - " + company : "";
        return fullname + " " + companyName;
    }

    /**
     * Gets email fullname.
     *
     * @param email     the email
     * @param lastname  the lastname
     * @param firstname the firstname
     * @param company   the company
     * @return the email fullname
     */
    public static String getEmailFullname(String email, String lastname, String firstname, String company) {
        String companyName = company != null && !company.isEmpty() ? " - " + company : "";
        return lastname + " " + firstname + " " + companyName + " (" + email + ")";
    }

}
