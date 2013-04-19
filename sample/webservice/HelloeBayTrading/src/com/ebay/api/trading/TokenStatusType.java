// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Returns token status.
 * 
 */
public class TokenStatusType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Status")
	@Order(value=0)
	public TokenStatusCodeType status;	
	
	@Element(name = "EIASToken")
	@Order(value=1)
	public String eiasToken;	
	
	@Element(name = "ExpirationTime")
	@Order(value=2)
	public Date expirationTime;	
	
	@Element(name = "RevocationTime")
	@Order(value=3)
	public Date revocationTime;	
	
	@AnyElement
	@Order(value=4)
	public List<Object> any;	
	
    
}