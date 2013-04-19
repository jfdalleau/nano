// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Returns values indicating information for a new listing.
 * 
 */
@RootElement(name = "AddItemFromSellingManagerTemplateResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddItemFromSellingManagerTemplateResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	@Order(value=0)
	public String itemID;	
	
	@Element(name = "StartTime")
	@Order(value=1)
	public Date startTime;	
	
	@Element(name = "EndTime")
	@Order(value=2)
	public Date endTime;	
	
	@Element(name = "Fees")
	@Order(value=3)
	public FeesType fees;	
	
	@Element(name = "CategoryID")
	@Order(value=4)
	public String categoryID;	
	
	@Element(name = "Category2ID")
	@Order(value=5)
	public String category2ID;	
	
    
}