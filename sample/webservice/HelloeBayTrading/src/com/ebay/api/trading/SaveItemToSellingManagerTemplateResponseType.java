// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns the status of save to template operation.
 * 
 */
@RootElement(name = "SaveItemToSellingManagerTemplateResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SaveItemToSellingManagerTemplateResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "TemplateID")
	@Order(value=0)
	public Long templateID;	
	
    
}