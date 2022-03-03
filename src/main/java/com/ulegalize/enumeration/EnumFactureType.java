package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumFactureType {
    SELL(1, "Facture vente", "Sales invoice", "Verkoopfactuur", "Verkaufsrechnung", "FV"),
    CREDIT(2, "Note de crédit", "Credit score", "Creditnota", "Gutschrift", "NC"),
    TEMP(3, "Facture temporaire", "Temporary invoice", "Tijdelijke factuur", "Vorläufige Rechnung", "FT");

    @Getter
    private long id;
    @Getter
    private String descriptionFr;
    @Getter
    private String descriptionEn;
    @Getter
    private String descriptionNl;
    @Getter
    private String descriptionDe;
    @Getter
    private String code;

    EnumFactureType(long id, String descriptionFr, String descriptionEn, String descriptionNl, String descriptionDe, String code) {
        this.id = id;
        this.descriptionFr = descriptionFr;
        this.descriptionEn = descriptionEn;
        this.descriptionNl = descriptionNl;
        this.descriptionDe = descriptionDe;
        this.code = code;
    }

    public static EnumFactureType fromId(Long id) {
        for (EnumFactureType clientType : values()) {
            if (clientType.getId() == id)
                return clientType;
        }
        return null;
    }

}
