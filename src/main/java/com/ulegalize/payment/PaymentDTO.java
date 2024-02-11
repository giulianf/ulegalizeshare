package com.ulegalize.payment;

import com.ulegalize.enumeration.EnumPaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * The type Payment dto.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The Id.
     */
    private Long id;

    /**
     * The Status.
     */
    private EnumPaymentStatus status;
    /**
     * The Amount.
     */
// amount of the transaction
    private BigDecimal amount;
    /**
     * The Amount tt.
     */
    private BigDecimal amountTt;
    /**
     * The Invoice stripe id.
     */
    private String invoiceStripeId;
    /**
     * The start Invoice stripe id for pagination
     */
    private String invoicePdf;
    /**
     * The Type list.
     */
// type to define payjment price
    List<String> typeList;

    /**
     * The Vc key.
     */
// transaction is belong to ...
    private String vcKey;
    /**
     * The Upd user.
     */
    private String updUser;
    /**
     * The Upd date.
     */
    private LocalDateTime updDate;
    /**
     * The Cre user.
     */
    private String creUser;
    /**
     * The Cre date.
     */
    private LocalDateTime creDate;

    /**
     * The Workflow name code.
     */
// use to have the correct name of transaction
    private String workflowNameCode;
    /**
     * The Workflow name label.
     */
    private String workflowNameLabel;

    /**
     * The Object id.
     */
    private String objectId;
    /**
     * The Origin.
     */
    private String origin;

    /**
     * Instantiates a new Payment dto.
     *
     * @param id               the id
     * @param status           the status
     * @param amount           the amount
     * @param amountTt         the amount tt
     * @param invoiceStripeId  the invoice stripe id
     * @param invoicePdf  the starting invoice stripe id for pagination
     * @param vcKey            the vc key
     * @param workflowNameCode the workflow name code
     * @param updUser          the upd user
     * @param updDate          the upd date
     * @param creUser          the cre user
     * @param creDate          the cre date
     */
    public PaymentDTO(Long id, EnumPaymentStatus status,
                      BigDecimal amount, BigDecimal amountTt,
                      String invoiceStripeId,
                      String invoicePdf,
                      String vcKey, String workflowNameCode,
                      String updUser, LocalDateTime updDate, String creUser, LocalDateTime creDate) {
        this.id = id;
        this.status = status;
        this.amount = amount;
        this.amountTt = amountTt;
        this.invoiceStripeId = invoiceStripeId;
        this.invoicePdf = invoicePdf;
        this.vcKey = vcKey;
        this.updUser = updUser;
        this.updDate = updDate;
        this.creUser = creUser;
        this.creDate = creDate;
        this.workflowNameCode = workflowNameCode;
    }
}
