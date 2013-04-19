// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Indicates whether or not the user is subject to VAT.
 * Users who have registered with eBay as VAT-exempt are not
 * subject to VAT. See documentation on Value-Added Tax (VAT).
 * 
 */
public enum VATStatusCodeType {

    /**
     * 
   * (out) VAT is not applicable
   * 
     */
    NO_VAT_TAX("NoVATTax"),
  

    /**
     * 
   * (out) Residence in a country with VAT and user is not registered as VAT-exempt
   * 
     */
    VAT_TAX("VATTax"),
  

    /**
     * 
   * (out) Residence in a country with VAT and user is registered as VAT-exempt
   * 
     */
    VAT_EXEMPT("VATExempt"),
  

    /**
     * 
   * (out) Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    VATStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static VATStatusCodeType fromValue(String v) {
        if (v != null) {
            for (VATStatusCodeType c: VATStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}