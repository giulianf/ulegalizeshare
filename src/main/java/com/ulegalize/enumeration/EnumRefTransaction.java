package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumRefTransaction {
    VIREMENT(1, "Virement", "Bank transfer", "Overschrijving", "Überweisung"),
    CREDIT(2, "Carte de crédit", "Credit card", "Kredietkaart", "Kreditkarte"),
    CASH(3, "Espèce", "Cash", "Contant geld", "Spezies"),
    BANCONTACT(4, "Carte de débit", "Debit card", "Debetkaart", "Debitkarte"),
    CHEQUE(5, "Chèque", "Check", "Cheque", "Scheck"),
    NA(6, "N/A", "N/A", "N/A", "N/A");

    @Getter
    private Integer id;
    @Getter
    private String descriptionFr;
    @Getter
    private String descriptionEn;
    @Getter
    private String descriptionNl;
    @Getter
    private String descriptionDe;

    EnumRefTransaction(Integer id, String descriptionFr, String descriptionEn, String descriptionNl, String descriptionDe) {
        this.id = id;
        this.descriptionFr = descriptionFr;
        this.descriptionEn = descriptionEn;
        this.descriptionNl = descriptionNl;
        this.descriptionDe = descriptionDe;
    }

    public static EnumRefTransaction fromId(Integer id) {
        for (EnumRefTransaction enumRefTransaction : values()) {
            if (enumRefTransaction.getId().equals(id)) {
                return enumRefTransaction;
            }
        }
        return null;
    }
}
