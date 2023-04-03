
package com.ulegalize.dto.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.math.BigDecimal;

/**
 * The type Item prestation.
 */
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPrestation {

    /**
     * The Amount prestation.
     */
    private BigDecimal amountPrestation;
    /**
     * The Amount tax prestation.
     */
    private BigDecimal amountTaxPrestation;
    /**
     * The Description prestation.
     */
    private String descriptionPrestation;
    /**
     * The Vat prestation.
     */
    private BigDecimal vatPrestation;

    /**
     * dh
     */
    private BigDecimal dh = BigDecimal.ZERO;

    /**
     * dm
     */
    private BigDecimal dm = BigDecimal.ZERO;
    /**
     * cout horaire
     */
    private Integer couthoraire = 0;
}
