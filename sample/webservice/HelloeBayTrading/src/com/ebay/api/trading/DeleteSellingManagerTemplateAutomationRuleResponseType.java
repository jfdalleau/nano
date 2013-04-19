// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains the set of automation rules associated with the specified template.
 * 
 */
@RootElement(name = "DeleteSellingManagerTemplateAutomationRuleResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class DeleteSellingManagerTemplateAutomationRuleResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AutomatedListingRule")
	@Order(value=0)
	public SellingManagerAutoListType automatedListingRule;	
	
	@Element(name = "AutomatedRelistingRule")
	@Order(value=1)
	public SellingManagerAutoRelistType automatedRelistingRule;	
	
	@Element(name = "AutomatedSecondChanceOfferRule")
	@Order(value=2)
	public SellingManagerAutoSecondChanceOfferType automatedSecondChanceOfferRule;	
	
	@Element(name = "Fees")
	@Order(value=3)
	public FeesType fees;	
	
    
}