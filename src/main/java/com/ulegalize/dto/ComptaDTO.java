package com.ulegalize.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ComptaDTO {
    public ComptaDTO(){}
    Long id;
    Integer idType;
    ItemDto idTypeItem;
    Integer idCompte;
    LocalDate dateValue;
    BigDecimal montant;
    BigDecimal montantHt;
    Integer idTransaction;
    BigDecimal ratio;
    Integer gridId;
    Integer idPost;
    Long idUser;
    ItemLongDto idUserItem;
    Long idDoss;
    ItemLongDto idDossierItem;
    Long idFacture;
    ItemLongDto idFactureItem;
    String memo;

    String vcKey;

    ItemDto poste;
    String tiersFullname;
}
