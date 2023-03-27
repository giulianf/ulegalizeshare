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
    private Long templateId;
    private String templateName;
    private DossierDTO dossierDTO;
    private LawyerDTO lawyerDTO;
    private List<ContactSummary> contactSummaries;
    private List<ContactSummary> contactOpposing;

    /**
     * The Contacts party.
     */
    private List<ContactSummary> contactsParty;
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
    private LawfirmDTO lawfirmDTO;
}
