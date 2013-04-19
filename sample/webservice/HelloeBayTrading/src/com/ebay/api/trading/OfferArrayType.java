// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for a list of offers. May contain zero, one, or multiple
 * OfferType objects, each of which represents one offer extended by
 * a user on a listing.
 * 
 */
public class OfferArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Offer")
	@Order(value=0)
	public List<OfferType> offer;	
	
    
}