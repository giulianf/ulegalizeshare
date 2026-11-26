package com.ulegalize.dto.events.payment;

import java.time.Instant;

/** Complete commercial state for one workspace, keyed by vcKey. */
public record EInvoiceEntitlementEvent(
    String vcKey,
    boolean active,
    BillingMode billingMode,
    Pack pack,
    Integer annualAllowance,
    Instant effectiveFrom,
    long revision
) {
  public enum BillingMode { LEGACY, ANNUAL }

  public enum Pack {
    NONE(0), FLOWS_200(200), FLOWS_2000(2000), FLOWS_4500(4500);

    private final int allowance;

    Pack(int allowance) {
      this.allowance = allowance;
    }

    public int allowance() {
      return allowance;
    }
  }
}
