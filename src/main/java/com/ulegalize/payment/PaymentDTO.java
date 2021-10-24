package com.ulegalize.payment;

import com.ulegalize.enumeration.EnumPaymentStatus;
import com.ulegalize.enumeration.EnumUsignOrigin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private EnumPaymentStatus status;
    // amount of the transaction
    private BigDecimal amount;
    private BigDecimal amountTt;
    private String invoiceStripeId;
    // type to define payjment price
    List<String> typeList;

    // transaction is belong to ...
    private String vcKey;
    private String updUser;
    private LocalDateTime updDate;
    private String creUser;
    private LocalDateTime creDate;

    // use to have the correct name of transaction
    private String workflowNameCode;
    private String workflowNameLabel;

    private String objectId;
    private EnumUsignOrigin enumUsignOrigin;

    public PaymentDTO(Long id, EnumPaymentStatus status,
                      BigDecimal amount, BigDecimal amountTt, String invoiceStripeId,
                      String vcKey, String workflowNameCode,
                      String updUser, LocalDateTime updDate, String creUser, LocalDateTime creDate) {
        this.id = id;
        this.status = status;
        this.amount = amount;
        this.amountTt = amountTt;
        this.invoiceStripeId = invoiceStripeId;
        this.vcKey = vcKey;
        this.updUser = updUser;
        this.updDate = updDate;
        this.creUser = creUser;
        this.creDate = creDate;
        this.workflowNameCode = workflowNameCode;
    }
}
