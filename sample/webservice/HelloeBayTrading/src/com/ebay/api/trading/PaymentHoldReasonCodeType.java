// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Enumerated type that contains all possible reasons why the buyer's payment for
 * the order is being held by PayPal instead of being distributed to the seller's
 * account. A seller's funds for an order can be held by PayPal for as little as
 * three days after the buyer receives the order, but the hold can be up to 21
 * days based on the scenario, and in some cases, the seller's lack of action in
 * helping to expedite the release of funds.
 * 
 */
public enum PaymentHoldReasonCodeType {

    /**
     * 
   * This value indicates that the buyer's payment for the order is being held
   * by PayPal because the seller is new to selling on eBay. Sellers are
   * considered "new" until they have met all three criteria below:
   * <ul>
   * <li>More than 90 days have passed since first successful sale</li>
   * <li>More than 25 domestic sales</li>
   * <li>More than $250.00 in total sales</li>
   * </ul>
   * 
     */
    NEW_SELLER("NewSeller"),
  

    /**
     * 
   * This value indicates that the buyer's payment for the order is being held
   * by PayPal because the seller has been classified as a Below Standard
   * seller.
   * 
     */
    BELOW_STANDARD_SELLER("BelowStandardSeller"),
  

    /**
     * 
   * This value indicates that the buyer's payment for the order is being held
   * by PayPal because an eBay Buyer Protection case has been filed against
   * the order. If this value is returned, the seller can expedite the release
   * of PayPal funds into their account by resolving the eBay Buyer Protection
   * case, as indicated by a value of 'ResolveeBPCase' returned in a
   * <b>PaymentHoldDetails.RequiredSellerActionArray.RequiredSellerAction</b>
   * field.
   * 
     */
    EBP_CASE_OPEN("EbpCaseOpen"),
  

    /**
     * 
   * This value indicates that the buyer's payment for the order is being held
   * by PayPal because the seller has recently been reinstated as an active eBay
   * seller after their account went through a suspension/restricted period.
   * <br/><br/>
   * After a seller's account is suspended and then reinstated, that seller is
   * treated as a new seller, and must meet the same requirements that a new
   * seller must meet to get beyong the "New Seller" status.
   * 
     */
    REINSTATEMENT_AFTER_SUSPENSION("ReinstatementAfterSuspension"),
  

    /**
     * 
   * This value indicates that the buyer's payment for the order is being held
   * by PayPal because the seller is classified as a casual seller on eBay.
   * 
     */
    CASUAL_SELLER("CasualSeller"),
  

    /**
     * 
   * This value indicates that the buyer's payment for the order is being held
   * by PayPal because the seller's PayPal account (identified in
   * <b>Transaction.PayPalEmailAddress</b>) is new and is not
   * fully set up to receive funds.
   * 
     */
    NEW_PAYPAL_ACCOUNT_ADDED("NewPaypalAccountAdded"),
  

    /**
     * 
   * This value indicates that the reason for the buyer's payment for the order
   * being held by PayPal is not known.
   * 
     */
    NOT_AVAILABLE("NotAvailable"),
  

    /**
     * 
   * This value is reserved for internal or future use.
   * 
     */
    SELLER_IS_ON_BLACK_LIST("SellerIsOnBlackList"),
  

    /**
     * 
   * This value is returned if the reason for the buyer's payment for the order
   * being held by PayPal cannot be classified by any of the other enumeration
   * values.
   * 
     */
    OTHER("Other"),
  

    /**
     * 
   * This value is reserved for internal or future use.
   * 
     */
    NONE("None"),
  

    /**
     * 
   * This value is reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    PaymentHoldReasonCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PaymentHoldReasonCodeType fromValue(String v) {
        if (v != null) {
            for (PaymentHoldReasonCodeType c: PaymentHoldReasonCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}