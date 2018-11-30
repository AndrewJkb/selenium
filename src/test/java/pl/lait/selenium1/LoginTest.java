package pl.lait.selenium1;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest {
	
	WebDriver driver = null;
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
	}

	@Ignore
	@Test
	public void clickOnMenuItems() {
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SUPPORT")).click();
		driver.findElement(By.linkText("CONTACT")).click();
	}
	
	@Ignore
	@Test
	public void login() {
		
		driver.findElement(By.linkText("SIGN-ON")).click();
    	driver.findElement(By.name("userName")).sendKeys("tester129");
    	driver.findElement(By.name("password")).sendKeys("qwerty123");
    	driver.findElement(By.name("login")).click();
    	
    	
    	String roundTrip = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]";
    	String oneWay =    "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
   	
    	driver.findElement(By.xpath(roundTrip)).click();
    	driver.findElement(By.xpath(oneWay)).click();
        	
    	Select pass_Count = new Select(driver.findElement(By.name("passCount")));
    	pass_Count.selectByValue("2");
    	
    	Init.sleep(5);
    	
	}
	
	
	@After
	
	public void close() {
		Init.endTest();
	}
	
}
