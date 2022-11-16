package com.ulegalize.mail.transparency;

import lombok.Getter;

/**
 * The enum Enum mail template.
 */
public enum EnumMailTemplate {

    /**
     * Invitelitigantconseil enum mail template.
     */
// transparency
    INVITELITIGANTCONSEIL("mailInviteLitigant"),
    /**
     * Inviteconseil enum mail template.
     */
    INVITECONSEIL("mailInviteConseil"),
    /**
     * Mailblanktemplate enum mail template.
     */
    MAILBLANKTEMPLATE("mailBlankTemplate"),
    /**
     * Mailsigndocument enum mail template.
     */
    MAILSIGNDOCUMENT("mailSignDocument"),
    /**
     * Mailfinishsignownerclientdocument enum mail template.
     */
    MAILFINISHSIGNOWNERCLIENTDOCUMENT("mailFinishSignOwnerClientDocument"),
    /**
     * Mailfinishsignclientdocument enum mail template.
     */
    MAILFINISHSIGNCLIENTDOCUMENT("mailFinishSignClientDocument"),
    /**
     * Mailattachdocumentcase enum mail template.
     */
    MAILATTACHDOCUMENTCASE("mailAttachDocumentCase"),
    /**
     * Mailattachdocumentcasefromportal enum mail template.
     */
    MAILATTACHDOCUMENTCASEFROMPORTAL("mailAttachDocumentCaseFromPortal"),
    /**
     * Mailsaveownercase enum mail template.
     */
    MAILSAVEOWNERCASE("mailSaveOwnerCase"),
    /**
     * Mailupdatedocumentcase enum mail template.
     */
    MAILUPDATEDOCUMENTCASE("mailUpdateDocumentCase"),
    /**
     * Mailfinishsigndocument enum mail template.
     */
    MAILFINISHSIGNDOCUMENT("mailFinishSignDocument"),

    /**
     * Mailappointment added notification enum mail template.
     */
// lawfirm
    MAILAPPOINTMENT_ADDED_NOTIFICATION("mailAppointmentAddedNotification"),
    /**
     * Mailappointment cancel notification enum mail template.
     */
    MAILAPPOINTMENT_CANCEL_NOTIFICATION("mailAppointmentCancelNotification"),
    /**
     * Mailappointmentconfirmedtemplate enum mail template.
     */
    MAILAPPOINTMENTCONFIRMEDTEMPLATE("mailAppointmentConfirmedTemplate"),
    /**
     * Mailappointmentregisteredtemplate enum mail template.
     */
    MAILAPPOINTMENTREGISTEREDTEMPLATE("mailAppointmentRegisteredTemplate"),
    /**
     * Mailnewappointmentrequesttemplate enum mail template.
     */
    MAILNEWAPPOINTMENTREQUESTTEMPLATE("mailNewAppointmentRequestTemplate"),
    /**
     * Mailsharedfolderusertemplate enum mail template.
     */
    MAILSHAREDFOLDERUSERTEMPLATE("mailSharedFolderUserTemplate"),
    /**
     * Mailsharedusersecuritytemplate enum mail template.
     */
    MAILSHAREDUSERSECURITYTEMPLATE("mailSharedUserSecurityTemplate"),
    /**
     * Mailverifytemplate enum mail template.
     */
    MAILVERIFYTEMPLATE("mailVerifyTemplate"),
    /**
     * Mailautomaticregister enum mail template.
     */
    MAILAUTOMATICREGISTER("mailAutomaticRegister"),
    /**
     * Mailautomaticsupport enum mail template.
     */
    MAILAUTOMATICSUPPORT("mailAutomaticSupport"),
    /**
     * Mailautomaticreminder enum mail template.
     */
    MAILAUTOMATICREMINDER("mailAutomaticReminder"),
    /**
     * Mailworkspaceassociation enum mail template.
     */
    MAILWORKSPACEASSOCIATION("mailAssociation"),

    /**
     * Mailpaymentcanceltemplate enum mail template.
     */
    MAILPAYMENTCANCELTEMPLATE("mailPaymentCancel"),
    /**
     * Mailpaymentfailuretemplate enum mail template.
     */
    MAILPAYMENTFAILURETEMPLATE("mailPaymentFailure"),
    /**
     * Mailreportkpi enum mail template.
     */
    MAILREPORTKPI("mailReportKpi"),
    /**
     * Mailpostbid enum mail template.
     */
    MAILPOSTBID("mailPostBird"),

    /**
     * Mailtemplatedossier enum mail template.
     */
// Template
    MAILTEMPLATEDOSSIER("mailTemplateDossier");

    /**
     * The Name.
     */
    @Getter
    private String name;

    /**
     * Instantiates a new Enum mail template.
     *
     * @param name the name
     */
    EnumMailTemplate(String name) {
        this.name = name;
    }
}
