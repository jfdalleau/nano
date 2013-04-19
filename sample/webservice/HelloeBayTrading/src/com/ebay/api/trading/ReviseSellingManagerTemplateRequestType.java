// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Revises a Selling Manager template.
 * This call is subject to change without notice; the
 * deprecation process is inapplicable to this call.
 * 
 */
@RootElement(name = "ReviseSellingManagerTemplateRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ReviseSellingManagerTemplateRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SaleTemplateID")
	@Order(value=0)
	public Long saleTemplateID;	
	
	@Element(name = "ProductID")
	@Order(value=1)
	public Long productID;	
	
	@Element(name = "SaleTemplateName")
	@Order(value=2)
	public String saleTemplateName;	
	
	@Element(name = "Item")
	@Order(value=3)
	public ItemType item;	
	
	@Element(name = "DeletedField")
	@Order(value=4)
	public List<String> deletedField;	
	
	@Element(name = "VerifyOnly")
	@Order(value=5)
	public Boolean verifyOnly;	
	
    
}