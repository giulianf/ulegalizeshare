package com.ulegalize.enumeration;

/**
 * The enum Enum dossier contact type.
 */
public enum EnumDossierContactType {
    /**
     * Client enum dossier contact type.
     */
    CLIENT(1),
    /**
     * Opposing enum dossier contact type.
     */
    OPPOSING(2),
    /**
     * Party enum dossier contact type.
     */
    PARTY(3),
    /**
     * Opponent counsil enum dossier contact type.
     */
    OPPONENT_COUNSIL(4),
    /**
     * Other enum dossier contact type.
     */
    OTHER(5);
    /**
     * Opposing lawyer enum dossier contact type.
     */
//    OPPOSING_LAWYER(6);

    /**
     * The Id.
     */
    private int id;

    /**
     * Instantiates a new Enum dossier contact type.
     *
     * @param id the id
     */
    EnumDossierContactType(int id) {
        this.id = id;
    }

    /**
     * From id enum dossier contact type.
     *
     * @param id the id
     * @return the enum dossier contact type
     */
    public static EnumDossierContactType fromId(int id) {
        for (EnumDossierContactType dossierContactType : values()) {
            if (dossierContactType.getId() == id)
                return dossierContactType;
        }
        return null;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

}
