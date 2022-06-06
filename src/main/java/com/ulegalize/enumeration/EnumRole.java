package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumRole {
    AVOCAT(1),
    STAGIAIRE(2),
    ASSISTANT(3),
    SECRETAIRE_JURIDIQUE(4),
    COLLABORATEUR(5),
    MEDIATEUR(6),
    LAWYER_ADVICE_CLIENT(7),
    LAWYER_OPPOSING(8),
    LITIGANT_OPPOSING(9),
    LAWYER_CLIENT(10),
    LAWFIRM(11),
    LITIGANT_CLIENT(12);

    @Getter
    private int idRole;

    EnumRole(int idRole) {
        this.idRole = idRole;
    }

    public static EnumRole fromId(int id) {
        for (EnumRole role : values()) {
            if (role.getIdRole() == id)
                return role;
        }
        return null;
    }
}
