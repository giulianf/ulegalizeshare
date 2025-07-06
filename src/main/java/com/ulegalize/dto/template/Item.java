
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
public class Item {

    /**
     * The Amount.
     */
    protected BigDecimal amount;
    /**
     * The Amount tax.
     */
    protected BigDecimal amountTax;
    /**
     * The Description.
     */
    protected String description;
    /**
     * The Vat.
     */
    protected BigDecimal vat;
    /**
     * total vat
     */
    protected BigDecimal amountVat;
    /**
     * quantity
     */
    private Integer quantity;
    /**
     * untity
     */
    private String unity;


}
