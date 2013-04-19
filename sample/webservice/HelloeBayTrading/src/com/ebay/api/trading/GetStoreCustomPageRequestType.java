// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Retrieves the custom page or pages for the authenticated user's Store.
 * 
 */
@RootElement(name = "GetStoreCustomPageRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetStoreCustomPageRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PageID")
	@Order(value=0)
	public Long pageID;	
	
    
}