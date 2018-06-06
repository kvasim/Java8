package com.java.test;

import org.junit.Test;

public class DBUserDataTest {
	
	UserHelper userHelper=new UserHelper();

	@Test
	public void testDBinformation() {

		UserInformation uInfo=userHelper.getDetailsForUserId("kvasim");
		
	}

}
