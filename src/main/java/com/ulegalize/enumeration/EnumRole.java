package com.ulegalize.enumeration;

import lombok.Getter;

/**
 * The enum Enum role.
 */
public enum EnumRole {
    /**
     * Avocat enum role.
     */
    AVOCAT(1),
    /**
     * Stagiaire enum role.
     */
    STAGIAIRE(2),
    /**
     * Assistant enum role.
     */
    ASSISTANT(3),
    /**
     * Secretaire juridique enum role.
     */
    SECRETAIRE_JURIDIQUE(4),
    /**
     * Collaborateur enum role.
     */
    COLLABORATEUR(5),
    /**
     * Mediateur enum role.
     */
    MEDIATEUR(6),
    /**
     * Lawyer advice client enum role.
     */
    LAWYER_ADVICE_CLIENT(7),
    /**
     * Lawyer opposing enum role.
     */
    LAWYER_OPPOSING(8),
    /**
     * Litigant opposing enum role.
     */
    LITIGANT_OPPOSING(9),
    /**
     * Lawyer client enum role.
     */
    LAWYER_CLIENT(10),
    /**
     * Lawfirm enum role.
     */
    LAWFIRM(11),
    /**
     * Litigant client enum role.
     */
    LITIGANT_CLIENT(12);

    /**
     * The Id role.
     */
    @Getter
    private int idRole;

    /**
     * Instantiates a new Enum role.
     *
     * @param idRole the id role
     */
    EnumRole(int idRole) {
        this.idRole = idRole;
    }

    /**
     * From id enum role.
     *
     * @param id the id
     * @return the enum role
     */
    public static EnumRole fromId(int id) {
        for (EnumRole role : values()) {
            if (role.getIdRole() == id)
                return role;
        }
        return null;
    }
}
