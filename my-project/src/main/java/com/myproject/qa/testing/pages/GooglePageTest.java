package com.myproject.qa.testing.pages;

import com.myproject.qa.testing.framework.logs.ScriptLogger;
import com.myproject.qa.testing.framework.selenium.BrowserAction;
import com.myproject.qa.testing.objects.GooglePageObjects;

public class GooglePageTest {

	public static void enterTextInGoogleSearchBarTest(String text) throws Exception{
		ScriptLogger.info();
		BrowserAction.enterField(GooglePageObjects.GOOGLE_PAGE_SEARCH_BAR_XPATH, text);
	}
	
	public static void clickGoogleSearchButtonTest() throws Exception{
		ScriptLogger.info();
		BrowserAction.click(GooglePageObjects.GOOGLE_PAGE_GOOGLE_SEARCH_BTN_XPATH);
	}
}
