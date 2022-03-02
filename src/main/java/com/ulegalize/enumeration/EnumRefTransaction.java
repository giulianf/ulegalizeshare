package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumRefTransaction {
    VIREMENT(1, "Virement", "Bank transfer", "Overschrijving"),
    CREDIT(2, "Carte de crédit", "Credit card", "Kredietkaart"),
    CASH(3, "Espèce", "Cash", "Contant geld"),
    BANCONTACT(4, "Carte de débit", "Debit card", "Debetkaart"),
    CHEQUE(5, "Chèque", "Check", "Cheque"),
    NA(6, "N/A", "N/A", "N/A");

    @Getter
    private Integer id;
    @Getter
    private String descriptionFr;
    @Getter
    private String descriptionEn;
    @Getter
    private String descriptionNl;

    EnumRefTransaction(Integer id, String descriptionFr, String descriptionEn, String descriptionNl) {
        this.id = id;
        this.descriptionFr = descriptionFr;
        this.descriptionEn = descriptionEn;
        this.descriptionNl = descriptionNl;
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
