// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * Defines the options available for an Automated Listing Rule that
 * keeps a fixed number of items on the site
 */
public class SellingManagerAutoListAccordingToScheduleType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "DayOfWeek")
	@Order(value=0)
	public List<DayOfWeekCodeType> dayOfWeek;	
	
	@Element(name = "ListingPeriodInWeeks")
	@Order(value=1)
	public Integer listingPeriodInWeeks;	
	
	@Element(name = "ListAtSpecificTimeOfDay")
	@Order(value=2)
	public Date listAtSpecificTimeOfDay;	
	
	@Element(name = "StartTime")
	@Order(value=3)
	public Date startTime;	
	
	@Element(name = "EndTime")
	@Order(value=4)
	public Date endTime;	
	
	@Element(name = "MaxActiveItemCount")
	@Order(value=5)
	public Integer maxActiveItemCount;	
	
	@Element(name = "ListingHoldInventoryLevel")
	@Order(value=6)
	public Integer listingHoldInventoryLevel;	
	
	@AnyElement
	@Order(value=7)
	public List<Object> any;	
	
    
}