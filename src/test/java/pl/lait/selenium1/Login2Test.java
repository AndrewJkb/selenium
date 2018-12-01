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
		
		
		ReservationPage reservationPage = new ReservationPage();
		//Init.sleep(1);
		reservationPage.roundTripRadioClick();
		//Init.sleep(1);
		reservationPage.passengersCount("1");
		//Init.sleep(1);
		reservationPage.passengersCount("2");
		//Init.sleep(1);
		reservationPage.passengersCount("3");
		//Init.sleep(1);
		reservationPage.passengersCount("4");
		//Init.sleep(1);
		reservationPage.passengersCount("2");
		//Init.sleep(1);
		reservationPage.fromPortSelect("Frankfurt");
		//Init.sleep(1);
		reservationPage.fromPortSelect("London");
		//Init.sleep(1);
		reservationPage.fromPortSelect("New York");
		//Init.sleep(1);
		reservationPage.fromPortSelect("Paris");
		//Init.sleep(1);
		reservationPage.fromPortSelect("Portland");
		//Init.sleep(1);
		reservationPage.fromPortSelect("San Francisco");
		//Init.sleep(1);
		reservationPage.fromPortSelect("Seattle");
		//Init.sleep(1);
		reservationPage.fromPortSelect("Sydney");
		//Init.sleep(1);
		reservationPage.fromPortSelect("Zurich");
		//Init.sleep(1);
		reservationPage.fromPortSelect("London");
		//Init.sleep(1);
		// wybieranie miesiaca
		
		LocalDate today = LocalDate.now();
		
		for (int i = 1; i <= 12; i++) {
		reservationPage.fromMonthSelect(i);
		//Init.sleep(1);
		}
		
		//today.getMonth();
		
		reservationPage.fromDaySelect("26");
		//Init.sleep(1);
		
		reservationPage.toPortSelect("New York");
		//Init.sleep(1);
		reservationPage.toMonthSelect("11");
		//Init.sleep(1);
		reservationPage.toDaySelect("30");
		//Init.sleep(1);
		reservationPage.EconomyClassRadioClick();
		//Init.sleep(1);
		reservationPage.airlineSelect("No Preference");
		//Init.sleep(1);
		reservationPage.findFlightsClick();
		//Init.sleep(1);
		reservationPage.outflightClick();
		//Init.sleep(1);
		reservationPage.inflightClick();
		//Init.sleep(1);
		reservationPage.reserveFlightsClick();
		//Init.sleep(1);
		reservationPage.firstPerson("Janusz", "Kowlaski");
		//Init.sleep(1);
		reservationPage.pass0mealSelect("LCML");
		//Init.sleep(1);
		reservationPage.SecondPerson("Janina", "Kowalski","VGML");
		//Init.sleep(1);
		//reservationPage.pass1mealSelect("VGML");
		//Init.sleep(1);
		reservationPage.creditCard("BA");
		//Init.sleep(1);
		reservationPage.creditnumber("2134132423");
		//Init.sleep(1);
		reservationPage.cc_exp_dt_mn("01");
		//Init.sleep(1);
		reservationPage.cc_exp_dt_yr("2010");
		//Init.sleep(1);
		reservationPage.cc_person("Janusz", "John", "Kowalski");
		//Init.sleep(1);
		reservationPage.SameAsBillingAddressCheckboxClick();
		//Init.sleep(1);
		reservationPage.buyFlightsClick();
		//Init.sleep(3);
		reservationPage.LogoutButtonClick();
		Init.sleep(2);
	}
	
	@After
	
	public void close() {
		Init.sleep(5);
		Init.endTest();
	}

	
	
}
