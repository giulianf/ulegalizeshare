
package com.ulegalize.dto.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.math.BigDecimal;

/**
 * The type Item debours.
 */
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDebours {

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
     * The Amount debours.
     */
    private BigDecimal amountDebours;

}
