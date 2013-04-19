// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Specifies whether a listing feature is available for the site specified in the request.
 * 
 */
public enum HighlightCodeType {

    /**
     * 
   * The listing feature is enabled for the site.
   * 
     */
    ENABLED("Enabled"),
  

    /**
     * 
   * The listing feature is disabled for the site.
   * 
     */
    DISABLED("Disabled"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    HighlightCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static HighlightCodeType fromValue(String v) {
        if (v != null) {
            for (HighlightCodeType c: HighlightCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}