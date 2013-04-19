// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Request type containing the input fields for the <b>ReviseSellingManagerSaleRecord</b>
 * call. The standard Trading API deprecation process is not applicable to this
 * call.
 * 
 */
@RootElement(name = "ReviseSellingManagerSaleRecordRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ReviseSellingManagerSaleRecordRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	@Order(value=0)
	public String itemID;	
	
	@Element(name = "TransactionID")
	@Order(value=1)
	public String transactionID;	
	
	@Element(name = "OrderID")
	@Order(value=2)
	public String orderID;	
	
	@Element(name = "SellingManagerSoldOrder")
	@Order(value=3)
	public SellingManagerSoldOrderType sellingManagerSoldOrder;	
	
	@Element(name = "OrderLineItemID")
	@Order(value=4)
	public String orderLineItemID;	
	
    
}