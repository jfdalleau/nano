// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Detailed feedback information for a user. Conveys the score for the
 * feedback, the textual comment, and other information.
 *   
 */
public class FeedbackDetailType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CommentingUser")
	@Order(value=0)
	public String commentingUser;	
	
	@Element(name = "CommentingUserScore")
	@Order(value=1)
	public Integer commentingUserScore;	
	
	@Element(name = "CommentText")
	@Order(value=2)
	public String commentText;	
	
	@Element(name = "CommentTime")
	@Order(value=3)
	public Date commentTime;	
	
	@Element(name = "CommentType")
	@Order(value=4)
	public CommentTypeCodeType commentType;	
	
	@Element(name = "FeedbackResponse")
	@Order(value=5)
	public String feedbackResponse;	
	
	@Element(name = "FollowUp")
	@Order(value=6)
	public String followUp;	
	
	@Element(name = "ItemID")
	@Order(value=7)
	public String itemID;	
	
	@Element(name = "Role")
	@Order(value=8)
	public TradingRoleCodeType role;	
	
	@Element(name = "ItemTitle")
	@Order(value=9)
	public String itemTitle;	
	
	@Element(name = "ItemPrice")
	@Order(value=10)
	public AmountType itemPrice;	
	
	@Element(name = "FeedbackID")
	@Order(value=11)
	public String feedbackID;	
	
	@Element(name = "TransactionID")
	@Order(value=12)
	public String transactionID;	
	
	@Element(name = "CommentReplaced")
	@Order(value=13)
	public Boolean commentReplaced;	
	
	@Element(name = "ResponseReplaced")
	@Order(value=14)
	public Boolean responseReplaced;	
	
	@Element(name = "FollowUpReplaced")
	@Order(value=15)
	public Boolean followUpReplaced;	
	
	@Element(name = "Countable")
	@Order(value=16)
	public Boolean countable;	
	
	@AnyElement
	@Order(value=17)
	public List<Object> any;	
	
    
}