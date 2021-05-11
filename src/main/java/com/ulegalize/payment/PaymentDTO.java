package com.ulegalize.payment;

import com.ulegalize.enumeration.EnumPaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private EnumPaymentStatus status;
    // amount of the transaction
    private Long amount;
    // transaction is belong to ...
    private String vcKey;
    private String updUser;
    private ZonedDateTime updDate;
    private String creUser;
    private ZonedDateTime creDate;

    // use to have the correct name of transaction
    private String workflowNameCode;
    private String workflowNameLabel;

    public PaymentDTO(Long id, EnumPaymentStatus status,
                      Long amount, String vcKey, String workflowNameCode,
                      String updUser, ZonedDateTime updDate, String creUser, ZonedDateTime creDate) {
        this.id = id;
        this.status = status;
        this.amount = amount;
        this.vcKey = vcKey;
        this.updUser = updUser;
        this.updDate = updDate;
        this.creUser = creUser;
        this.creDate = creDate;
        this.workflowNameCode = workflowNameCode;
    }
}
