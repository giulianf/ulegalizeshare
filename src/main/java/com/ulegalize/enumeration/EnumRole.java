package com.ulegalize.enumeration;

import lombok.Getter;

public enum EnumRole {
    AVOCAT(1, "Avocat", "Advocaat", "Lawyer", "Anwalt"),
    STAGIAIRE(2, "Stagiaire", "Stagiair", "Trainee", "Praktikant"),
    ASSISTANT(3, "Assistant", "Assistent", "Assistant", "Assistent"),
    SECRETAIRE_JURIDIQUE(4, "Secrétaire juridique", "Gerechtelijk secretaris", "Judicial secretary", "Rechtsanwaltssekretärin"),
    COLLABORATEUR(5, "Collaborateur", "Medewerker", "Collaborater", "Mitarbeiter"),
    MEDIATEUR(6, "Médiateur", "Bemiddelaar", "Mediator", "Bürgerbeauftragten"),
    LAWYER_ADVICE_CLIENT(7, "Avocat conseil client", "Klantadviseur", "Client adviser", "Rechtsanwalt mit beratender Funktion"),
    LAWYER_OPPOSING(8, "Avocat partie adverse", "Advocaat van de tegenpartij", "Opposing party lawyer", "Rechtsanwalt als Gegenpartei"),
    LITIGANT_OPPOSING(9, "Justiciable partie adverse", "Gerechtvaardigde tegenpartij", "Justiciable opposing party", "Gerichtlich einklagbare Partei"),
    LAWYER_CLIENT(10, "Avocat client", "Klant", "Lawyer Client ", "Rechtsanwalt als Mandant"),
    LAWFIRM(11, "Cabinet", "Kantoor", "Law firm", "Kabinett"),
    LITIGANT_CLIENT(12, "Justiciable client", "Klant tegenpartij", "Litigant client", "Einkäufer");

    @Getter
    private int idRole;

    @Getter
    private String labelFr;
    @Getter
    private String labelNl;
    @Getter
    private String labelEn;
    @Getter
    private String labelDe;

    EnumRole(int idRole,
             String labelFr,
             String labelNl,
             String labelEn,
             String labelDe) {
        this.idRole = idRole;
        this.labelFr = labelFr;
        this.labelNl = labelNl;
        this.labelEn = labelEn;
        this.labelDe = labelDe;
    }

    public static EnumRole fromId(int id) {
        for (EnumRole role : values()) {
            if (role.getIdRole() == id)
                return role;
        }
        return null;
    }
}
