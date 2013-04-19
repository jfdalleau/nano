// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains the message portion of a listing tip that is returned by the Listing Analyzer engine.
 * 
 */
public class ListingTipMessageType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ListingTipMessageID")
	@Order(value=0)
	public String listingTipMessageID;	
	
	@Element(name = "ShortMessage")
	@Order(value=1)
	public String shortMessage;	
	
	@Element(name = "LongMessage")
	@Order(value=2)
	public String longMessage;	
	
	@Element(name = "HelpURLPath")
	@Order(value=3)
	public String helpURLPath;	
	
	@AnyElement
	@Order(value=4)
	public List<Object> any;	
	
    
}