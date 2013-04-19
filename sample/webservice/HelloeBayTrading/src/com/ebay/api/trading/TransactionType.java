// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * This type defines the Transaction container, which consists of detailed information
 * about a single line item in an order. The eBay system creates an order line item
 * when a buyer has committed to make a purchase in an auction or fixed-price listing.
 * A multiple-quantity, fixed-priced listing can spawn one or more order line items.
 * Auction listings and single-quantity, fixed-price listings can only spawn one order
 * line item.
 * 
 * <br>
 * 
 */
public class TransactionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AmountPaid")
	@Order(value=0)
	public AmountType amountPaid;	
	
	@Element(name = "AdjustmentAmount")
	@Order(value=1)
	public AmountType adjustmentAmount;	
	
	@Element(name = "ConvertedAdjustmentAmount")
	@Order(value=2)
	public AmountType convertedAdjustmentAmount;	
	
	@Element(name = "Buyer")
	@Order(value=3)
	public UserType buyer;	
	
	@Element(name = "ShippingDetails")
	@Order(value=4)
	public ShippingDetailsType shippingDetails;	
	
	@Element(name = "ConvertedAmountPaid")
	@Order(value=5)
	public AmountType convertedAmountPaid;	
	
	@Element(name = "ConvertedTransactionPrice")
	@Order(value=6)
	public AmountType convertedTransactionPrice;	
	
	@Element(name = "CreatedDate")
	@Order(value=7)
	public Date createdDate;	
	
	@Element(name = "DepositType")
	@Order(value=8)
	public DepositTypeCodeType depositType;	
	
	@Element(name = "Item")
	@Order(value=9)
	public ItemType item;	
	
	@Element(name = "QuantityPurchased")
	@Order(value=10)
	public Integer quantityPurchased;	
	
	@Element(name = "Status")
	@Order(value=11)
	public TransactionStatusType status;	
	
	@Element(name = "TransactionID")
	@Order(value=12)
	public String transactionID;	
	
	@Element(name = "TransactionPrice")
	@Order(value=13)
	public AmountType transactionPrice;	
	
	@Element(name = "BestOfferSale")
	@Order(value=14)
	public Boolean bestOfferSale;	
	
	@Element(name = "VATPercent")
	@Order(value=15)
	public BigDecimal vatPercent;	
	
	@Element(name = "ExternalTransaction")
	@Order(value=16)
	public List<ExternalTransactionType> externalTransaction;	
	
	@Element(name = "SellingManagerProductDetails")
	@Order(value=17)
	public SellingManagerProductDetailsType sellingManagerProductDetails;	
	
	@Element(name = "ShippingServiceSelected")
	@Order(value=18)
	public ShippingServiceOptionsType shippingServiceSelected;	
	
	@Element(name = "BuyerMessage")
	@Order(value=19)
	public String buyerMessage;	
	
	@Element(name = "DutchAuctionBid")
	@Order(value=20)
	public AmountType dutchAuctionBid;	
	
	@Element(name = "BuyerPaidStatus")
	@Order(value=21)
	public PaidStatusCodeType buyerPaidStatus;	
	
	@Element(name = "SellerPaidStatus")
	@Order(value=22)
	public PaidStatusCodeType sellerPaidStatus;	
	
	@Element(name = "PaidTime")
	@Order(value=23)
	public Date paidTime;	
	
	@Element(name = "ShippedTime")
	@Order(value=24)
	public Date shippedTime;	
	
	@Element(name = "TotalPrice")
	@Order(value=25)
	public AmountType totalPrice;	
	
	@Element(name = "FeedbackLeft")
	@Order(value=26)
	public FeedbackInfoType feedbackLeft;	
	
	@Element(name = "FeedbackReceived")
	@Order(value=27)
	public FeedbackInfoType feedbackReceived;	
	
	@Element(name = "ContainingOrder")
	@Order(value=28)
	public OrderType containingOrder;	
	
	@Element(name = "FinalValueFee")
	@Order(value=29)
	public AmountType finalValueFee;	
	
	@Element(name = "ListingCheckoutRedirectPreference")
	@Order(value=30)
	public ListingCheckoutRedirectPreferenceType listingCheckoutRedirectPreference;	
	
	@Element(name = "RefundArray")
	@Order(value=31)
	public RefundArrayType refundArray;	
	
	@Element(name = "TransactionSiteID")
	@Order(value=32)
	public SiteCodeType transactionSiteID;	
	
	@Element(name = "Platform")
	@Order(value=33)
	public TransactionPlatformCodeType platform;	
	
	@Element(name = "CartID")
	@Order(value=34)
	public String cartID;	
	
	@Element(name = "SellerContactBuyerByEmail")
	@Order(value=35)
	public Boolean sellerContactBuyerByEmail;	
	
	@Element(name = "PayPalEmailAddress")
	@Order(value=36)
	public String payPalEmailAddress;	
	
	@Element(name = "PaisaPayID")
	@Order(value=37)
	public String paisaPayID;	
	
	@Element(name = "BuyerGuaranteePrice")
	@Order(value=38)
	public AmountType buyerGuaranteePrice;	
	
	@Element(name = "Variation")
	@Order(value=39)
	public VariationType variation;	
	
	@Element(name = "BuyerCheckoutMessage")
	@Order(value=40)
	public String buyerCheckoutMessage;	
	
	@Element(name = "TotalTransactionPrice")
	@Order(value=41)
	public AmountType totalTransactionPrice;	
	
	@Element(name = "Taxes")
	@Order(value=42)
	public TaxesType taxes;	
	
	@Element(name = "BundlePurchase")
	@Order(value=43)
	public Boolean bundlePurchase;	
	
	@Element(name = "ActualShippingCost")
	@Order(value=44)
	public AmountType actualShippingCost;	
	
	@Element(name = "ActualHandlingCost")
	@Order(value=45)
	public AmountType actualHandlingCost;	
	
	@Element(name = "OrderLineItemID")
	@Order(value=46)
	public String orderLineItemID;	
	
	@Element(name = "PaymentHoldDetails")
	@Order(value=47)
	public PaymentHoldDetailType paymentHoldDetails;	
	
	@Element(name = "SellerDiscounts")
	@Order(value=48)
	public SellerDiscountsType sellerDiscounts;	
	
	@Element(name = "RefundAmount")
	@Order(value=49)
	public AmountType refundAmount;	
	
	@Element(name = "RefundStatus")
	@Order(value=50)
	public String refundStatus;	
	
	@Element(name = "CodiceFiscale")
	@Order(value=51)
	public String codiceFiscale;	
	
	@Element(name = "IsMultiLegShipping")
	@Order(value=52)
	public Boolean isMultiLegShipping;	
	
	@Element(name = "MultiLegShippingDetails")
	@Order(value=53)
	public MultiLegShippingDetailsType multiLegShippingDetails;	
	
	@Element(name = "InvoiceSentTime")
	@Order(value=54)
	public Date invoiceSentTime;	
	
	@Element(name = "UnpaidItem")
	@Order(value=55)
	public UnpaidItemType unpaidItem;	
	
	@Element(name = "IntangibleItem")
	@Order(value=56)
	public Boolean intangibleItem;	
	
	@AnyElement
	@Order(value=57)
	public List<Object> any;	
	
    
}