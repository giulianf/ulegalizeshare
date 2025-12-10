package com.ulegalize.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DossiersUtilsTest {

    @Nested
    @DisplayName("getDossierLabel")
    class GetDossierLabel {
        @Test
        void combines_nomenclature_and_vcKey_with_separator() {
            String label = DossiersUtils.getDossierLabel("CIV", "VC001");
            assertEquals("CIV - VC001", label);
        }

        @Test
        void works_with_empty_nomenclature() {
            String label = DossiersUtils.getDossierLabel("", "KEY");
            assertEquals(" - KEY", label);
        }
    }

    @Nested
    @DisplayName("getDossierLabelItem")
    class GetDossierLabelItem {
        @Test
        void returns_input_as_is() {
            assertEquals("PENAL", DossiersUtils.getDossierLabelItem("PENAL"));
        }
    }

    @Nested
    @DisplayName("getDossierNum")
    class GetDossierNum {
        @Test
        void pads_numbers_to_four_digits() {
            assertEquals("0007", DossiersUtils.getDossierNum(7L));
            assertEquals("0123", DossiersUtils.getDossierNum(123L));
        }

        @Test
        void leaves_four_or_more_digits_unchanged() {
            assertEquals("1234", DossiersUtils.getDossierNum(1234L));
            assertEquals("98765", DossiersUtils.getDossierNum(98765L));
        }
    }

    @Nested
    @DisplayName("getMatiereRubrique")
    class GetMatiereRubrique {
        @Test
        void returns_matiere_when_rubrique_null_or_empty() {
            assertEquals("Droit civil", DossiersUtils.getMatiereRubrique("Droit civil", null));
            assertEquals("Droit civil", DossiersUtils.getMatiereRubrique("Droit civil", ""));
        }

        @Test
        void concatenates_with_dash_when_rubrique_present() {
            assertEquals("Droit civil - Contrats", DossiersUtils.getMatiereRubrique("Droit civil", "Contrats"));
        }
    }
}
