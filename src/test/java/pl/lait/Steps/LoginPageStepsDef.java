package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pl.lait.pageObject.LoginPage;
import pl.lait.pageObject.ReservationPage;
import pl.lait.selenium1.Init;

public class LoginPageStepsDef {
	
	WebDriver driver = null;
	ReservationPage reservationPage = new ReservationPage();
	
	@Given("^I open main page$")
	public void i_open_main_page() throws Throwable {
	   driver = Init.getDriver();
	}

	@When("^I fill the login from login \"([^\"]*)\" and Pass \"([^\"]*)\"$")
	public void i_fill_the_login_from_login_and_Pass(String arg1, String arg2) throws Throwable {
	    
		LoginPage loginPage = new LoginPage();
		loginPage.goToLoginPage();
		loginPage.loginAs(arg1, arg2);
	}

	@Then("^I should see the flight reservacion$")
	public void i_should_see_the_flight_reservacion() throws Throwable {
	    
	    throw new PendingException();
	}
	
	@Given("^I open reservation page$")
	public void i_open_reservation_page() throws Throwable {
		ReservationPage reservationPage = new ReservationPage();
		reservationPage.roundTripRadioClick();
		reservationPage.passengersCount("2");
		reservationPage.fromPortSelect("London");
		for (int i = 1; i <= 12; i++) {
			reservationPage.fromMonthSelect(i);
		}
		reservationPage.fromDaySelect("26");
		reservationPage.toPortSelect("New York");
		reservationPage.toMonthSelect("11");
		reservationPage.toDaySelect("30");
		reservationPage.EconomyClassRadioClick();
		reservationPage.airlineSelect("No Preference");
		reservationPage.findFlightsClick();
	}

	@When("^I fill all the reservation form$")
	public void i_fill_all_the_reservation_form() throws Throwable {
		reservationPage.outflightClick();
		reservationPage.inflightClick();
		reservationPage.reserveFlightsClick();
		reservationPage.firstPerson("Janusz", "Kowlaski");
		reservationPage.pass0mealSelect("LCML");
		reservationPage.SecondPerson("Janina", "Kowalski","VGML");
		reservationPage.creditCard("BA");
		reservationPage.creditnumber("2134132423");
		reservationPage.cc_exp_dt_mn("01");
		reservationPage.cc_exp_dt_yr("2010");
		reservationPage.cc_person("Janusz", "John", "Kowalski");
		reservationPage.SameAsBillingAddressCheckboxClick();
		reservationPage.buyFlightsClick();
	}
	
	@Then("^I should filled all the pools and logout$")
	public void i_should_filled_all_the_pools_and_logout() throws Throwable {
		reservationPage.LogoutButtonClick();
		Init.endTest();
	    
	}
	
	
	
}