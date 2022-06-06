package com.ulegalize.mail.transparency;

import lombok.Getter;

public enum EnumMailTemplate {

    // transparency
    INVITELITIGANTCONSEIL("mailInviteLitigant"),
    INVITECONSEIL("mailInviteConseil"),
    MAILBLANKTEMPLATE("mailBlankTemplate"),
    MAILSIGNDOCUMENT("mailSignDocument"),
    MAILFINISHSIGNOWNERCLIENTDOCUMENT("mailFinishSignOwnerClientDocument"),
    MAILFINISHSIGNCLIENTDOCUMENT("mailFinishSignClientDocument"),
    MAILATTACHDOCUMENTCASE("mailAttachDocumentCase"),
    MAILATTACHDOCUMENTCASEFROMPORTAL("mailAttachDocumentCaseFromPortal"),
    MAILSAVEOWNERCASE("mailSaveOwnerCase"),
    MAILUPDATEDOCUMENTCASE("mailUpdateDocumentCase"),
    MAILFINISHSIGNDOCUMENT("mailFinishSignDocument"),

    // lawfirm
    MAILAPPOINTMENT_ADDED_NOTIFICATION("mailAppointmentAddedNotification"),
    MAILAPPOINTMENT_CANCEL_NOTIFICATION("mailAppointmentCancelNotification"),
    MAILAPPOINTMENTCONFIRMEDTEMPLATE("mailAppointmentConfirmedTemplate"),
    MAILAPPOINTMENTREGISTEREDTEMPLATE("mailAppointmentRegisteredTemplate"),
    MAILNEWAPPOINTMENTREQUESTTEMPLATE("mailNewAppointmentRequestTemplate"),
    MAILSHAREDFOLDERUSERTEMPLATE("mailSharedFolderUserTemplate"),
    MAILSHAREDUSERSECURITYTEMPLATE("mailSharedUserSecurityTemplate"),
    MAILVERIFYTEMPLATE("mailVerifyTemplate"),
    MAILAUTOMATICREGISTER("mailAutomaticRegister"),
    MAILAUTOMATICSUPPORT("mailAutomaticSupport"),
    MAILAUTOMATICREMINDER("mailAutomaticReminder"),
    MAILWORKSPACEASSOCIATION("mailAssociation"),

    MAILPAYMENTCANCELTEMPLATE("mailPaymentCancel"),
    MAILPAYMENTFAILURETEMPLATE("mailPaymentFailure");

    @Getter
    private String name;

    EnumMailTemplate(String name) {
        this.name = name;
    }
}
