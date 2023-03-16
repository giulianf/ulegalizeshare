package com.ulegalize.dto.template;

import com.ulegalize.dto.ContactSummary;
import com.ulegalize.dto.DossierDTO;
import com.ulegalize.dto.LawyerDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.util.List;

/**
 * The type Dossier template dto.
 */
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DossierTemplateDTO extends MainTemplateDTO {

    /**
     * The Dossier.
     */
    private DossierDTO dossier;
    /**
     * The Contacts client.
     */
    private List<ContactSummary> contactsClient;
    /**
     * The Contacts opposing.
     */
    private List<ContactSummary> contactsOpposing;
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
     * The Users.
     */
    private List<LawyerDTO> users;

}
