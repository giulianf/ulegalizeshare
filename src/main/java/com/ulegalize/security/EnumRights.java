package com.ulegalize.security;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum EnumRights {
    ADMINISTRATEUR(0, "Administrateur", false),
    TIERS_LECTURE(1, "Tiers - lecture", false),
    DOSSIERS_LECTURE(2, "Dossiers - lecture", false),
    COMPTABILITE_LECTURE(3, "Comptabilité - lecture", false),
    ECHEANCIER_LECTURE(4, "Echéancier - lecture", false),
    COMPTABILITE_IMPRESSIONDERAPPORTS(6, "Comptabilité - impression de rapports", false),
    DOSSIERS_VOIRASPECTSFINANCIERS(7, "Dossiers -  voir aspects financiers", false),
    DOSSIERS_VOIRNOTEAVOCAT(13, "Dossiers - voir note avocat", false),
    COMPTABILITE_ECRITURE(15, "Comptabilité - écriture", false),
    DOSSIERS_FINANCIER(17, "Dossiers - Financier", false),
    TIMESHEET_ECRITURE(18, "Timesheet - écriture", false),
    DOSSIERS_DOCUMENTS(20, "Dossiers - Documents", false),
    DOSSIERS_ECRITURE(21, "Dossiers - écriture", false),
    TIERS_ECRITURE(22, "Tiers - écriture", false),
    TABLEAUDEBORD(23, "Tableau de bord", false),
    ECHEANCIER_ECRITURE(24, "Echéancier - écriture", false),
    TIMESHEET_LECTURE(25, "Timesheet - lecture", false),
    FACTURE_LECTURE(26, "Facture - lecture", false),
    FACTURE_ECRITURE(27, "Facture - écriture", false),
    FACTURE_VALIDATION(28, "Facture - validation", false),
    FACTURE_CONFIGURATION(29, "Facture - configuration", false),
    AVODRIVE_LECTURE(30, "Avodrive - Lecture", false),
    AVODRIVE_ECRITURE(31, "Avodrive - Ecriture", false),
    AVODRIVE_PARTAGE(32, "Avodrive - Partage", false),
    GESTION_DU_COURIER_ENTRANT(33, "Gestion du courier entrant", false),
    CALENDAR_LECTURE(34, "Calendar - lecture", false),
    CALENDAR_ECRITURE(35, "Calendar - ecriture", false),
    JUSTICIABLE_ECRITURE(36, "Justiciable - ecriture", false),
    JUSTICIABLE_ADMIN(37, "Justiciable - admin", false),
    // this is for administrative/back-office purpose
    SUPER_ADMIN(99, "Super - Admin", true);

    private int id;
    private String description;
    private boolean admin;

    EnumRights(int id1, String description1, boolean admin) {
        this.id = id1;
        this.description = description1;
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

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAdmin() {
        return admin;
    }
}