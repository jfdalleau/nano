// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * RecommendationEngineCodeType - Type declaration to be used by other schema.
 * Identifies the engines that can be used to analyze proposed listing data.
 * See the Developer's Guide for a list of recommendation engines that
 * are currently operational.
 * 
 */
public enum RecommendationEngineCodeType {

    /**
     * 
   * (in) Listing Analyzer engine; Returns tips related to fields
   * that a seller wants to specify in a listing.
   * 
     */
    LISTING_ANALYZER("ListingAnalyzer"),
  

    /**
     * 
   * (in) Reserved for internal or future use.
   * 
     */
    SIFFTAS("SIFFTAS"),
  

    /**
     * 
   * (in) Product Pricing engine. Returns average start and sold prices
   * of completed items that were listed a specified product ID.
   * 
     */
    PRODUCT_PRICING("ProductPricing"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode"),
  

    /**
     * 
   * (in) Suggested Attributes engine. Returns suggested attributes
   * and catalog products (for Pre-filled Item Information) that have been
   * used by other sellers who listed similar items in the same category.
   * 
     */
    SUGGESTED_ATTRIBUTES("SuggestedAttributes"),
  

    /**
     * 
   * (in) Custom Item Specifics engine. Returns the most popular
   * names and values to use for custom Item Specifics based the
   * requested category (and the Title, if specified).
   * 
     */
    ITEM_SPECIFICS("ItemSpecifics");
  
  
    private final String value;
  
    RecommendationEngineCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static RecommendationEngineCodeType fromValue(String v) {
        if (v != null) {
            for (RecommendationEngineCodeType c: RecommendationEngineCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}