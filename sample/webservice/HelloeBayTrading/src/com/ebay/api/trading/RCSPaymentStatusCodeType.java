// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * The status of a payment.
 * 
 */
public enum RCSPaymentStatusCodeType {

    /**
     * 
   * Order line item payment has been canceled.
   * (Reserved for future use.)
   * 
     */
    CANCELED("Canceled"),
  

    /**
     * 
   * Order line item payment is completed.
   * 
     */
    PAID("Paid"),
  

    /**
     * 
   * Order line item is awaiting payment.
   * 
     */
    PENDING("Pending"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    RCSPaymentStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static RCSPaymentStatusCodeType fromValue(String v) {
        if (v != null) {
            for (RCSPaymentStatusCodeType c: RCSPaymentStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}