	package com.myproject.qa.testing.apis;
	
	import okhttp3.Request;
import okhttp3.Response;

import com.myproject.qa.testing.framework.env.TestEnvironment;
import com.myproject.qa.testing.framework.logs.ScriptLogger;
import com.myproject.qa.testing.framework.rest.api.API;
	
	public class DummyAPITest{
		
		public static String EMPLOYEE_EP = TestEnvironment.getServiceHost2()+"/api/v1/employees";
		
		
	    public static Response getEmployeeTest() throws Exception{
	    	ScriptLogger.info();
			Request req = API.get(EMPLOYEE_EP);
			return API.reponse(req);
	    }
	}
