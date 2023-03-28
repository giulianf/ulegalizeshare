
package com.ulegalize.dto.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.math.BigDecimal;

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
