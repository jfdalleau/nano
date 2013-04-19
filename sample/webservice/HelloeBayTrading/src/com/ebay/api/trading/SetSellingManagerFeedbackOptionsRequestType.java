// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Enables Selling Manager subscribers to store standard feedback comments that can
 * be left for their buyers. Selling Manager Pro subscribers can also specify what
 * events, if any, will trigger an automated feedback to buyers.
 * 
 */
@RootElement(name = "SetSellingManagerFeedbackOptionsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetSellingManagerFeedbackOptionsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AutomatedLeaveFeedbackEvent")
	@Order(value=0)
	public AutomatedLeaveFeedbackEventCodeType automatedLeaveFeedbackEvent;	
	
	@Element(name = "StoredComments")
	@Order(value=1)
	public FeedbackCommentArrayType storedComments;	
	
    
}