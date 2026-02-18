package com.ulegalize.dto.template;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ulegalize.dto.ContactSummary;
import com.ulegalize.dto.DossierDTO;
import com.ulegalize.dto.LawfirmDTO;
import com.ulegalize.dto.LawyerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * used to lawfirm to template
 */
@JsonIgnoreProperties(ignoreUnknown = true)
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

  private Map<String, List<ContactSummary>> contactsByType = new HashMap<>();

  /**
   * lawfirm
   */
  private LawfirmDTO lawfirmDTO;
}
