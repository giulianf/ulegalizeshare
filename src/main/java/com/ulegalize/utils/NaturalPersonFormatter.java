package com.ulegalize.utils;

public class NaturalPersonFormatter implements ClientNameFormatter {
    @Override
    public String formatFullname(String firstname, String lastname, String email, String company, String address, String district, boolean includeEmail) {
        String fullName = (firstname + " " + lastname).trim();
        return includeEmail && email != null && !email.isEmpty() ? fullName + " (" + email + ")" : fullName;
    }
}
