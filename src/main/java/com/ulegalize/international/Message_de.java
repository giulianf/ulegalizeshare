package com.ulegalize.international;

import java.util.ListResourceBundle;

/**
 * The type Message de.
 */
public class Message_de extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"VIREMENT", "Überweisung"},
                {"CREDIT", "Kreditkarte"},
                {"CASH", "Kasse"},
                {"BANCONTACT", "Debitkarte"},
                {"CHEQUE", "Scheck"},
                {"NA", "N/A"},
                {"SELL", "Verkaufsrechnung"},
                {"CREDIT", "Gutschrift"},
                {"TEMP", "Vorläufige Rechnung"},
                {"TEMP_NC", "Vorläufige Gutschrift"},
                {"PRO_ACCOUNT", "Professionelles Konto"},
                {"ACCOUNT_TIERS", "Drittkonto / CARPA"},
                {"PERM", "Ständigen"},
                {"RECORD", "Task speichern"},
                {"TASK", "Aufgabe"},
                {"RDV", "Termin"},
                {"AUD", "Anhörung"},
                {"OTH", "Ander"},
                {"BA", "BFRUR"},
                {"CS", "Rat"},
                {"DC", "Fall"},
                {"DF", "Verbandsrechtlich"},
                {"MD", "Mediation"},
                {"AVOCAT", "Anwalt"},
                {"STAGIAIRE", "Praktikant"},
                {"ASSISTANT", "Assistent"},
                {"SECRETAIRE_JURIDIQUE", "Rechtsanwaltssekretärin"},
                {"COLLABORATEUR", "Mitarbeiter"},
                {"MEDIATEUR", "Bürgerbeauftragten"},
                {"LAWYER_ADVICE_CLIENT", "Rechtsanwalt mit beratender Funktion"},
                {"LAWYER_OPPOSING", "Rechtsanwalt als Gegenpartei"},
                {"LITIGANT_OPPOSING", "Gerichtlich einklagbare Partei"},
                {"LAWYER_CLIENT", "Rechtsanwalt als Mandant"},
                {"LAWFIRM", "Kabinett"},
                {"LITIGANT_CLIENT", "Einkäufer"},
                {"F", "Frau"},
                {"L", "Fehlschlagen"},
                {"M", "Herr"},
                {"A", "Meister"},
                {"CHANNEL", "Channel"},
                {"M_001", "mit"},
                {"SORTIE", "Ausgang"},
                {"ENTREE", "Eingang"},

                {"INVITELITIGANTCONSEIL", "Einladung in Ihrer Datei"},
                {"INVITECONSEIL", "Einladung zur Bearbeitung einer Datei"},
                {"MAILBLANKTEMPLATE", "Freigeben Ihrer Datei"},
                {"MAILSIGNDOCUMENT", "Unterschreiben des Dokuments"},
                {"MAILFINISHSIGNOWNERCLIENTDOCUMENT", "Unterschreiben des Dokuments"},
                {"MAILFINISHSIGNCLIENTDOCUMENT", "Unterschreiben des Dokuments"},
                {"MAILATTACHDOCUMENTCASE", "Angehängtes Dokument "},
                {"MAILATTACHDOCUMENTCASEFROMPORTAL", "Eine Datei wurde an den Rechtsfall angehängt"},
                {"MAILSAVEOWNERCASE", "Änderung der Kostenübernahme für den Rechtsfall "},
                {"MAILUPDATEDOCUMENTCASE", "Änderung des rechtlichen Falles "},
                {"MAILFINISHSIGNDOCUMENT", "Unterzeichnung des Dokuments "},
                {"MAILAPPOINTMENT_ADDED_NOTIFICATION", "Ulegalize: Notifikation Agenda"},
                {"MAILAPPOINTMENT_CANCEL_NOTIFICATION", "Ulegalize: Annullierung der Tagesordnung"},
                {"MAILAPPOINTMENTCONFIRMEDTEMPLATE", "Ulegalize: Vereinbarter Termin bestätigt"},
                {"MAILAPPOINTMENTREGISTEREDTEMPLATE", "Neuer Antrag auf einen Termin"},
                {"MAILNEWAPPOINTMENTREQUESTTEMPLATE", "Terminanfrage ist gespeichert"},
                {"MAILSHAREDFOLDERUSERTEMPLATE", "Neue Freigabe des Ordners "},
                {"MAILSHAREDUSERSECURITYTEMPLATE", "Neuer Zugang zum Kabinett "},
                {"MAILVERIFYTEMPLATE", "Überprüfen Sie Ihre E-Mail-Adresse"},
                {"MAILAUTOMATICREGISTER", "Willkommen in Ihrem neuen digitalen Arbeitsplatz"},
                {"MAILAUTOMATICSUPPORT", "Erste Schritte & digitale Unterstützung"},
                {"MAILAUTOMATICREMINDER", "Erinnerungsunterstützung im Workspace"},
                {"MAILWORKSPACEASSOCIATION", "Antrag auf Assoziierung mit der Kanzlei"},
                {"MAILPAYMENTCANCELTEMPLATE", "Die Zahlungsmodule werden annulliert"},
                {"MAILPAYMENTFAILURETEMPLATE", "Antrag auf Partnerschaft mit der Anwaltskanzlei"},
                {"MAILREPORTKPI", "Report KPI"},
                {"MAILPOSTBID", "Status Ihrer Sendung"},
                {"envoi", "Report KPI"},
                {"ADMINISTRATEUR", "Administrateur"},
                {"TIERS_LECTURE", "Dritte - Lesen"},
                {"DOSSIERS_LECTURE", "Ordner - Lesen"},
                {"COMPTABILITE_LECTURE", "Rechnungswesen - Lesen"},
                {"ECHEANCIER_LECTURE", "Rechenschieber - Lesen"},
                {"COMPTABILITE_IMPRESSIONDERAPPORTS", "Rechnungswesen - Druck von Berichten"},
                {"DOSSIERS_VOIRASPECTSFINANCIERS", "Ordner - siehe finanzielle Aspekte"},
                {"DOSSIERS_VOIRNOTEAVOCAT", "Ordner - siehe Vermerk Anwalt"},
                {"COMPTABILITE_ECRITURE", "Rechnungswesen - Schreiben"},
                {"DOSSIERS_FINANCIER", "Ordner - Financier"},
                {"TIMESHEET_ECRITURE", "Leistung - Schreiben"},
                {"DOSSIERS_DOCUMENTS", "Ordner - Documents"},
                {"DOSSIERS_ECRITURE", "Ordner - Schreiben"},
                {"TIERS_ECRITURE", "Dritte - Schreiben"},
                {"TABLEAUDEBORD", "Armaturenbrett"},
                {"ECHEANCIER_ECRITURE", "Rechenschieber - Schreiben"},
                {"TIMESHEET_LECTURE", "Leistung - Lesen"},
                {"FACTURE_LECTURE", "Rechnung - Lesen"},
                {"FACTURE_ECRITURE", "Rechnung - Schreiben"},
                {"FACTURE_VALIDATION", "Rechnung - Validierung"},
                {"FACTURE_CONFIGURATION", "Rechnung - Konfiguration"},
                {"AVODRIVE_LECTURE", "UDrive - Lesen"},
                {"AVODRIVE_ECRITURE", "UDrive - Schreiben"},
                {"AVODRIVE_PARTAGE", "UDrive - Teilen"},
                {"GESTION_DU_COURIER_ENTRANT", "Verwaltung des ankommenden Kuriers"},
                {"CALENDAR_LECTURE", "Kalender - Lesen"},
                {"CALENDAR_ECRITURE", "Kalender - Schreiben"},
                {"JUSTICIABLE_ECRITURE", "Gerichtlich - Schreiben"},
                {"JUSTICIABLE_ADMIN", "Gerichtlich - Admin"},
                {"SUPER_ADMIN", "Super - Admin"},
                // Template
                {"MAILTEMPLATEDOSSIER", "Ihr Dokument kann bearbeitet werden."},
                // EnumDossierContactType
                {"CLIENT", "Kunde"},
                {"OPPOSING", "Gegenpartei"},
                {"PARTY", "Partei"},
                {"OPPONENT_COUNSIL", "Gegner beraten"},
                {"OTHER", "Andere"},
                {"OPPOSING_LAWYER", "gegnerischer anwalt"},
        };
    }

}
