/**
 * 
 */
package com.java.enums;

/**
 * @author KVASIM
 * A Regional Internet Registry (RIR) is a not-for-profit organization 
 * that oversees Internet Protocol (IP) address space (IPv4 and IPv6) and 
 * the Autonomous System (AS) numbers within a specific geographical region. 
 * There are five regional RIRs across the globe:
 *  ARIN, RIPE, APNIC, LACNIC and AfriNIC.
 *
 */
public enum WhoisRIR {
	ARIN("whois.arin.net"),
    RIPE("whois.ripe.net"),
    APNIC("whois.apnic.net"),
    AFRINIC("whois.afrinic.net"),
    LACNIC("whois.lacnic.net"),
    JPNIC("whois.nic.ad.jp"),
    KRNIC("whois.nic.or.kr"),
    CNNIC("ipwhois.cnnic.cn"),
    UNKNOWN("");
	private String url;

    WhoisRIR(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
}
