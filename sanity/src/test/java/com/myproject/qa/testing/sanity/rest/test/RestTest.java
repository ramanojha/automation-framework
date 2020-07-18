package com.myproject.qa.testing.sanity.rest.test;

import org.testng.annotations.Test;

import com.myproject.qa.testing.apis.DummyAPITest;
import com.myproject.qa.testing.apis.ServiceTest;
import com.myproject.qa.testing.framework.logs.ScriptLogger;

public class RestTest
{
    @Test(alwaysRun=true)
    public void getUsersTest() throws Exception{
    	ScriptLogger.info();
    	ServiceTest.getUsersTest();
    }
    
    @Test(dependsOnMethods="getUsersTest")
    public void getAllJenkinsJobsInfoTest() throws Exception{
    	ScriptLogger.info();
    	DummyAPITest.getEmployeeTest();
    }
}
