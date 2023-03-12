package com.ulegalize.dto.emails;

import lombok.Getter;

public enum EnumEmailTagTypes {
    USER(1),
    CHANNEL(2),
    DOSSIER(3);

    @Getter
    private int id;

    EnumEmailTagTypes(int id) {
        this.id = id;
    }

    public static EnumEmailTagTypes fromId(int id) {
        for (EnumEmailTagTypes enumEmailTagTypes : values()) {
            if (enumEmailTagTypes.getId() == id)
                return enumEmailTagTypes;
        }
        return null;
    }

}
