package com.myproject.qa.testing.sanity.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppTest
{
    @Test(alwaysRun=true)
    @Parameters("testParamFalse")
    public void shouldAnswerWithTrueTest(boolean testParamFalse)
    {
        Assert.assertTrue( false );
    }
    
    @Test(dependsOnMethods="shouldAnswerWithTrueTest")
    @Parameters("testParamFalse")
    public void failingMethodTest(Boolean testParam)
    {
        Assert.assertTrue( testParam );
    }
}
