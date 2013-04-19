// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains a list of BestOffers that were either accepted or declined.
 * 
 */
@RootElement(name = "RespondToBestOfferResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class RespondToBestOfferResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "RespondToBestOffer")
	@Order(value=0)
	public BestOfferArrayType respondToBestOffer;	
	
    
}