package com.ulegalize.dto;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import com.ulegalize.enumeration.EnumVCOwner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DossierDTOConstructorTest {

  @Test
  void constructor_shouldPopulateFields_andBeUsableViaIDossierDTO_mediationTrue_sameVC() {
    // Arrange
    Long id = 42L;
    Long year = 2025L;
    Long num = 7L;
    Long userId = 10L;
    String initiales = "AB";
    BigDecimal balance = new BigDecimal("123.45");
    String vcKey = "VC123";
    EnumVCOwner owner = EnumVCOwner.OWNER_VC;
    Date open = date(2025, Calendar.JANUARY, 15);
    Date close = date(2025, Calendar.FEBRUARY, 20);
    String type = "MD"; // mediation type code in this library
    String typeDescription = "mediation"; // mediation type code in this library
    Boolean isMediation = true; // triggers label with type prefix when SAME_VC
    Date lastAccess = date(2025, Calendar.MARCH, 10);
    String partiesName = "Alice/Bob";
    String nomenclature = "2025 / 0007";
    String labelDossier = "My great dossier label";
    String drivePath = "/drive/path";
    String tagsName = "tag1, tag2";
    BigDecimal couthoraire = new BigDecimal("200");
    String avatarUrl= "api.myurl.com/{id}/avatar";

    // Act - use the projection-style constructor used by Spring Data
    DossierDTO dto = new DossierDTO(
        id, year, num,
        initiales,
        userId,
        balance, vcKey, owner,
        close, open,
        type,
        typeDescription,
        isMediation,
        lastAccess,
        partiesName,
        nomenclature,
        labelDossier,
        drivePath,
        tagsName,
        couthoraire,
        avatarUrl
    );

    // Also expose it as the interface as Spring does with Page<IDossierDTO>
    IDossierDTO projection = dto;

    // Assert basic fields are correctly populated and accessible via the interface
    assertEquals(id, projection.getId());
    assertEquals(year, projection.getYear());
    assertEquals(num, projection.getNum());
    assertEquals(initiales, projection.getInitiales());
    assertEquals(balance, projection.getBalance());
    assertEquals(owner, projection.getOwner());
    assertEquals(open, projection.getOpenDossier());
    assertEquals(close, projection.getCloseDossier());
    assertEquals(lastAccess, projection.getLastAccessDate());
    assertEquals(nomenclature, projection.getNomenclature());
    assertEquals(labelDossier, projection.getLabelDossier());
    assertEquals(drivePath, projection.getDrivePath());
    assertEquals(tagsName, projection.getTagsName());
    assertEquals(couthoraire, projection.getCouthoraire());

    // For SAME_VC (represented here by OWNER_VC for same VC) with isMediation = true, label should include the type prefix
    String expectedLabel = type + " - " + labelDossier + " (" + nomenclature + ")" + " - " + partiesName;
    assertEquals(expectedLabel, projection.getLabel());

    // The interface defines getTypeString(); the constructor sets typeCode and type enum.
    // In this DTO implementation, typeString may be null unless explicitly set elsewhere.
    assertNull(dto.getTypeString());
  }

  @Test
  void constructor_shouldBuildExpectedLabel_whenNotSameVC_andNotMediation() {
    // Arrange a second scenario to cover alternate label branch
    Long id = 100L;
    Long year = 2024L;
    Long num = 12L;
    String initiales = "CD";
    BigDecimal balance = new BigDecimal("0");
    String vcKey = "VC999";
    EnumVCOwner owner = EnumVCOwner.NOT_SAME_VC;
    Date open = date(2024, Calendar.SEPTEMBER, 1);
    Date close = null;
    String type = "CA"; // any non-null code
    String typeDescription = "ca"; // mediation type code in this library
    Boolean isMediation = false; // when false and NOT_SAME_VC -> label excludes type prefix but includes vcKey form
    Date lastAccess = new Date();
    String partiesName = "Charlie/Delta";
    String nomenclature = "2024 / 0012";
    String labelDossier = "My great dossier label";
    String drivePath = null;
    String tagsName = null;
    BigDecimal couthoraire = null;
    String avatarUrl= "api.myurl.com/{id}/avatar";
    Long userId = 10L;

    // Act
    IDossierDTO projection = new DossierDTO(
        id, year, num,
        initiales,
        userId,
        balance, vcKey, owner,
        close, open,
        type,
        typeDescription,
        isMediation,
        lastAccess,
        partiesName,
        nomenclature,
        labelDossier,
        drivePath,
        tagsName,
        couthoraire,
        avatarUrl
    );

    // Assert expected label for NOT_SAME_VC irrespective of mediation flag
    String expectedLabel = labelDossier + " (" + nomenclature + ")" + " - " + vcKey + " - " + partiesName;
    assertEquals(expectedLabel, projection.getLabel());
  }

  private static Date date(int year, int month, int dayOfMonth) {
    Calendar cal = Calendar.getInstance();
    cal.clear();
    cal.set(Calendar.YEAR, year);
    cal.set(Calendar.MONTH, month);
    cal.set(Calendar.DAY_OF_MONTH, dayOfMonth);
    return cal.getTime();
  }
}
