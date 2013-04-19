// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * The VeRO reporting status for an item.
 * 
 */
public enum VeROItemStatusCodeType {

    /**
     * 
   * (out) The VeRO report request for the item has been received by eBay.
   * 
     */
    RECEIVED("Received"),
  

    /**
     * 
   * (out) The VeRO report request for the item has been submitted to eBay.
   * 
     */
    SUBMITTED("Submitted"),
  

    /**
     * 
   * (out) The reported item has been ended by eBay.
   * 
     */
    REMOVED("Removed"),
  

    /**
     * 
   * (out) The VeRO report request for the item failed.
   * 
     */
    SUBMISSION_FAILED("SubmissionFailed"),
  

    /**
     * 
   * (out) The VeRO report request for the item has been received by eBay, but
   * additional clarification is needed before eBay can end the item.
   * 
     */
    CLARIFICATION_REQUIRED("ClarificationRequired"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    VeROItemStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static VeROItemStatusCodeType fromValue(String v) {
        if (v != null) {
            for (VeROItemStatusCodeType c: VeROItemStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}