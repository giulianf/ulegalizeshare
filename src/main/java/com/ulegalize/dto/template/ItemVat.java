
package com.ulegalize.dto.template;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.annotation.Generated;
import java.math.BigDecimal;

/**
 * The type Item vat.
 */
@Generated("net.hexar.json2pojo")
@Data
@NoArgsConstructor
@SuppressWarnings("unused")
public class ItemVat {

    /**
     * The Description vat.
     */
    private String descriptionVat;
    /**
     * The Vat vat.
     */
    private BigDecimal vatVat;
    /**
     * The Group amount vat.
     */
    private BigDecimal groupAmountVat;


}
