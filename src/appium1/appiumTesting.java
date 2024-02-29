package appium1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.apache.commons.math3.util.CombinatoricsUtils;
import org.asynchttpclient.uri.Uri;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class appiumTesting extends Actions  {
	
String number1="20.5";
String number2="16";  
Double num1= Double.parseDouble(number1)  ;
Double num2= Double.parseDouble(number2)  ;
	Assertions assertion=new Assertions();
	@BeforeTest
	public void setup() {
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Aya");
		
		
		// only for mobile browsers 
//		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
//		caps.setCapability("chromedriverExecutable", System.getProperty("user.dir")+File.separator+
//				"driver"+File.separator+"chromedriver.exe");
				
		// only for mobile application 
		
		caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+File.separator+
				"app"+File.separator+"calculator.apk");
				
	}
	
//	@Test
//	public void myFirstTest() throws MalformedURLException {
//		
//		var appuimServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
//		driver = new AndroidDriver(appuimServerUrl , caps);
//		
//		driver.get("https://www.google.com/");
//		driver.findElement(By.id("XSqSsc")).sendKeys("facebook"+Keys.ENTER);
//	}
	
//	
	@Test(description = "Add of two numbers ", priority = 1)
	public void addNumbers() throws MalformedURLException {
		var appuimServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		driver = new AndroidDriver(appuimServerUrl , caps);
		addTwoNumbers(number1, number2);
		assertion.checkResultIsCorrect((num1+num2));

		takeScreenshot();
	}
	@Test(description = "Subtraction of two numbers ", priority = 2)
	public void subtractionNumbers() throws MalformedURLException {
		var appuimServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		driver = new AndroidDriver(appuimServerUrl , caps);
		subtractionTwoNumbers(number1, number2);
		assertion.checkResultIsCorrect((Double)num1-num2);
		takeScreenshot();

	}
	@Test(description = "Multiplication of two numbers ", priority = 3)
	public void multiplicationNumbers() throws MalformedURLException {
		var appuimServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		driver = new AndroidDriver(appuimServerUrl , caps);	
        multiplicationTwoNumbers(number1, number2);
	    assertion.checkResultIsCorrect((num1*num2));
	    takeScreenshot();
		
	}
	@Test(description = "Sqrt of any number", priority = 4)
	public void sqrtNumber() throws MalformedURLException {
		var appuimServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		driver = new AndroidDriver(appuimServerUrl , caps);
		sqrtAnyNumber("16");
		assertion.checkResultIsCorrect(Math.sqrt(16));
		takeScreenshot();
		
	}
	@Test(description = "Power of two numbers", priority = 5)
	public void powerNumber() throws MalformedURLException {
		var appuimServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		driver = new AndroidDriver(appuimServerUrl , caps);
		powerTwoNumbers("2", "2");
		assertion.checkResultIsCorrect(Math.pow(2, 2));
		takeScreenshot();	
		}
	@Test(description = " Factorial of any number", priority = 6)
	public void factorialNumber() throws MalformedURLException {
		var appuimServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		driver = new AndroidDriver(appuimServerUrl , caps);
		factorialAnyNumber("5");
		assertion.checkResultIsCorrect((double) (CombinatoricsUtils.factorial(5)));
		takeScreenshot();
	}

	@AfterTest
	public void myAfter() {
		
	}

}