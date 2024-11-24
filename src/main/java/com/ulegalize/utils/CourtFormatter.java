package com.ulegalize.utils;

public class CourtFormatter implements ClientNameFormatter {
    @Override
    public String formatFullname(String firstname, String lastname, String email, String company, String address, String district) {
        return (company + (district != null && !district.isEmpty() ? " - " + district : "")).trim();
    }
}
