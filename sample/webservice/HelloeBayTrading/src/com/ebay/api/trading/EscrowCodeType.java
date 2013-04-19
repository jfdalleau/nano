// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * This type is deprecated because this type is not used by any call.
 * 
 * 
 */
public enum EscrowCodeType {

    /**
     * 
   * 
   * By Buyer
   * 
     */
    BY_BUYER("ByBuyer"),
  

    /**
     * 
   * 
   * By Seller
   * 
     */
    BY_SELLER("BySeller"),
  

    /**
     * 
   * 
   * None
   * 
     */
    NONE("None"),
  

    /**
     * 
   * 
   * Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    EscrowCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static EscrowCodeType fromValue(String v) {
        if (v != null) {
            for (EscrowCodeType c: EscrowCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}