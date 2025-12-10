package com.ulegalize.enumeration;

import lombok.Getter;

/**
 * The enum Enum dossier contact type.
 */
public enum EnumDossierContactType {
  /**
   * Client enum dossier contact type.
   */
  CLIENT(1, false),
  /**
   * Opposing enum dossier contact type.
   */
  OPPOSING(2, false),
  /**
   * Opponent counsil enum dossier contact type.
   */
  OPPONENT_COUNSIL(4, false),
  /**
   * Other enum dossier contact type.
   */
  OTHER(5, false),
  /**
   * Opposing lawyer enum dossier contact type.
   */
  OPPOSING_LAWYER(6, false),
  /**
   * Tribunal enum dossier contact type.
   */
  TRIBUNAL(7, false),
  /**
   * Expert enum dossier contact type.
   */
  EXPERT(8, false),
  /**
   * NOTAIRE enum dossier contact type.
   */
  NOTARY(9, false),
  /**
   * BAILIFF enum dossier contact type.
   */
  BAILIFF(10, false),
  /**
   * REPRESENTATIVE enum dossier contact type.
   */
  REPRESENTATIVE(11, false),
  /**
   * 1. party
   */
  PARTY_1(12, true),
  /**
   * 2 party
   */
  PARTY_2(14, true),
  /**
   * 3 party
   */
  PARTY_3(15, true),
  /**
   * 1. OPPOSING_party
   */
  OPPOSING_PARTY_1(16, true),
  /**
   * 2 OPPOSING_party
   */
  OPPOSING_PARTY_2(17, true),
  /**
   * 3 OPPOSING_party
   */
  OPPOSING_PARTY_3(18, true),
  /**
   * SPONSOR
   */
  SPONSOR(19, false),
  /**
   * DOMINUS_LITIS
   */
  DOMINUS_LITIS(20, false),
  /**
   * INSURANCE
   */
  INSURANCE(21, false),
  /**
   * juge d instruction
   */
  INVESTIGATING_JUDGE(22, false),
  /**
   * commissariat de police
   */
  POLICE_STATION(23, false),
  /**
   * PROSECUTOR_OFFICE
   */
  PROSECUTOR_OFFICE(24, false),
  /**
   * subcontractor
   */
  SUBCONTRACTOR(25, false),
  /**
   * Broker
   */
  BROKER(26, false),

  /**
   * Liability insurance
   */
  LIABILITY_INSURANCE(27, false),

  /**
   * Comprehensive health insurance
   */
  COMPREHENSIVE_HEALTH_INSURANCE(28, false),

  /**
   * Legal protection insurance
   */
  LEGAL_PROTECTION_INSURANCE(29, false),

  /**
   * Adverse liability insurer
   */
  ADVERSE_LIABILITY_INSURER(30, false),
  /**
   * requerent
   */
  APPLICANT(31, false),
  /**
   * Propriétaire
   */
  OWNER(32, false),
  /**
   * locataire
   */
  TENANT(33, false),
  /**
   * GESTIONNNAIRE
   */
  ADMINISTRATOR(34, false),
  /**
   * Agent immobilier
   */
  REAL_ESTATE_AGENT(35, false),
  /**
   * Promoteur
   */
  PROMOTER(36, false),
  /**
   * Médiateur
   */
  MEDIATOR(37, true),
  /**
   * Conseil
   */
  ADVICE(38, false),
  /**
   * Contre-expert
   */
  COUNTER_EXPERT(39, false),
  /**
   * Architecte
   */
  ARCHITECT(40, false);

  /**
   * The Id.
   */
  @Getter
  private int id;
  @Getter
  private boolean isMediation;

  /**
   * Instantiates a new Enum dossier contact type.
   *
   * @param id the id
   */
  EnumDossierContactType(int id, boolean isMediation) {
    this.id = id;
    this.isMediation = isMediation;
  }

  /**
   * From id enum dossier contact type.
   *
   * @param id the id
   * @return the enum dossier contact type
   */
  public static EnumDossierContactType fromId(int id) {
    for (EnumDossierContactType dossierContactType : values()) {
      if (dossierContactType.getId() == id)
        return dossierContactType;
    }
    return null;
  }

}
