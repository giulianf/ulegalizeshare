
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
public class ItemPrestation {

    private BigDecimal amountPrestation;
    private BigDecimal amountTaxPrestation;
    private String datePrestation;
    private String descriptionPrestation;
    private BigDecimal vatPrestation;

}
