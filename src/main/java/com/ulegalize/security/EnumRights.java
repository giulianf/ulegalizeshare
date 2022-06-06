package com.ulegalize.security;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum EnumRights {
    ADMINISTRATEUR(0, false),
    TIERS_LECTURE(1, false),
    DOSSIERS_LECTURE(2, false),
    COMPTABILITE_LECTURE(3, false),
    ECHEANCIER_LECTURE(4, false),
    COMPTABILITE_IMPRESSIONDERAPPORTS(6, false),
    DOSSIERS_VOIRASPECTSFINANCIERS(7, false),
    DOSSIERS_VOIRNOTEAVOCAT(13, false),
    COMPTABILITE_ECRITURE(15, false),
    DOSSIERS_FINANCIER(17, false),
    TIMESHEET_ECRITURE(18, false),
    DOSSIERS_DOCUMENTS(20, false),
    DOSSIERS_ECRITURE(21, false),
    TIERS_ECRITURE(22, false),
    TABLEAUDEBORD(23, false),
    ECHEANCIER_ECRITURE(24, false),
    TIMESHEET_LECTURE(25, false),
    FACTURE_LECTURE(26, false),
    FACTURE_ECRITURE(27, false),
    FACTURE_VALIDATION(28, false),
    FACTURE_CONFIGURATION(29, false),
    AVODRIVE_LECTURE(30, false),
    AVODRIVE_ECRITURE(31, false),
    AVODRIVE_PARTAGE(32, false),
    GESTION_DU_COURIER_ENTRANT(33, false),
    CALENDAR_LECTURE(34, false),
    CALENDAR_ECRITURE(35, false),
    JUSTICIABLE_ECRITURE(36, false),
    JUSTICIABLE_ADMIN(37, false),
    // this is for administrative/back-office purpose
    SUPER_ADMIN(99, true);

    @Getter
    private int id;
    @Getter
    private boolean admin;

    EnumRights(int id1, boolean admin) {
        this.id = id1;
        this.admin = admin;
    }

    public static EnumRights fromId(Integer id) {
        for (EnumRights role : values()) {
            if (role.getId() == id)
                return role;
        }
        return null;
    }

    public static List<EnumRights> allAdmin() {
        return Stream.of(values()).filter(EnumRights::isAdmin).collect(Collectors.toList());
    }

    public static List<EnumRights> allNonAdmin() {
        return Stream.of(values()).filter(role -> !role.isAdmin()).collect(Collectors.toList());
    }
}