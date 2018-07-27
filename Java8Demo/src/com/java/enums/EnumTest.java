/**
 * 
 */
package com.java.enums;

/**
 * @author KVASIM
 *
 */
public class EnumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(UserStatus.ACTIVE);
		//whois.arin.net
        System.out.println(WhoisRIR.ARIN.getUrl());
        
        // Iterate all enums
        for(WhoisRIR enmObj:WhoisRIR.values()){
        	System.out.println(enmObj.name() + "   "+enmObj.getUrl());
        }
        
        
	}

}
