package com.myproject.qa.testing.framework.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.myproject.qa.testing.framework.logs.ScriptLogger;

public class InitializeWebDriver {

	private static WebDriver driver;
	private static String browser;
	public static void setDriver(String driverType, String expPort) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		browser = driverType;
		
		if(driver == null){
			switch (browser) {
			case "chrome" :
				System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
				WebDriverManager.chromedriver().setup();
				
				ChromeOptions options = new ChromeOptions();
				ChromeDriverService service = ChromeDriverService.createDefaultService();
				options.addArguments("--disable--notifications");
				options.addArguments("-incognito");
				options.addArguments("start-maximized"); 
				options.addArguments("--disable-popup-blocking");
				options.addArguments("disable-infobars");
				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("credentials_enable_service", false);
				prefs.put("password_manager_enabled", false); 
				prefs.put("profile.default_content_settings.popups", 0);
				prefs.put("profile.default_content_setting_values.automatic_downloads", 1 );
				prefs.put("download.prompt_for_download", false);
				prefs.put("download.default_directory", "C:\\TestData\\Downloads");
				options.setExperimentalOption("prefs", prefs);
				ChromeDriver d  = new ChromeDriver(service, options); 
				System.out.println(d.getCapabilities().getCapability("goog:chromeOptions"));
				driver = d;
				break;
				
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver  = new FirefoxDriver();
				break;
				
			case "chrome-debug":
				//location : C:\Program Files (x86)\Google\Chrome\Application
				//chrome.exe --remote-debugging-port=2222 --no-default-browser-check --user-data-dir="D:\Git\ChromeDevTool"
				WebDriverManager.chromedriver().setup();
				
				ChromeOptions options1 = new ChromeOptions();
				options1.setExperimentalOption("debuggerAddress","localhost:"+expPort);
				options1.asMap();				
				ChromeDriver dri  = new ChromeDriver(options1); 
				System.out.println(dri.getCapabilities().getCapability("goog:chromeOptions"));
				driver  = dri;
				break;
			default:
				break;
			}
		}else{
			ScriptLogger.info("Driver is already initialized");	
		}
	}

	public static WebDriver getDriver(){
		return driver;
	}

	public static String getBrowser(){
		return browser;
	}

}
