package com.ulegalize.dto.emails;

import lombok.Getter;

/**
 * enum email tag type
 */
public enum EnumEmailTagTypes {
    /**
     * user
     */
    USER(1),
    /**
     * channel
     */
    CHANNEL(2),
    /**
     * dossier
     */
    DOSSIER(3);

    /**
     * id
     */
    @Getter
    private int id;

    /**
     * @param id
     */
    EnumEmailTagTypes(int id) {
        this.id = id;
    }

    /**
     * from id
     *
     * @param id id
     * @return enum
     */
    public static EnumEmailTagTypes fromId(int id) {
        for (EnumEmailTagTypes enumEmailTagTypes : values()) {
            if (enumEmailTagTypes.getId() == id)
                return enumEmailTagTypes;
        }
        return null;
    }

}
