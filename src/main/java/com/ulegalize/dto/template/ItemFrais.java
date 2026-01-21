
package com.ulegalize.dto.template;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.annotation.Generated;

/**
 * The type Item debours.
 */
@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@Data
@NoArgsConstructor
public class ItemFrais {

    /**
     * to store in db , no localdate
     */
    protected String dateValue;
    /**
     * note
     */
    protected String note;

}
