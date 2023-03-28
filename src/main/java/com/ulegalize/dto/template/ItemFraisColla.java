
package com.ulegalize.dto.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * The type Item frais colla.
 */
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemFraisColla {

    /**
     * The Poste colla.
     */
    private String posteColla;

    public ItemFraisColla(String posteColla, String tiersColla, BigDecimal amountHTColla, Integer vatColla, BigDecimal amountColla, LocalDate dateValue) {
        this.posteColla = posteColla;
        this.tiersColla = tiersColla;
        this.amountHTColla = amountHTColla;
        this.vatColla = vatColla;
        this.amountColla = amountColla;
        this.dateValue = dateValue.toString();
    }

    /**
     * The Tiers colla.
     */
    private String tiersColla;
    /**
     * The Amount ht colla.
     */
    private BigDecimal amountHTColla;
    /**
     * The Vat colla.
     */
    private Integer vatColla;
    /**
     * The Amount colla.
     */
    private BigDecimal amountColla;

    /**
     * to store in db , no Zonedatetime
     */
    private String dateValue;

}
