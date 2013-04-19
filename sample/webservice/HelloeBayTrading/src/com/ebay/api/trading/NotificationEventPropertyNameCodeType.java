// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Defines all property names that can be used.
 * 
 */
public enum NotificationEventPropertyNameCodeType {

    /**
     * 
   * Property name for WatchedItemEndingSoon events, enabling a user to specify a time in minutes
   * before the end of the listing. Acceptable values: 5, 10, 15, 30, 60, 75, and 180. For example,
   * to receive a WatchedItemEndingSoon notification 30 minutes before the item listing ends,
   * specify 30.
   * 
     */
    TIME_LEFT("TimeLeft"),
  

    /**
     * 
   * Reserved for future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    NotificationEventPropertyNameCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static NotificationEventPropertyNameCodeType fromValue(String v) {
        if (v != null) {
            for (NotificationEventPropertyNameCodeType c: NotificationEventPropertyNameCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}