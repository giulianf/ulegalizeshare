package com.ulegalize.utils;

import com.ulegalize.enumeration.EnumClientType;

public class ClientNameBuilder {
    private EnumClientType type;
    private String firstname;
    private String lastname;
    private String email;
    private String company;
    private String address;
    private String district;

    public ClientNameBuilder(EnumClientType type) {
        this.type = type;
    }

    public ClientNameBuilder firstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public ClientNameBuilder lastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ClientNameBuilder email(String email) {
        this.email = email;
        return this;
    }

    public ClientNameBuilder company(String company) {
        this.company = company;
        return this;
    }

    public ClientNameBuilder address(String address) {
        this.address = address;
        return this;
    }

    public ClientNameBuilder district(String district) {
        this.district = district;
        return this;
    }

    public String build() {
        return switch (type) {
            case NATURAL_PERSON, COLLEGUE -> formatNaturalPerson();
            case COMPANY -> formatCompany();
            case COURT -> formatCourt();
        };
    }

    private String formatNaturalPerson() {
        String fullName = (firstname != null ? firstname : "") +
                (lastname != null ? " " + lastname : "");
        fullName = fullName.trim();
        return email != null && !email.isEmpty() ? fullName + " (" + email + ")" : fullName;
    }
    private String formatCompany() {
        String location = safeConcat(company, address);
        return location.isEmpty() ? company : location;
    }

    private String formatCourt() {
        String location = safeConcat(company, district);
        return location.isEmpty() ? company : location;
    }

    /**
     * Safely concatenates two strings, ignoring null or empty values.
     *
     * @param part1 the first part
     * @param part2 the second part
     * @return concatenated string with " - " if both parts are present, or just one if the other is null/empty
     */
    private String safeConcat(String part1, String part2) {
        if ((part1 == null || part1.isEmpty()) && (part2 == null || part2.isEmpty())) {
            return "";
        }
        if (part1 == null || part1.isEmpty()) {
            return part2;
        }
        if (part2 == null || part2.isEmpty()) {
            return part1;
        }
        return part1 + " - " + part2;
    }
}
