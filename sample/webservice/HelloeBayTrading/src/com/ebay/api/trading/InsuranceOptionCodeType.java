// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * The seller's requirements regarding whether the buyer pays
 * for shipping insurance.
 * 
 */
public enum InsuranceOptionCodeType {

    /**
     * 
   * The seller offers the buyer the choice of paying
   * for shipping insurance or not.
   * 
     */
    OPTIONAL("Optional"),
  

    /**
     * 
   * The seller requires that the buyer pay for
   * shipping insurance.
   * 
     */
    REQUIRED("Required"),
  

    /**
     * 
   * The seller does not offer shipping insurance to the buyer.
   * 
     */
    NOT_OFFERED("NotOffered"),
  

    /**
     * 
   * The seller is not charging separately for shipping
   * insurance costs; any insurance is already included in the
   * base shipping cost.
   * 
     */
    INCLUDED_IN_SHIPPING_HANDLING("IncludedInShippingHandling"),
  

    /**
     * 
   *             Shipping insurance is not offered as a separate option on the site
   * where the item is listed. (Some shipping services, such as
   * DE_InsuredExpressOrCourier, include insurance as part of the service.) If
   * another insurance option is specified in the listing request and the site does
   * not support shipping insurance as a separate option, eBay will reset the
   * insurance option to this value. At the time of this writing, this option is
   * only meaningful for the eBay Germany, Austria, and Switzerland sites.
   * 
     */
    NOT_OFFERED_ON_SITE("NotOfferedOnSite"),
  

    /**
     * 
   * Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    InsuranceOptionCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static InsuranceOptionCodeType fromValue(String v) {
        if (v != null) {
            for (InsuranceOptionCodeType c: InsuranceOptionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}