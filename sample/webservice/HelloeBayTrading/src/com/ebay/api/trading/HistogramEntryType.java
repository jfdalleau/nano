// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A generic histogram entry type.
 * 
 */
public class HistogramEntryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Count")
	@Order(value=0)
	public Integer count;	
	
	@AnyElement
	@Order(value=1)
	public List<Object> any;	
	
	@Attribute  
	@Order(value=2)
	public String id;	
	
	@Attribute  
	@Order(value=3)
	public String name;	
	
    
}