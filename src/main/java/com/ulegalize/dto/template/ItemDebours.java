
package com.ulegalize.dto.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * The type Item debours.
 */
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class ItemDebours extends ItemFrais {

    /**
     * The Poste debours.
     */
    private String posteDebours;
    /**
     * The Tiers debours.
     */
    private String tiersDebours;
    /**
     * The Amount ht debours.
     */
    private BigDecimal amountHTDebours;
    /**
     * The Vat debours.
     */
    private Integer vatDebours;

    /**
     * @param posteDebours    poste
     * @param tiersDebours    tiers
     * @param amountHTDebours amount th
     * @param vatDebours      vat
     * @param amountDebours   amount
     * @param dateValue       date
     * @param note            note
     */
    public ItemDebours(String posteDebours, String tiersDebours, BigDecimal amountHTDebours, Integer vatDebours, BigDecimal amountDebours, LocalDate dateValue, String note) {
        this.posteDebours = posteDebours;
        this.tiersDebours = tiersDebours;
        this.amountHTDebours = amountHTDebours;
        this.vatDebours = vatDebours;
        this.amountDebours = amountDebours;
        this.dateValue = dateValue.toString();
        this.note = note;
    }

    /**
     * The Amount debours.
     */
    private BigDecimal amountDebours;
}
