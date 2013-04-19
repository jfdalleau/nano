// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for a list of search result items. Can contain zero, one, or multiple
 * WantItNowPostType objects, each of which contains data for a single Want It Now
 * post found by the search.
 * 
 */
public class WantItNowPostArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "WantItNowPost")
	@Order(value=0)
	public List<WantItNowPostType> wantItNowPost;	
	
    
}