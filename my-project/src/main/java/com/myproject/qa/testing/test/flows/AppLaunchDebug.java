package com.myproject.qa.testing.test.flows;

import org.testng.annotations.Test;

import com.myproject.qa.testing.framework.env.TestEnvironment;
import com.myproject.qa.testing.framework.logs.ScriptLogger;
import com.myproject.qa.testing.framework.selenium.BaseWebDriver;
import com.myproject.qa.testing.framework.selenium.InstanceAccess;

public class AppLaunchDebug extends BaseWebDriver{

	@Test(alwaysRun=true)
	public static void launchSiteUrl() throws Exception{
//		ScriptLogger.info();
//		InstanceAccess.getDriver().get(TestEnvironment.getSiteUrl());
//		Thread.sleep(3000);
	}
	
}
