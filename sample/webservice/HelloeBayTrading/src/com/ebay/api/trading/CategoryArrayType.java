// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for a list of categories.
 * 
 */
public class CategoryArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Category")
	@Order(value=0)
	public List<CategoryType> category;	
	
    
}