// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Container for top-rated seller program codes.
 * 
 */
public enum TopRatedProgramCodeType {

    /**
     * 
   * Specifies the US Top-Rated Seller Program.
   * 
     */
    US("US"),
  

    /**
     * 
   * Specifies the UK Top-Rated Seller Program.
   * 
     */
    UK("UK"),
  

    /**
     * 
   * Specifies the German Top-Rated Seller Program.
   * 
     */
    DE("DE"),
  

    /**
     * 
   * Specifies the Global Top-Rated Seller Program.
   * 
     */
    GLOBAL("Global"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    TopRatedProgramCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static TopRatedProgramCodeType fromValue(String v) {
        if (v != null) {
            for (TopRatedProgramCodeType c: TopRatedProgramCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}