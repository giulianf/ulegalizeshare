package com.ulegalize.utils;

public class CompanyFormatter implements ClientNameFormatter {
    @Override
    public String formatFullname(String firstname, String lastname, String email, String company, String address, String district) {
        return (company + (address != null && !address.isEmpty() ? " - " + address : "")).trim();
    }
}
