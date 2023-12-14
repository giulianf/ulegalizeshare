package com.ulegalize.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientsUtilsTest {

    @org.junit.jupiter.api.Test
    void getFullname() {
        String name = "name";
        String firstname = "firstname";
        String company = "company";
        String fullname = ClientsUtils.getFullname(name, firstname, company);

        assertEquals(name + " " + firstname + " " + company, fullname);
    }

    @org.junit.jupiter.api.Test
    void testGetFullname() {
        String fullname = "my fullname";
        String company = "company";
        String fullname2 = ClientsUtils.getFullname(fullname, company);

        assertEquals(fullname + " " + company, fullname2);
    }

    @org.junit.jupiter.api.Test
    void getEmailFullname() {
        String email = "name@my.com";
        String name = "name";
        String firstname = "firstname";
        String company = "company";
        String fullname = ClientsUtils.getEmailFullname(email, name, firstname, company);

        assertEquals(name + " " + firstname + " " + company + " (" + email + ")", fullname);
    }
}
