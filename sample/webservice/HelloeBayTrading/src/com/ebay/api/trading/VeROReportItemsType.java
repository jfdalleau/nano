// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>ReportItems</b> container in the
 * <b>VeROReportItems</b> request. The <b>ReportItems</b> container
 * consists of an array of items which, according to the seller, are infringing upon the
 * seller's copyright, trademark, or intellectual property rights (according to the seller).
 * 
 */
public class VeROReportItemsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ReportItem")
	@Order(value=0)
	public List<VeROReportItemType> reportItem;	
	
    
}