package com.ulegalize.payment;

import com.ulegalize.enumeration.EnumPaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private EnumPaymentStatus status;
    private Long amount;
    private String vcKey;
    private String updUser;
    private Date updDate;
    private String creUser;
    private Date creDate;
}
