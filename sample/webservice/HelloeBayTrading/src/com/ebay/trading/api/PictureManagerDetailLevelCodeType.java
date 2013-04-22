// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * This type is deprecated as Pictures Manager was retired.
 * 
 * 
 */
public enum PictureManagerDetailLevelCodeType {

    /**
     * 
   * 
   * (in) All pictures, folders, and account settings. Default value.
   * 
     */
    RETURN_ALL("ReturnAll"),
  

    /**
     * 
   * 
   * (in) Only data about the account subscription.
   * 
     */
    RETURN_SUBSCRIPTION("ReturnSubscription"),
  

    /**
     * 
   * 
   * (in) Return only data about pictures and folders in the authenticated user's account.
   * 
     */
    RETURN_PICTURE("ReturnPicture"),
  

    /**
     * 
   * 
   * (out) Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    PictureManagerDetailLevelCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PictureManagerDetailLevelCodeType fromValue(String v) {
        if (v != null) {
            for (PictureManagerDetailLevelCodeType c: PictureManagerDetailLevelCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}