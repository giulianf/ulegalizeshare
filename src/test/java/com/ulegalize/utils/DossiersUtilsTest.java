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
            String label = DossiersUtils.getDossierLabel("CIV", "WORK-001", "VC001");
            String expected = "CIV (WORK-001) - VC001";
            assertEquals(expected, label);
        }

        @Test
        void works_with_empty_nomenclature() {
            String label = DossiersUtils.getDossierLabel("", null, "KEY");
            String expected = " - KEY";
            assertEquals(expected, label);
        }
    }

    @Nested
    @DisplayName("getDossierLabelItem")
    class GetDossierLabelItem {
        @Test
        void returns_input_as_is() {
            String result = DossiersUtils.getDossierLabelItem("PENAL", "WORK-001");
            String expected = "PENAL (WORK-001)";
            assertEquals(expected, result);
        }
    }

    @Nested
    @DisplayName("getDossierNum")
    class GetDossierNum {
        @Test
        void pads_numbers_to_four_digits() {
            String num1 = DossiersUtils.getDossierNum(7L);
            String expected1 = "0007";
            assertEquals(expected1, num1);

            String num2 = DossiersUtils.getDossierNum(123L);
            String expected2 = "0123";
            assertEquals(expected2, num2);
        }

        @Test
        void leaves_four_or_more_digits_unchanged() {
            String num1 = DossiersUtils.getDossierNum(1234L);
            String expected1 = "1234";
            assertEquals(expected1, num1);

            String num2 = DossiersUtils.getDossierNum(98765L);
            String expected2 = "98765";
            assertEquals(expected2, num2);
        }
    }

    @Nested
    @DisplayName("getMatiereRubrique")
    class GetMatiereRubrique {
        @Test
        void returns_matiere_when_rubrique_null_or_empty() {
            String res1 = DossiersUtils.getMatiereRubrique("Droit civil", null);
            String expected1 = "Droit civil";
            assertEquals(expected1, res1);

            String res2 = DossiersUtils.getMatiereRubrique("Droit civil", "");
            String expected2 = "Droit civil";
            assertEquals(expected2, res2);
        }

        @Test
        void concatenates_with_dash_when_rubrique_present() {
            String res = DossiersUtils.getMatiereRubrique("Droit civil", "Contrats");
            String expected = "Droit civil - Contrats";
            assertEquals(expected, res);
        }
    }
}
