// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Creates a Selling Manager product. Sellers use Selling Manager products to store SYI forms for use
 * as listing templates.
 * This call is subject to change without notice; the
 * deprecation process is inapplicable to this call.
 * 
 */
@RootElement(name = "AddSellingManagerProductRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddSellingManagerProductRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellingManagerProductDetails")
	@Order(value=0)
	public SellingManagerProductDetailsType sellingManagerProductDetails;	
	
	@Element(name = "FolderID")
	@Order(value=1)
	public Long folderID;	
	
	@Element(name = "SellingManagerProductSpecifics")
	@Order(value=2)
	public SellingManagerProductSpecificsType sellingManagerProductSpecifics;	
	
    
}