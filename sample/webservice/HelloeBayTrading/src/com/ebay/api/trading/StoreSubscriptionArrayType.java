// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Set of eBay Store subscription levels.
 * 
 */
public class StoreSubscriptionArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Subscription")
	@Order(value=0)
	public List<StoreSubscriptionType> subscription;	
	
    
}