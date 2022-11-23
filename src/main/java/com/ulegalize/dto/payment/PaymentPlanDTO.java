package com.ulegalize.dto.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * This class to check payment plan and if activated
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentPlanDTO implements Serializable {
    /**
     * is active or not
     */
    private boolean activated;
    /**
     * the plan selected
     */
    private String plan;
}
