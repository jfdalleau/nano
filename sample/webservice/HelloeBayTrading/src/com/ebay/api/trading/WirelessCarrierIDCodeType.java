// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

public enum WirelessCarrierIDCodeType {

    CINGULAR("Cingular"),
  

    T_MOBILE("TMobile"),
  

    SPRINT("Sprint"),
  

    NEXTEL("Nextel"),
  

    VERIZON("Verizon"),
  

    CINCINNATI_BELL("CincinnatiBell"),
  

    DOBSON("Dobson"),
  

    ALLTEL("Alltel"),
  

    LEAP("Leap"),
  

    US_CELLULAR("USCellular"),
  

    MOVISTAR("Movistar"),
  

    AMENA("Amena"),
  

    VODAFONE("Vodafone"),
  

    ATT("ATT"),
  

    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    WirelessCarrierIDCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static WirelessCarrierIDCodeType fromValue(String v) {
        if (v != null) {
            for (WirelessCarrierIDCodeType c: WirelessCarrierIDCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}