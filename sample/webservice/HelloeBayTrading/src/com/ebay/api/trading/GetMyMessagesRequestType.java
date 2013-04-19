// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Retrieves information about the messages sent to a given user.
 * 
 */
@RootElement(name = "GetMyMessagesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMyMessagesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AlertIDs")
	@Order(value=0)
	public MyMessagesAlertIDArrayType alertIDs;	
	
	@Element(name = "MessageIDs")
	@Order(value=1)
	public MyMessagesMessageIDArrayType messageIDs;	
	
	@Element(name = "FolderID")
	@Order(value=2)
	public Long folderID;	
	
	@Element(name = "StartTime")
	@Order(value=3)
	public Date startTime;	
	
	@Element(name = "EndTime")
	@Order(value=4)
	public Date endTime;	
	
	@Element(name = "ExternalMessageIDs")
	@Order(value=5)
	public MyMessagesExternalMessageIDArrayType externalMessageIDs;	
	
	@Element(name = "Pagination")
	@Order(value=6)
	public PaginationType pagination;	
	
	@Element(name = "IncludeHighPriorityMessageOnly")
	@Order(value=7)
	public Boolean includeHighPriorityMessageOnly;	
	
    
}