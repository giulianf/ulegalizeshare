package com.ulegalize.enumeration;

public enum EnumRole {
    AVOCAT(1, "Avocat", "Advocaat", "Lawyer"),
    STAGIAIRE(2, "Stagiaire", "Stagiair", "Trainee"),
    ASSISTANT(3, "Assistant", "Assistent", "Assistant"),
    SECRETAIRE_JURIDIQUE(4, "Secrétaire juridique", "Gerechtelijk secretaris", "Judicial secretary"),
    COLLABORATEUR(5, "Collaborateur", "Medewerker", "Collaborater"),
    MEDIATEUR(6, "Médiateur", "Bemiddelaar", "Mediator"),
    LAWYER_ADVICE_CLIENT(7, "Avocat conseil client", "Klantadviseur", "Client adviser"),
    LAWYER_OPPOSING(8, "Avocat partie adverse", "Advocaat van de tegenpartij", "Opposing party lawyer"),
    LITIGANT_OPPOSING(9, "Justiciable partie adverse", "Gerechtvaardigde tegenpartij", "Justiciable opposing party"),
    LAWYER_CLIENT(10, "Avocat client", "Klant", "Lawyer Client "),
    LAWFIRM(11, "Cabinet", "Kantoor", "Law firm"),
    LITIGANT_CLIENT(12, "Justiciable client", "Klant tegenpartij", "Litigant client");

    private int idRole;

    private String labelFr;
    private String labelNl;
    private String labelEn;

    EnumRole(int idRole,
             String labelFr,
             String labelNl, String labelEn) {
        this.idRole = idRole;
        this.labelFr = labelFr;
        this.labelNl = labelNl;
        this.labelEn = labelEn;
    }

    public static EnumRole fromId(int id) {
        for (EnumRole role : values()) {
            if (role.getIdRole() == id)
                return role;
        }
        return null;
    }

    public int getIdRole() {
        return idRole;
    }

    public String getLabelFr() {
        return labelFr;
    }

    public String getLabelNl() {
        return labelNl;
    }

    public String getLabelEn() {
        return labelEn;
    }
}
