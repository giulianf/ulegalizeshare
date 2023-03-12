package com.ulegalize.dto.emails;

import lombok.Getter;

public enum EnumEmailType {
    RECEIVED(0),
    SENT(1);

    @Getter
    private final Integer id;

    EnumEmailType(Integer id) {
        this.id = id;
    }


    public static EnumEmailType fromId(Integer id) {
        for (EnumEmailType enumEmailType : values()) {
            if (enumEmailType.getId().equals(id)) {
                return enumEmailType;
            }
        }
        return null;
    }
}
