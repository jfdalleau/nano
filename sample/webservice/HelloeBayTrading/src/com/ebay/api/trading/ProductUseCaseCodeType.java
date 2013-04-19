// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * No longer applicable to any category.
 * 
 */
public enum ProductUseCaseCodeType {

    /**
     * 
   * (in) Use this code when calling GetProductSellingPages
   * before adding an item. This retrieves the latest product ID and the corresponding characteristic meta-data.
   * 
     */
    ADD_ITEM("AddItem"),
  

    /**
     * 
   * (in) Use this code when calling GetProductSellingPages
   * before revising an item that already contains product information.
   * If the product ID or data has changed, the original
   * product ID that you passed in and the data associated with that original version of the
   * product is returned. This is useful because the original Pre-filled Item Information
   * is used when you call ReviseItem.
   * 
     */
    REVISE_ITEM("ReviseItem"),
  

    /**
     * 
   * (in) Use this code when calling GetProductSellingPages
   * before relisting an item that already contains product information.
   * This retrieves the latest product ID and the
   * corresponding characteristic meta-data (same data as AddItem).
   * 
     */
    RELIST_ITEM("RelistItem"),
  

    /**
     * 
   * (out) Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    ProductUseCaseCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static ProductUseCaseCodeType fromValue(String v) {
        if (v != null) {
            for (ProductUseCaseCodeType c: ProductUseCaseCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}