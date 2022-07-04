package com.ulegalize.dto.template;

import com.ulegalize.dto.ContactSummary;
import com.ulegalize.dto.DossierDTO;
import com.ulegalize.dto.LawyerDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@NoArgsConstructor
public class DossierTemplateDTO extends MainTemplateDTO {

    private DossierDTO dossier;
    private List<ContactSummary> contactsClient;
    private List<ContactSummary> contactsOpposing;
    private List<ContactSummary> contactsParty;
    private List<LawyerDTO> users;

}
