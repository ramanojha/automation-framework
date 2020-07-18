	package com.myproject.qa.testing.apis;
	
	import okhttp3.Request;
import okhttp3.Response;

import com.myproject.qa.testing.framework.env.TestEnvironment;
import com.myproject.qa.testing.framework.logs.ScriptLogger;
import com.myproject.qa.testing.framework.rest.api.API;
	
	public class ServiceTest{
		
		public static String USERS_EP = TestEnvironment.getServiceHost1()+"/api/users";
		
		
	    public static Response getUsersTest() throws Exception{
	    	ScriptLogger.info();
			Request req = API.get(USERS_EP);
			return API.reponse(req);
	    }

	}
