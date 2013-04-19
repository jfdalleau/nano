// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Searches for nonprofit charity organizations that meet the
 * criteria specified in the request.
 * It is recommended that you use at least one input filter, because this call
 * no longer returns all charities when made without filters.
 * 
 */
@RootElement(name = "GetCharitiesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCharitiesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CharityID")
	@Order(value=0)
	public String charityID;	
	
	@Element(name = "CharityName")
	@Order(value=1)
	public String charityName;	
	
	@Element(name = "Query")
	@Order(value=2)
	public String query;	
	
	@Element(name = "CharityRegion")
	@Order(value=3)
	public Integer charityRegion;	
	
	@Element(name = "CharityDomain")
	@Order(value=4)
	public Integer charityDomain;	
	
	@Element(name = "IncludeDescription")
	@Order(value=5)
	public Boolean includeDescription;	
	
	@Element(name = "MatchType")
	@Order(value=6)
	public StringMatchCodeType matchType;	
	
	@Element(name = "Featured")
	@Order(value=7)
	public Boolean featured;	
	
	@Element(name = "CampaignID")
	@Order(value=8)
	public Long campaignID;	
	
    
}