package com.ulegalize.security;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum EnumRights {
    ADMINISTRATEUR(0, "Administrateur", "Administrateur", "Administrator", "Administrator", false),
    TIERS_LECTURE(1, "Tiers - Lecture","Derde partij - lezen","Third Party - Read","Dritte - Lesen", false),
    DOSSIERS_LECTURE(2, "Dossiers - Lecture", "Mappen - lezen", "Folders - Reading", "Ordner - lesen", false),
    COMPTABILITE_LECTURE(3, "Comptabilité - Lecture", "Accounting - lezen", "Accounting - Reading", "Rechnungswesen - Lesen", false),
    ECHEANCIER_LECTURE(4, "Echéancier - Lecture", "Schema - lezen", "Schedule - Reading", "Rechenschieber - Lesen", false),
    COMPTABILITE_IMPRESSIONDERAPPORTS(6, "Comptabilité - Impression de rapports", "Accounting - rapporten afdrukken", "Accounting - printing reports", "Rechnungswesen - Druck von Berichten", false),
    DOSSIERS_VOIRASPECTSFINANCIERS(7, "Dossiers - Voir aspects financiers", "Records - zie financiële aspecten", "Records - see financial aspects", "Dossiers -  siehe finanzielle Aspekte", false),
    DOSSIERS_VOIRNOTEAVOCAT(13, "Dossiers - Voir note avocat",  "Dossiers - zie opmerking voor advies", "Files - see note for counsel", "Akten - siehe Vermerk Anwalt", false),
    COMPTABILITE_ECRITURE(15, "Comptabilité - Écriture", "Boekhouding - schrijven", "Accounting - Writing", "Buchhaltung - Schreiben",  false),
    DOSSIERS_FINANCIER(17, "Dossiers - Financier",  "Records - Financieel", "Records - Financial", "Dossiers - Financial", false),
    TIMESHEET_ECRITURE(18, "Timesheet - Écriture",  "Urenstaat - schrijven", "Timesheet - writing", "Timesheet - Schreiben", false),
    DOSSIERS_DOCUMENTS(20, "Dossiers - Documents", "Records - documenten", "Records - Documents", "Ordner - Dokumente", false),
    DOSSIERS_ECRITURE(21, "Dossiers - Écriture", "Records - schrijven", "Records - Writing", "Ordner - schreiben", false),
    TIERS_ECRITURE(22, "Tiers - Écriture", "Derde partij - schrijven", "Third Party - Writing", "Dritte - schreiben", false),
    TABLEAUDEBORD(23, "Tableau de bord", "Zeiger - schreiben", "Dashboard", "Armaturenbrett", false),
    ECHEANCIER_ECRITURE(24, "Echéancier - Écriture", "Schema - geschreven", "Schedule - written", "Fälligkeit - schriftliche Ausfertigung", false),
    TIMESHEET_LECTURE(25, "Prestation - Lecture", "Voordeel - lezen", "Timesheet - reading", "Leistung - Lesen", false),
    FACTURE_LECTURE(26, "Facture - Lecture", "Factuur - gelezen", "Invoice - Read", "Rechnung - lesen", false),
    FACTURE_ECRITURE(27, "Facture - Écriture", "Factuur - invoer", "Invoice - Entry", "Rechnung - Schreiben", false),
    FACTURE_VALIDATION(28, "Facture - Validation", "", "", "", false),
    FACTURE_CONFIGURATION(29, "Facture - Configuration", "Factuur - Configuratie", "Invoice - Configuration", "Rechnung - Konfiguration", false),
    AVODRIVE_LECTURE(30, "UDrive - Lecture", "UDrive - afspelen", "UDrive - Playback", "UDrive - Lesung", false),
    AVODRIVE_ECRITURE(31, "UDrive - Ecriture", "UDrive - schrijven", "UDrive - Writing", "UDrive - Schrift", false),
    AVODRIVE_PARTAGE(32, "UDrive - Partage", "UDrive - Delen", "UDrive - Sharing", "UDrive - Teilen", false),
    GESTION_DU_COURIER_ENTRANT(33, "Gestion du courier entrant", "Inkomend koeriersbeheer", "Incoming Courier Management", "Verwaltung des ankommenden Kuriers", false),
    CALENDAR_LECTURE(34, "Calendar - Lecture", "Agenda - Lezen", "Calendar - Reading", "Kalender - Lesen", false),
    CALENDAR_ECRITURE(35, "Calendar - Écriture", "Agenda - Schrijven", "Calendar - Writing", "Kalender - Schreiben", false),
    JUSTICIABLE_ECRITURE(36, "Justiciable - Écriture", "Geschil - Schrijven", "Litigant - Writing", "Gerichtlich - Schreiben", false),
    JUSTICIABLE_ADMIN(37, "Justiciable - Admin", "Rechtsmiddel - Admin", "Litigant - Admin", "Justiciable - Admin", false),
    // this is for administrative/back-office purpose
    SUPER_ADMIN(99, "Super - Admin", "Super - Admin", "Super - Admin", "Super - Admin", true);

    @Getter
    private int id;
    @Getter
    private String descriptionFr;
    @Getter
    private String descriptionNl;
    @Getter
    private String descriptionEn;
    @Getter
    private String descriptionDe;
    @Getter
    private boolean admin;

    EnumRights(int id1, String descriptionFr, String descriptionNl, String descriptionEn, String descriptionDe, boolean admin) {
        this.id = id1;
        this.descriptionFr = descriptionFr;
        this.descriptionNl = descriptionNl;
        this.descriptionEn = descriptionEn;
        this.descriptionDe = descriptionDe;
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