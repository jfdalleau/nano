// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Status values for the processing progress for the category structure changes
 * specified by a SetStoreCategories request. If the SetStoreCategories call is
 * processed asynchronously, then the status is returned by
 * GetStoreCategoryUpdateStatus, otherwise, the status is returned in the
 * SetStoreCategories response.
 * 
 */
public enum TaskStatusCodeType {

    /**
     * 
   * (out) The category changes have not started.
   * 
     */
    PENDING("Pending"),
  

    /**
     * 
   * (out) The category changes are in progress.
   * 
     */
    IN_PROGRESS("InProgress"),
  

    /**
     * 
   * (out) The category changes completed successfully.
   * 
     */
    COMPLETE("Complete"),
  

    /**
     * 
   * (out) The category changes failed.
   * 
     */
    FAILED("Failed"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    TaskStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static TaskStatusCodeType fromValue(String v) {
        if (v != null) {
            for (TaskStatusCodeType c: TaskStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}