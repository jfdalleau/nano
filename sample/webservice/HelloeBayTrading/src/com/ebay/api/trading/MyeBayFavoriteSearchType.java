// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Characteristics of a saved My eBay Favorite Search.
 * 
 */
public class MyeBayFavoriteSearchType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SearchName")
	@Order(value=0)
	public String searchName;	
	
	@Element(name = "SearchQuery")
	@Order(value=1)
	public String searchQuery;	
	
	@Element(name = "QueryKeywords")
	@Order(value=2)
	public String queryKeywords;	
	
	@Element(name = "CategoryID")
	@Order(value=3)
	public String categoryID;	
	
	@Element(name = "ItemSort")
	@Order(value=4)
	public SimpleItemSortCodeType itemSort;	
	
	@Element(name = "SortOrder")
	@Order(value=5)
	public SortOrderCodeType sortOrder;	
	
	@Element(name = "EndTimeFrom")
	@Order(value=6)
	public Date endTimeFrom;	
	
	@Element(name = "EndTimeTo")
	@Order(value=7)
	public Date endTimeTo;	
	
	@Element(name = "MaxDistance")
	@Order(value=8)
	public Integer maxDistance;	
	
	@Element(name = "PostalCode")
	@Order(value=9)
	public String postalCode;	
	
	@Element(name = "ItemType")
	@Order(value=10)
	public ItemTypeCodeType itemType;	
	
	@Element(name = "PriceMax")
	@Order(value=11)
	public AmountType priceMax;	
	
	@Element(name = "PriceMin")
	@Order(value=12)
	public AmountType priceMin;	
	
	@Element(name = "Currency")
	@Order(value=13)
	public CurrencyCodeType currency;	
	
	@Element(name = "BidCountMax")
	@Order(value=14)
	public Integer bidCountMax;	
	
	@Element(name = "BidCountMin")
	@Order(value=15)
	public Integer bidCountMin;	
	
	@Element(name = "SearchFlag")
	@Order(value=16)
	public List<SearchFlagCodeType> searchFlag;	
	
	@Element(name = "PaymentMethod")
	@Order(value=17)
	public PaymentMethodSearchCodeType paymentMethod;	
	
	@Element(name = "PreferredLocation")
	@Order(value=18)
	public PreferredLocationCodeType preferredLocation;	
	
	@Element(name = "SellerID")
	@Order(value=19)
	public List<String> sellerID;	
	
	@Element(name = "SellerIDExclude")
	@Order(value=20)
	public List<String> sellerIDExclude;	
	
	@Element(name = "ItemsAvailableTo")
	@Order(value=21)
	public CountryCodeType itemsAvailableTo;	
	
	@Element(name = "ItemsLocatedIn")
	@Order(value=22)
	public CountryCodeType itemsLocatedIn;	
	
	@Element(name = "SellerBusinessType")
	@Order(value=23)
	public SellerBusinessCodeType sellerBusinessType;	
	
	@Element(name = "Condition")
	@Order(value=24)
	public ItemConditionCodeType condition;	
	
	@Element(name = "Quantity")
	@Order(value=25)
	public Integer quantity;	
	
	@Element(name = "QuantityOperator")
	@Order(value=26)
	public QuantityOperatorCodeType quantityOperator;	
	
	@AnyElement
	@Order(value=27)
	public List<Object> any;	
	
    
}