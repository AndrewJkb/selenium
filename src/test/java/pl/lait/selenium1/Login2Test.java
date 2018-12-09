package pl.lait.selenium1;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObject.LoginPage;
import pl.lait.pageObject.ReservationPage;
import pl.lait.selenium1.Init;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Login2Test {

WebDriver driver = null;
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	
	
	
	/*@Test
	 public void login() {
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("tester129", "qwerty123");
	}*/
	
	@Test
	public void reservation() {
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs("tester129", "qwerty123");
		
		String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
		ReservationPage reservationPage = new ReservationPage();
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.roundTripRadioClick();
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.passengersCount("1");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.passengersCount("2");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.passengersCount("3");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.passengersCount("4");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.passengersCount("2");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.fromPortSelect("Frankfurt");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.fromPortSelect("London");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.fromPortSelect("New York");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.fromPortSelect("Paris");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.fromPortSelect("Portland");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.fromPortSelect("San Francisco");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.fromPortSelect("Seattle");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.fromPortSelect("Sydney");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.fromPortSelect("Zurich");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.fromPortSelect("London");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		// wybieranie miesiaca
		
		LocalDate today = LocalDate.now();
		
		for (int i = 1; i <= 12; i++) {
		reservationPage.fromMonthSelect(i);
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		}
		
		//today.getMonth();
		
		reservationPage.fromDaySelect("26");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		
		reservationPage.toPortSelect("New York");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.toMonthSelect("11");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.toDaySelect("30");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.EconomyClassRadioClick();
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.airlineSelect("No Preference");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.findFlightsClick();
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.outflightClick();
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.inflightClick();
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.reserveFlightsClick();
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.firstPerson("Janusz", "Kowlaski");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.pass0mealSelect("LCML");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.SecondPerson("Janina", "Kowalski","VGML");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		//reservationPage.pass1mealSelect("VGML");
		//Init.sleep(1);
		reservationPage.creditCard("BA");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.creditnumber("2134132423");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.cc_exp_dt_mn("01");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.cc_exp_dt_yr("2010");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.cc_person("Janusz", "John", "Kowalski");
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.SameAsBillingAddressCheckboxClick();
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(1);
		reservationPage.buyFlightsClick();
		Init.printScr(driver, "Login2test", testName);
		//Init.sleep(3);
		reservationPage.LogoutButtonClick();
		Init.printScr(driver, "Login2test", testName);
		Init.sleep(2);
	}
	
	@After
	
	public void close() {
		Init.sleep(5);
		Init.endTest();
	}

	
	
}
