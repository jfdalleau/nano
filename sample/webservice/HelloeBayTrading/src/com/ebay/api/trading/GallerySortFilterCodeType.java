// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Specifies how cross-promoted items with gallery images
 * should be displayed.
 * 
 */
public enum GallerySortFilterCodeType {

    /**
     * 
   * Show any items, in no particular order.
   * 
     */
    SHOW_ANY_ITEMS("ShowAnyItems"),
  

    /**
     * 
   * Show items with gallery images first, before
   * other items.
   * 
     */
    SHOW_ITEMS_WITH_GALLERY_IMAGES_FIRST("ShowItemsWithGalleryImagesFirst"),
  

    /**
     * 
   * Show only items with gallery images.
   * 
     */
    SHOW_ONLY_ITEMS_WITH_GALLERY_IMAGES("ShowOnlyItemsWithGalleryImages"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    GallerySortFilterCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static GallerySortFilterCodeType fromValue(String v) {
        if (v != null) {
            for (GallerySortFilterCodeType c: GallerySortFilterCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}