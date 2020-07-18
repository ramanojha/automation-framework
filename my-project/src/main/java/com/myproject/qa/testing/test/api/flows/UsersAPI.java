package com.myproject.qa.testing.test.api.flows;

import org.testng.annotations.Test;

import com.myproject.qa.testing.apis.ServiceTest;

public class UsersAPI{

	@Test(alwaysRun=true)
	public static void getUsersTest() throws Exception{
		ServiceTest.getUsersTest();
	}
	
}
