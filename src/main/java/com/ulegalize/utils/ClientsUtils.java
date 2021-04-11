package com.ulegalize.utils;

public class ClientsUtils {

    private ClientsUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String getFullname(String lastname, String firstname, String company) {
        String companyName = company != null && !company.isEmpty() ? " - " + company : "";
        return lastname + " " + firstname + companyName;
    }

}
