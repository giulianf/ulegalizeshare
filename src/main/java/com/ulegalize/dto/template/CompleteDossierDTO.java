package com.ulegalize.dto.template;

import com.ulegalize.dto.ContactSummary;
import com.ulegalize.dto.DossierDTO;
import com.ulegalize.dto.LawfirmDTO;
import com.ulegalize.dto.LawyerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * used to lawfirm to template
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompleteDossierDTO {
    /**
     * Template id
     */
    private Long templateId;
    /**
     * Template name
     */
    private String templateName;
    /**
     * The dossier
     */
    private DossierDTO dossierDTO;
    /**
     * user / lawyer.
     */
    private LawyerDTO lawyerDTO;
    /**
     * The Contacts client.
     */
    private List<ContactSummary> contactSummaries;
    /**
     * The Contacts opposing.
     */
    private List<ContactSummary> contactOpposing;

    /**
     * The Contacts party 1.
     */
    private List<ContactSummary> contactsParty1;
    /**
     * The Contacts party 2.
     */
    private List<ContactSummary> contactsParty2;
    /**
     * The Contacts party 3.
     */
    private List<ContactSummary> contactsParty3;
    /**
     * The Contacts party ADVICE 1.
     */
    private List<ContactSummary> contactsPartyAdv1;
    /**
     * The Contacts party ADVICE 2.
     */
    private List<ContactSummary> contactsPartyAdv2;
    /**
     * The Contacts party ADVICE 3.
     */
    private List<ContactSummary> contactsPartyAdv3;
    /**
     * The Contacts Notary.
     */
    private List<ContactSummary> contactsNotary;
    /**
     * The Contacts tribunal.
     */
    private List<ContactSummary> contactsTribunal;
    /**
     * The Contacts expert.
     */
    private List<ContactSummary> contactsExpert;
    /**
     * The Contacts Other.
     */
    private List<ContactSummary> contactsOther;
    /**
     * The Contacts Other.
     */
    private List<ContactSummary> contactsRepresentative;
    /**
     * The Contacts HUISSIER.
     */
    private List<ContactSummary> contactBailiff;
    /**
     * The Contacts conseil adv.
     */
    private List<ContactSummary> contactConseilAdv;
    /**
     * The Contacts lawyer opposing.
     */
    private List<ContactSummary> contactLawyerOpposing;
    /**
     * The Contacts Sponsor.
     */
    private List<ContactSummary> contactsSponsor;
    /**
     * The Contacts dominus litis.
     */
    private List<ContactSummary> contactsDominusLitis;
    /**
     * The Contacts insurance.
     */
    private List<ContactSummary> contactsInsurance;
    /**
     * The Contacts INVESTIGATING_JUDGE
     */
    private List<ContactSummary> contactsInvestigatingJudge;
    /**
     * The police station
     */
    private List<ContactSummary> contactsPoliceStation;
    /**
     * The Prosecutor Office
     */
    private List<ContactSummary> contactsProsecutorOffice;
    /**
     * lawfirm
     */
    private LawfirmDTO lawfirmDTO;
}
