package browser;



import org.testng.annotations.Test;
import java.net.MalformedURLException;

import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class ChromeDriver {

	@Test
	public  void chrome() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//INTIALIZE  Desired Capabilities Class
		// Initiate codes to get your Mobile Device Connected
		
	/*	DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "abc");

		cap.setCapability("platformName", "android");
		*/
		
		//LAUNCH KHANACADEMY APP USING appPACKAGE,appACTIVITY
		
		/*cap.setCapability("app", "/Users/bhargavivedharaman/Downloads/Khan Academy_v6.3.0_apkpure.com.apk");
        cap.setCapability("appPackage","org.khanacademy.android ");
        cap.setCapability("appActivity","org.khanacademy.android.ui.library.MainActivity");

		/*
		 * cap.setCapability("appPackage","com.google.android.calculator ");
		cap.setCapability("appActivity","com.google.android.gms.common.api.GoogleApiActivity");
		*/

		
		//cap.setCapability("browserName", "chrome");

		//cap.setCapability("chromedriverExecutable", "/Users/bhargavivedharaman/Downloads/chromedriver");

		// INSTEAD OF CLICKING START THE SESSION, WE HAVE TO LAUNCH APPIUM SERVER
		// WITH THE ABOVE DESIRED CAPABILITIES AT THIS POINT 00004723 WHERE APPIUM SERVER IS RUNNING
		// AT THIS POINT JAVA CODES ARE TRANSFERRED INTO APPIUM  AS HTTP INTERFACE 
		// HTTP INTERFACE TO MOBILE DEVICE AS JSON COMMUNICATION
		//CAPABILITIES ARE STORED IN A SEPARATE MEMORY LOCATION CALLED "CAP"
		//REMEMBER TO DOUBLE CLICK ON NEW TO ADD "THROWS MalformedURLException next to public static void main String args
		
	//AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	/*	driver.get("http://google.com");

		driver.findElement(MobileBy.xpath("//input[@name='q']")).sendKeys("selenium");
		
		driver.get("http://magento.com"); 
		driver.findElement(By.cssSelector("#navbar > button")).click(); 
		driver.findElement(By.partialLinkText("My Account")).click(); 
		driver.findElement(By.id("email")).clear(); 
		driver.findElement(By.id("email")).sendKeys("test@gmail.com"); 
		
		*/
		
		/*
		  driver.get("http://amazon.com");
		 
		driver.findElement(By.cssSelector("#nav-hamburger-menu > i ")).click();
		driver.findElement(By.XPath("//*[@id="hmenu-content"]/ul[1]/li[1]/a ")).click();
		driver.findElement(By.id("ap_email_login")).clear();
		
        */
		
		/* DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability("deviceName", "abc");
		 cap.setCapability("platformName", "android");
		cap.setCapability("appPackage","");
		cap.setCapability("appActivity","com.google.android.youtube.HomeActivity");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * 
		 * 
		 */
		
		
		
		//LAUNCHING YOUTUBE ACTIVITIES
		
		
		 /*DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability("deviceName", "abc");
		 cap.setCapability("platformName", "android");
		
		 cap.setCapability("appPackage","com.google.android.apps.youtube");
		 cap.setCapability("appActivity","com.google.android.apps.youtube.kids.browse.MainActivity");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*driver.findElement(MobileBy.AccessibilityId("Search")).click();
	    driver.findElement(MobileBy.id("com.google.android.youtube:id/search_edit_text")"0.sendKeys("Selenium");
		driver.findElement(MobileBy.AndroidUIAutomator(UiSelector().text(\"selenium tutorial for beginners\")")).click();
		 */
		
		
		//LAUNCH GOOGLE CHROME AND SELECT THE TEXT Selenium Dev USING AndroidUiAutomator("UiSelector().text(\" \")
		 
	DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "abc");

		cap.setCapability("platformName", "android");
		  
		cap.setCapability("appPackage","com.android.chrome");
		  
	    cap.setCapability("appActivity","com.google.android.apps.chrome.Main");
	     
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	   driver.findElement(MobileBy.id("com.android.chrome:id/search_box_text")).click();
	  driver.findElement(MobileBy.id("com.android.chrome:id/url_bar")).sendKeys("selenium");
	  
	  
	 // driver.findElement(MobileBy.id("887d6232-2186-402b-995a-e4c95d3a608b")).click();
	 // driver.manage().timeouts().implicitlyWait(5,TimeUnit.seconds);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
		//driver.findElement(MobileBy.id("com.google.android.youtube:id/search_edit_text")0.sendKeys("Selenium");
	//driver.findElement(MobileBy.AndroidUIAutomator(UiSelector().text(\"selenium tutorial for beginners\")")).click();
		
		
		/*driver.manage().timeouts().implicitlyWait(5,TimeUnit.seconds);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
        
        while(driver.findElements(MobileBy.AccessibilityId("What is Selenium? Tutorial for Beginners - 5 minutes, 14 seconds - - Guru99 - 186K views - 5 years ago - play video")).size()==0) 
      //Use Below For Any Swipe Activity
        {
        Dimension d = driver.manage().window().getSize(); 
        TouchAction act = new TouchAction(driver);
        act.press(PointOption.point(d.width/2,3*d.height/4)).moveTo(PointOption.point(d.width/2,d.height/4)).release().perform();
        }
       */
		//Appium Advanced Enable Relaxed capability then execute 
     /*  { Dimension d = driver.manage().window().getsize
        driver.executeScript("mobile:shell",ImmutableMap.of("command","input swipe "+d.width/2+" "+3*d.height/4+" "+d.width/2+" "+d.height/4)); 
       } 
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 */
	}

	private static Object UiSelector() {
		// TODO Auto-generated method stub
		return null;
	}

	//private static RemoteWebElement id(String string) {
		// TODO Auto-generated method stub
		//return null;
	}

	


