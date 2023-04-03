
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
public class ItemFraisColla extends ItemFrais {

    /**
     * The Poste colla.
     */
    private String posteColla;

    /**
     * @param posteColla    desc
     * @param tiersColla    tiers
     * @param amountHTColla amount ht
     * @param vatColla      vat
     * @param amountColla   amount
     * @param dateValue     date
     */
    public ItemFraisColla(String posteColla, String tiersColla, BigDecimal amountHTColla, Integer vatColla, BigDecimal amountColla, LocalDate dateValue, String note) {
        this.posteColla = posteColla;
        this.tiersColla = tiersColla;
        this.amountHTColla = amountHTColla;
        this.vatColla = vatColla;
        this.amountColla = amountColla;
        this.dateValue = dateValue.toString();
        this.note = note;
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

}
