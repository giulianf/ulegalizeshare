
package com.ulegalize.dto.template;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.math.BigDecimal;

@Generated("net.hexar.json2pojo")
@Data
@NoArgsConstructor
@SuppressWarnings("unused")
public class Item {

    private BigDecimal amount;
    private BigDecimal amountTax;
    private String description;
    private BigDecimal vat;


}
