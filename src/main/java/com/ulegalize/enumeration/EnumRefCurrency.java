package com.ulegalize.enumeration;

/**
 * The enum Enum ref currency.
 */
public enum EnumRefCurrency {
    /**
     * Cfa enum ref currency.
     */
    CFA("CFA", "CFA"),
    /**
     * Chf enum ref currency.
     */
    CHF("CHF", "CHF"),
    /**
     * Clp enum ref currency.
     */
    CLP("CLP", "$"),
    /**
     * Cny enum ref currency.
     */
    CNY("CNY", "¥"),
    /**
     * Cop enum ref currency.
     */
    COP("COP", "$"),
    /**
     * Cuc enum ref currency.
     */
    CUC("CUC", "$"),
    /**
     * Cev enum ref currency.
     */
    CEV("CEV", "$"),
    /**
     * Djf enum ref currency.
     */
    DJF("DJF", "Fdj"),
    /**
     * Dkk enum ref currency.
     */
    DKK("DKK", "kr"),
    /**
     * Dop enum ref currency.
     */
    DOP("DOP", "$"),
    /**
     * Ekk enum ref currency.
     */
    EKK("EKK", "kr"),
    /**
     * Egp enum ref currency.
     */
    EGP("EGP", "£"),
    /**
     * Ern enum ref currency.
     */
    ERN("ERN", "Nfk"),
    /**
     * Etb enum ref currency.
     */
    ETB("ETB", "Br"),
    /**
     * Eur enum ref currency.
     */
    EUR("EUR", "€"),
    /**
     * Fjd enum ref currency.
     */
    FJD("FJD", "$"),
    /**
     * Fkp enum ref currency.
     */
    FKP("FKP", "$"),
    /**
     * Gbp enum ref currency.
     */
    GBP("GBP", "£"),
    /**
     * Usd enum ref currency.
     */
    USD("USD", "$");

    /**
     * The Code.
     */
    private String code;
    /**
     * The Symbol.
     */
    private String symbol;

    /**
     * Instantiates a new Enum ref currency.
     *
     * @param code   the code
     * @param symbol the symbol
     */
    EnumRefCurrency(String code, String symbol) {
        this.code = code;
        this.symbol = symbol;
    }

    /**
     * From code enum ref currency.
     *
     * @param code the code
     * @return the enum ref currency
     */
    public static EnumRefCurrency fromCode(String code) {
        for (EnumRefCurrency enumDossierType : EnumRefCurrency.values()) {
            if (enumDossierType.getCode().equalsIgnoreCase(code))
                return enumDossierType;
        }
        return null;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Gets symbol.
     *
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

}
