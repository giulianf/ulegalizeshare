
package com.ulegalize.dto.template;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.math.BigDecimal;

/**
 * The type Item.
 */
@Generated("net.hexar.json2pojo")
@Data
@NoArgsConstructor
@SuppressWarnings("unused")
public class ItemProvision extends Item {


    /**
     * to store in db , no localdate
     */
    private String dateValue;

    /**
     * @param dateValue value of invoice
     * @param amount amount  of invoice
     * @param amountTax amount ht  of invoice
     * @param description description
     */
    public ItemProvision(String dateValue, BigDecimal amount, BigDecimal amountTax, String description) {
        this.dateValue = dateValue;
        this.amount = amount;
        this.amountTax = amountTax;
        this.description = description;
    }

}
