// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Requests a list of disputes the requester is involved in as buyer or seller.
 * eBay Buyer Protection Item Not Received and Significantly Not As Described cases
 * are not returned with this call. To retrieve eBay Buyer Protection cases, the
 * getUserCases call of the Resolution Case Management API must be used instead.
 * 
 */
@RootElement(name = "GetUserDisputesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetUserDisputesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "DisputeFilterType")
	@Order(value=0)
	public DisputeFilterTypeCodeType disputeFilterType;	
	
	@Element(name = "DisputeSortType")
	@Order(value=1)
	public DisputeSortTypeCodeType disputeSortType;	
	
	@Element(name = "ModTimeFrom")
	@Order(value=2)
	public Date modTimeFrom;	
	
	@Element(name = "ModTimeTo")
	@Order(value=3)
	public Date modTimeTo;	
	
	@Element(name = "Pagination")
	@Order(value=4)
	public PaginationType pagination;	
	
    
}