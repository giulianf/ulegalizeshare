
package com.ulegalize.dto.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.math.BigDecimal;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemFraisColla {

    private String posteColla;
    private String tiersColla;
    private BigDecimal amountHTColla;
    private Integer vatColla;
    private BigDecimal amountColla;

}
