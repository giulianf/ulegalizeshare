package com.ulegalize.mail.transparency;

public enum EnumMailTemplate {
    INVITELITIGANTCONSEIL("mailInviteLitigant", "Invitation sur votre dossier", "Invitation on your folder", "Uitnodiging om aan een bestand"),
    INVITECONSEIL("mailInviteConseil", "Invitation à travailler sur un dossier", "Invitation to work on a folder", "Uitnodiging om aan een bestand te werken"),
    MAILBLANKTEMPLATE("mailBlankTemplate", "Partage de votre dossier", "Sharing your folder", "Sharing your folder"),
    MAILSIGNDOCUMENT("mailSignDocument", "Signature du document ", "Document signature", "Document handtekening"),
    MAILFINISHSIGNOWNERCLIENTDOCUMENT("mailFinishSignOwnerClientDocument", "Signature du document ", "Document signature", "Documenthandtekening"),
    MAILFINISHSIGNCLIENTDOCUMENT("mailFinishSignClientDocument", "Signature du document ", "Document signature", "Documenthandtekening"),
    MAILATTACHDOCUMENTCASE("mailAttachDocumentCase", "Signature du document ", "Document signature", "Documenthandtekening"),
    MAILSAVEOWNERCASE("mailSaveOwnerCase", "Changement de la prise en charge pour le cas juridique ", "Change of coverage for the legal case", "Een kabinet toevoegen voor de case"),
    MAILUPDATEDOCUMENTCASE("mailUpdateDocumentCase", "Modification du cas juridique ", "Modification of the legal case", "Wijziging van de rechtszaak"),
    MAILFINISHSIGNDOCUMENT("mailFinishSignDocument", "Signature du document ", "Document signature", "Documenthandtekening");

    private String name;
    private String subjectFr;
    private String subjectEn;
    private String subjectNl;

    EnumMailTemplate(String name, String subjectFr, String subjectEn, String subjectNl) {
        this.name = name;
        this.subjectFr = subjectFr;
        this.subjectEn = subjectEn;
        this.subjectNl = subjectNl;
    }

    public String getName() {
        return name;
    }

    public String getSubjectFr() {
        return subjectFr;
    }

    public String getSubjectEn() {
        return subjectEn;
    }

    public String getSubjectNl() {
        return subjectNl;
    }
}
