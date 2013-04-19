// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * There are single line item and multiple line item orders. A single
 * payment is made for both order types.
 * <br>
 * <br>
 * We strongly recommend that you avoid mixing digital and non-digital listings in
 * the same Combined Payment order.
 * 
 */
public class OrderType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "OrderID")
	@Order(value=0)
	public String orderID;	
	
	@Element(name = "OrderStatus")
	@Order(value=1)
	public OrderStatusCodeType orderStatus;	
	
	@Element(name = "AdjustmentAmount")
	@Order(value=2)
	public AmountType adjustmentAmount;	
	
	@Element(name = "AmountPaid")
	@Order(value=3)
	public AmountType amountPaid;	
	
	@Element(name = "AmountSaved")
	@Order(value=4)
	public AmountType amountSaved;	
	
	@Element(name = "CheckoutStatus")
	@Order(value=5)
	public CheckoutStatusType checkoutStatus;	
	
	@Element(name = "ShippingDetails")
	@Order(value=6)
	public ShippingDetailsType shippingDetails;	
	
	@Element(name = "CreatingUserRole")
	@Order(value=7)
	public TradingRoleCodeType creatingUserRole;	
	
	@Element(name = "CreatedTime")
	@Order(value=8)
	public Date createdTime;	
	
	@Element(name = "PaymentMethods")
	@Order(value=9)
	public List<BuyerPaymentMethodCodeType> paymentMethods;	
	
	@Element(name = "SellerEmail")
	@Order(value=10)
	public String sellerEmail;	
	
	@Element(name = "ShippingAddress")
	@Order(value=11)
	public AddressType shippingAddress;	
	
	@Element(name = "ShippingServiceSelected")
	@Order(value=12)
	public ShippingServiceOptionsType shippingServiceSelected;	
	
	@Element(name = "Subtotal")
	@Order(value=13)
	public AmountType subtotal;	
	
	@Element(name = "Total")
	@Order(value=14)
	public AmountType total;	
	
	@Element(name = "ExternalTransaction")
	@Order(value=15)
	public List<ExternalTransactionType> externalTransaction;	
	
	@Element(name = "TransactionArray")
	@Order(value=16)
	public TransactionArrayType transactionArray;	
	
	@Element(name = "BuyerUserID")
	@Order(value=17)
	public String buyerUserID;	
	
	@Element(name = "PaidTime")
	@Order(value=18)
	public Date paidTime;	
	
	@Element(name = "ShippedTime")
	@Order(value=19)
	public Date shippedTime;	
	
	@Element(name = "IntegratedMerchantCreditCardEnabled")
	@Order(value=20)
	public Boolean integratedMerchantCreditCardEnabled;	
	
	@Element(name = "BundlePurchase")
	@Order(value=21)
	public Boolean bundlePurchase;	
	
	@Element(name = "BuyerCheckoutMessage")
	@Order(value=22)
	public String buyerCheckoutMessage;	
	
	@Element(name = "EIASToken")
	@Order(value=23)
	public String eiasToken;	
	
	@Element(name = "PaymentHoldStatus")
	@Order(value=24)
	public PaymentHoldStatusCodeType paymentHoldStatus;	
	
	@Element(name = "PaymentHoldDetails")
	@Order(value=25)
	public PaymentHoldDetailType paymentHoldDetails;	
	
	@Element(name = "RefundArray")
	@Order(value=26)
	public RefundArrayType refundArray;	
	
	@Element(name = "RefundAmount")
	@Order(value=27)
	public AmountType refundAmount;	
	
	@Element(name = "RefundStatus")
	@Order(value=28)
	public String refundStatus;	
	
	@Element(name = "IsMultiLegShipping")
	@Order(value=29)
	public Boolean isMultiLegShipping;	
	
	@Element(name = "MultiLegShippingDetails")
	@Order(value=30)
	public MultiLegShippingDetailsType multiLegShippingDetails;	
	
	@AnyElement
	@Order(value=31)
	public List<Object> any;	
	
    
}