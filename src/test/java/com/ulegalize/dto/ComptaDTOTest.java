package com.ulegalize.dto;

import com.ulegalize.enumeration.EnumLanguage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ComptaDTOTest {
    @Test
    public void testDefaultConstructor() {
        Long longConvertId = 1L;
        Long longFactureFraisId = 2L;
        boolean testInvoiceChecked = true;
        Long longConvertAlreadyInvoiced = 1L;
        boolean testAlreadyInvoiced = true;
        String factExtRef = "FV-1234";
        Long factId = 1L;
        Integer idTransaction = 2;
        long longConvertTime = LocalDate.now().getLong(ChronoField.DAY_OF_MONTH);
        LocalDate dateAction = LocalDate.ofInstant(Instant.ofEpochMilli(longConvertTime), ZoneId.systemDefault()) ;
        ComptaDTO dto =  new ComptaDTO(
                (longConvertId),
                "VCKEY.",
                1,
                "posate",
                BigDecimal.ONE,
                BigDecimal.ONE,
                "tiers",
                (longFactureFraisId),
                (testInvoiceChecked),
                (testAlreadyInvoiced),
                factId,
                factExtRef,
                idTransaction,
                EnumLanguage.FR.getShortCode(),
                dateAction
        );
        assertNotNull(dto.getId());
        assertNotNull(dto.getDateValue());
    }
}
