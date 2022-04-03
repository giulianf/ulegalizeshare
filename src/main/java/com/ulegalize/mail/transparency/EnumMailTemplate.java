package com.ulegalize.mail.transparency;

import lombok.Getter;

public enum EnumMailTemplate {

    // transparency
    INVITELITIGANTCONSEIL("mailInviteLitigant", "Invitation sur votre dossier", "Invitation on your folder", "Uitnodiging om aan een bestand", "Einladung in Ihrer Datei"),
    INVITECONSEIL("mailInviteConseil", "Invitation à travailler sur un dossier", "Invitation to work on a folder", "Uitnodiging om aan een bestand te werken", "Einladung zur Bearbeitung einer Datei"),
    MAILBLANKTEMPLATE("mailBlankTemplate", "Partage de votre dossier", "Sharing your folder", "Sharing your folder", "Freigeben Ihrer Datei"),
    MAILSIGNDOCUMENT("mailSignDocument", "Signature du document ", "Document signature", "Document handtekening", "Unterschreiben des Dokuments"),
    MAILFINISHSIGNOWNERCLIENTDOCUMENT("mailFinishSignOwnerClientDocument", "Signature du document ", "Document signature", "Document handtekening", "Unterschreiben des Dokuments"),
    MAILFINISHSIGNCLIENTDOCUMENT("mailFinishSignClientDocument", "Signature du document ", "Document signature", "Document handtekening", "Unterschreiben des Dokuments"),
    MAILATTACHDOCUMENTCASE("mailAttachDocumentCase", "Document attaché ", "Document attached", "Document toegevoegd", "Angehängtes Dokument "),
    MAILATTACHDOCUMENTCASEFROMPORTAL("mailAttachDocumentCaseFromPortal", "Un fichier a été attaché au cas juridique", "A file has been attached to the legal case", "Er is een dossier bij de rechtszaak gevoegd", "Eine Datei wurde an den Rechtsfall angehängt"),
    MAILSAVEOWNERCASE("mailSaveOwnerCase", "Changement de la prise en charge pour le cas juridique ", "Change of coverage for the legal case", "Een kabinet toevoegen voor de case", "Änderung der Kostenübernahme für den Rechtsfall "),
    MAILUPDATEDOCUMENTCASE("mailUpdateDocumentCase", "Modification du cas juridique ", "Modification of the legal case", "Wijziging van de rechtszaak", "Änderung des rechtlichen Falles "),
    MAILFINISHSIGNDOCUMENT("mailFinishSignDocument", "Signature du document ", "Document signature", "Documenthandtekening", "Unterzeichnung des Dokuments "),

    // lawfirm
    MAILAPPOINTMENT_ADDED_NOTIFICATION("mailAppointmentAddedNotification", "Ulegalize: Notification agenda", "Ulegalize: Notification agenda", "Ulegalize: Notificatie agenda", "Ulegalize: Notifikation Agenda"),
    MAILAPPOINTMENT_CANCEL_NOTIFICATION("mailAppointmentCancelNotification", "Ulegalize: Annulation agenda", "Ulegalize: Cancel agenda", "Ulegalize: Cancel agenda", "Ulegalize: Annullierung der Tagesordnung"),
    MAILAPPOINTMENTCONFIRMEDTEMPLATE("mailAppointmentConfirmedTemplate", "Ulegalize: Demande de rendez-vous confirmée", "Ulegalize: Appointment request confirmed", "Ulegalize: Afspraakverzoek bevestigd", "Ulegalize: Vereinbarter Termin bestätigt"),
    MAILAPPOINTMENTREGISTEREDTEMPLATE("mailAppointmentRegisteredTemplate", "Nouvelle demande de rendez-vous", "New appointment request", "Nieuw afspraakverzoek", "Neuer Antrag auf einen Termin"),
    MAILNEWAPPOINTMENTREQUESTTEMPLATE("mailNewAppointmentRequestTemplate", "Demande de rendez-vous enregistrée", "Appointment request recorded", "Afspraakverzoek geregistreerd", "Terminanfrage ist gespeichert"),
    MAILSHAREDFOLDERUSERTEMPLATE("mailSharedFolderUserTemplate", "Nouveau partage de dossier ", "New folder sharing ", "Nieuwe mappen delen ", "Neue Freigabe des Ordners "),
    MAILSHAREDUSERSECURITYTEMPLATE("mailSharedUserSecurityTemplate", "Nouvel acces au cabinet ", "New access to the practice ", "Nieuwe toegang tot de praktijk ", "Neuer Zugang zum Kabinett "),
    MAILVERIFYTEMPLATE("mailVerifyTemplate", "Vérifiez votre email utilisateur", "Verify your user email", "Verifieer uw gebruikers-e-mailadres", "Überprüfen Sie Ihre E-Mail-Adresse"),
    MAILAUTOMATICREGISTER("mailAutomaticRegister", "Bienvenue sur le Workspace de Ulegalize", "Welcome to the Ulegalize Workspace", "Welkom bij de Ulegalize-werkruimte", "Willkommen im Ulegalize-Arbeitsbereich"),

    MAILPAYMENTCANCELTEMPLATE("mailPaymentCancel", "Annulation des modules de paiement", "Cancellation of payment modules ", "Annulering van betalingsmodules ", "Die Zahlungsmodule werden annulliert"),
    MAILPAYMENTFAILURETEMPLATE("mailPaymentFailure", "Erreur avec le mode de paiement", "Error with payment method", "Fout met betalingsmethode ", "Fehler bei der Zahlungsweise");

    @Getter
    private String name;
    @Getter
    private String subjectFr;
    @Getter
    private String subjectEn;
    @Getter
    private String subjectNl;
    @Getter
    private String subjectDe;

    EnumMailTemplate(String name, String subjectFr, String subjectEn, String subjectNl, String subjectDe) {
        this.name = name;
        this.subjectFr = subjectFr;
        this.subjectEn = subjectEn;
        this.subjectNl = subjectNl;
        this.subjectDe = subjectDe;
    }
}
