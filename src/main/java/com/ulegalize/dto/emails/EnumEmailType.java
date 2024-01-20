package com.ulegalize.dto.emails;

import lombok.Getter;

/**
 * enum email type
 */
public enum EnumEmailType {
    /**
     * received email
     */
    RECEIVED(0),
    /**
     * sent email
     */
    SENT(1);

    /**
     * id
     */
    @Getter
    private final Integer id;

    /**
     * @param id id
     */
    EnumEmailType(Integer id) {
        this.id = id;
    }


    /**
     * from id
     *
     * @param id from
     * @return enum
     */
    public static EnumEmailType fromId(Integer id) {
        for (EnumEmailType enumEmailType : values()) {
            if (enumEmailType.getId().equals(id)) {
                return enumEmailType;
            }
        }
        return null;
    }
}
