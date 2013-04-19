// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Responds to a call to GetApiAccessRules.
 * 
 */
@RootElement(name = "GetApiAccessRulesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetApiAccessRulesResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ApiAccessRule")
	@Order(value=0)
	public List<ApiAccessRuleType> apiAccessRule;	
	
    
}