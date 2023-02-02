package com.ulegalize.security;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The enum Enum rights.
 */
public enum EnumRights {
    /**
     * Administrateur enum rights.
     */
    ADMINISTRATEUR(0, false),
    /**
     * Tiers lecture enum rights.
     */
    TIERS_LECTURE(1, false),
    /**
     * Dossiers lecture enum rights.
     */
    DOSSIERS_LECTURE(2, false),
    /**
     * Comptabilite lecture enum rights.
     */
    COMPTABILITE_LECTURE(3, false),
    /**
     * Echeancier lecture enum rights.
     */
    ECHEANCIER_LECTURE(4, false),
    /**
     * Comptabilite impressionderapports enum rights.
     */
    COMPTABILITE_IMPRESSIONDERAPPORTS(6, false),
    /**
     * Dossiers voiraspectsfinanciers enum rights.
     */
    DOSSIERS_VOIRASPECTSFINANCIERS(7, false),
    /**
     * Dossiers voirnoteavocat enum rights.
     */
    DOSSIERS_VOIRNOTEAVOCAT(13, false),
    /**
     * Comptabilite ecriture enum rights.
     */
    COMPTABILITE_ECRITURE(15, false),
    /**
     * Dossiers financier enum rights.
     */
    DOSSIERS_FINANCIER(17, false),
    /**
     * Timesheet ecriture enum rights.
     */
    TIMESHEET_ECRITURE(18, false),
    /**
     * Dossiers documents enum rights.
     */
    DOSSIERS_DOCUMENTS(20, false),
    /**
     * Dossiers ecriture enum rights.
     */
    DOSSIERS_ECRITURE(21, false),
    /**
     * Tiers ecriture enum rights.
     */
    TIERS_ECRITURE(22, false),
    /**
     * Tableaudebord enum rights.
     */
    TABLEAUDEBORD(23, false),
    /**
     * Echeancier ecriture enum rights.
     */
    ECHEANCIER_ECRITURE(24, false),
    /**
     * Timesheet lecture enum rights.
     */
    TIMESHEET_LECTURE(25, false),
    /**
     * Facture lecture enum rights.
     */
    FACTURE_LECTURE(26, false),
    /**
     * Facture ecriture enum rights.
     */
    FACTURE_ECRITURE(27, false),
    /**
     * Facture validation enum rights.
     */
    FACTURE_VALIDATION(28, false),
    /**
     * Facture configuration enum rights.
     */
    FACTURE_CONFIGURATION(29, false),
    /**
     * Avodrive lecture enum rights.
     */
    AVODRIVE_LECTURE(30, false),
    /**
     * Avodrive ecriture enum rights.
     */
    AVODRIVE_ECRITURE(31, false),
    /**
     * Avodrive partage enum rights.
     */
    AVODRIVE_PARTAGE(32, false),
    /**
     * Gestion du courier entrant enum rights.
     */
    GESTION_DU_COURIER_ENTRANT(33, false),
    /**
     * Calendar lecture enum rights.
     */
    CALENDAR_LECTURE(34, false),
    /**
     * Calendar ecriture enum rights.
     */
    CALENDAR_ECRITURE(35, false),
    /**
     * Justiciable ecriture enum rights.
     */
    JUSTICIABLE_ECRITURE(36, false),
    /**
     * Justiciable admin enum rights.
     */
    JUSTICIABLE_ADMIN(37, false),
    /**
     * Emails Envoyer enum rights
     */
//    EMAILS_ENVOYER(38, false),
    /**
     * Emails consulter enum rights
     */
//    EMAILS_CONSULTER(39, false),
    /**
     * The Super admin.
     */
// this is for administrative/back-office purpose
    SUPER_ADMIN(99, true);

    /**
     * The Id.
     */
    @Getter
    private int id;
    /**
     * The Admin.
     */
    @Getter
    private boolean admin;

    /**
     * Instantiates a new Enum rights.
     *
     * @param id1   the id 1
     * @param admin the admin
     */
    EnumRights(int id1, boolean admin) {
        this.id = id1;
        this.admin = admin;
    }

    /**
     * From id enum rights.
     *
     * @param id the id
     * @return the enum rights
     */
    public static EnumRights fromId(Integer id) {
        for (EnumRights role : values()) {
            if (role.getId() == id)
                return role;
        }
        return null;
    }

    /**
     * All admin list.
     *
     * @return the list
     */
    public static List<EnumRights> allAdmin() {
        return Stream.of(values()).filter(EnumRights::isAdmin).collect(Collectors.toList());
    }

    /**
     * All non admin list.
     *
     * @return the list
     */
    public static List<EnumRights> allNonAdmin() {
        return Stream.of(values()).filter(role -> !role.isAdmin()).collect(Collectors.toList());
    }
}
