
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
    private BigDecimal amount;
    /**
     * The Amount tax.
     */
    private BigDecimal amountTax;
    /**
     * The Description.
     */
    private String description;
    /**
     * The Vat.
     */
    private BigDecimal vat;


}
