// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This is used in ReviseInventoryStatus response to provide the set of
 * fees associated with each unique ItemID..
 * 
 */
public class InventoryFeesType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	@Order(value=0)
	public String itemID;	
	
	@Element(name = "Fee")
	@Order(value=1)
	public List<FeeType> fee;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}