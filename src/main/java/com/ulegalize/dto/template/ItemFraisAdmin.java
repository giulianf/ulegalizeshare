
package com.ulegalize.dto.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * The type Item frais admin.
 */
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemFraisAdmin {

    /**
     * @param descriptionFraisAdmin  desc
     * @param mesureFraisAdmin       mesure
     * @param pricePerUnitFraisAdmin price unit
     * @param unitFraisAdmin         unit
     * @param dateAction             date
     */
    public ItemFraisAdmin(String descriptionFraisAdmin, String mesureFraisAdmin, BigDecimal pricePerUnitFraisAdmin, BigDecimal unitFraisAdmin, ZonedDateTime dateAction) {
        this.descriptionFraisAdmin = descriptionFraisAdmin;
        this.mesureFraisAdmin = mesureFraisAdmin;
        this.pricePerUnitFraisAdmin = pricePerUnitFraisAdmin;
        this.unitFraisAdmin = unitFraisAdmin;
        this.dateAction = dateAction.toString();
    }

    /**
     * The Description frais admin.
     */
    private String descriptionFraisAdmin;
    /**
     * The Mesure frais admin.
     */
    private String mesureFraisAdmin;
    /**
     * The Price per unit frais admin.
     */
    private BigDecimal pricePerUnitFraisAdmin;
    /**
     * The Unit frais admin.
     */
    private BigDecimal unitFraisAdmin;

    /**
     * to store in db , no localdate
     */
    private String dateAction;

}
