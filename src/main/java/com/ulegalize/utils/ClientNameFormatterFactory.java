package com.ulegalize.utils;

import com.ulegalize.enumeration.EnumClientType;

public class ClientNameFormatterFactory {
    public ClientNameFormatter getFormatter(EnumClientType type) {
        if (type == null) {
            throw new IllegalArgumentException("Client type must not be null");
        }

        return switch (type) {
            case NATURAL_PERSON, COLLEGUE -> new NaturalPersonFormatter();
            case COMPANY -> new CompanyFormatter();
            case COURT -> new CourtFormatter();
        };
    }
}
