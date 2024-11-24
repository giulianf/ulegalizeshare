package com.ulegalize.utils;

public class NaturalPersonFormatter implements ClientNameFormatter {
    @Override
    public String formatFullname(String firstname, String lastname, String email, String company, String address, String district) {
        String fullName = (firstname + " " + lastname).trim();
        return email != null && !email.isEmpty() ? fullName + " (" + email + ")" : fullName;
    }
}
