package pl.lait.selenium1;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Init {
	static WebDriver driver;
	
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "d:\\tester\\chromedriver_win32\\chromedriver.exe");
    	DesiredCapabilities cap = DesiredCapabilities.chrome();
    	URL url = null;
		try {
			url = new URL("http://192.168.0.125:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	if (driver==null) {
    			//driver = new  ChromeDriver();
    			driver = new RemoteWebDriver(url, cap);
    	driver.get("http://newtours.demoaut.com");
    	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  timeout dla całęj strony
    	return driver;
    	} else {
    		return driver;
    	}
	}

	public static void endTest() {
		driver.quit();
		driver = null;
		}
	
	/**
	 * Metoda  wstrzymuje wykonanie programu na X sekund
	 * @param seconds
	 */
			
	public static void sleep(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
