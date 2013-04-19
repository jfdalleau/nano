// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Contains a list of the products created by the seller. The list of products is returned as a set
 * of tags, in which are returned zero, one, or multiple SellingManagerProductType objects. Each
 * SellingManagerProductType object contains the information about for one Selling Manager product
 * and any Selling Manager templates the product contains.
 * 
 */
@RootElement(name = "GetSellingManagerInventoryResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerInventoryResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "InventoryCountLastCalculatedDate")
	@Order(value=0)
	public Date inventoryCountLastCalculatedDate;	
	
	@Element(name = "SellingManagerProduct")
	@Order(value=1)
	public List<SellingManagerProductType> sellingManagerProduct;	
	
	@Element(name = "PaginationResult")
	@Order(value=2)
	public PaginationResultType paginationResult;	
	
    
}