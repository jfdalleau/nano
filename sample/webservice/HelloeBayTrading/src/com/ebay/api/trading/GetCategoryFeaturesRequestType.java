// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Returns information about the features that are applicable to different categories,
 * such as listing durations, shipping term requirements, and Best Offer support.
 * 
 */
@RootElement(name = "GetCategoryFeaturesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCategoryFeaturesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryID")
	@Order(value=0)
	public String categoryID;	
	
	@Element(name = "LevelLimit")
	@Order(value=1)
	public Integer levelLimit;	
	
	@Element(name = "ViewAllNodes")
	@Order(value=2)
	public Boolean viewAllNodes;	
	
	@Element(name = "FeatureID")
	@Order(value=3)
	public List<FeatureIDCodeType> featureID;	
	
	@Element(name = "AllFeaturesForCategory")
	@Order(value=4)
	public Boolean allFeaturesForCategory;	
	
    
}