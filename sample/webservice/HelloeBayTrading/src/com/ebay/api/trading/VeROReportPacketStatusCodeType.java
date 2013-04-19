// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * The status of a set of items (packet) reported for infringement. Packet states
 * are based on the states of the reported items within the packet.
 * 
 */
public enum VeROReportPacketStatusCodeType {

    /**
     * 
   * (out) The packet has been received by eBay.
   * 
     */
    RECEIVED("Received"),
  

    /**
     * 
   * (out) The packet is being processed by eBay.
   * 
     */
    IN_PROCESS("InProcess"),
  

    /**
     * 
   * (out) The packet has been processed by eBay. Each item within the packet has a status of Removed, SubmissionFailed, or ClarificationRequired.
   * 
     */
    PROCESSED("Processed"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    VeROReportPacketStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static VeROReportPacketStatusCodeType fromValue(String v) {
        if (v != null) {
            for (VeROReportPacketStatusCodeType c: VeROReportPacketStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}