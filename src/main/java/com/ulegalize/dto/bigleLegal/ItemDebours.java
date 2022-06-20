
package com.ulegalize.dto.bigleLegal;

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
public class ItemDebours {

    private String posteDebours;
    private String tiersDebours;
    private BigDecimal amountHTDebours;
    private Integer vatDebours;
    private BigDecimal amountDebours;

}
