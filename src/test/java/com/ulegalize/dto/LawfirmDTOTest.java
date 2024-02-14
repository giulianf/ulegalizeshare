package com.ulegalize.dto;

import com.ulegalize.enumeration.DriveType;
import com.ulegalize.enumeration.EnumRefCurrency;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LawfirmDTOTest {
    @Test
    public void test_constructor() {
        String vckey = "MYTEST";
        String name = "name";
        String alias = "alias";

        String abbreviation = null;
        String companyNumber = null;
        String website = null;
        BigDecimal couthoraire = null;
        Integer startInvoiceNumber = null;
        String acronymInvoice = null;
        String street = null;
        String city = null;
        String postalCode = null;
        String countryCode = null;
        String email = null;
        String phoneNumber = null;
        EnumRefCurrency currency = null;
        String fax = null;
        String objetsocial = null;
        Boolean notification = null;
        byte[] logo = new byte[0];
        DriveType driveType = null;
        LawfirmDTO dto = new LawfirmDTO(vckey, name, alias,
                abbreviation, companyNumber, objetsocial, currency, website,
                couthoraire, startInvoiceNumber, acronymInvoice, street, city, postalCode,
                countryCode, email, phoneNumber, fax, notification, logo, driveType);
        assertEquals(vckey, dto.getVckey());
        assertEquals(name, dto.getName());
    }
}
