// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Specifies the data for a single item and configures the recommendation engines to use
 * when processing the item with GetItemRecommendations.
 * 
 */
public class GetRecommendationsRequestContainerType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ListingFlow")
	@Order(value=0)
	public ListingFlowCodeType listingFlow;	
	
	@Element(name = "Item")
	@Order(value=1)
	public ItemType item;	
	
	@Element(name = "RecommendationEngine")
	@Order(value=2)
	public List<RecommendationEngineCodeType> recommendationEngine;	
	
	@Element(name = "Query")
	@Order(value=3)
	public String query;	
	
	@Element(name = "CorrelationID")
	@Order(value=4)
	public String correlationID;	
	
	@Element(name = "DeletedField")
	@Order(value=5)
	public List<String> deletedField;	
	
	@Element(name = "ExcludeRelationships")
	@Order(value=6)
	public Boolean excludeRelationships;	
	
	@Element(name = "IncludeConfidence")
	@Order(value=7)
	public Boolean includeConfidence;	
	
	@AnyElement
	@Order(value=8)
	public List<Object> any;	
	
    
}