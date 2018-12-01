package pl.lait.pageObject;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium1.Init;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservationPage {
	
	WebDriver driver = null;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
	WebElement oneWayRadio;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")
	WebElement roundTripRadio;
	
	@FindBy(name = "passCount")
	WebElement passCount;
	
	@FindBy(name = "fromPort")
	WebElement fromPort;
	
	@FindBy(name = "fromMonth")
	WebElement fromMonth;

	@FindBy(name = "fromDay")
	WebElement fromDay;
	
	@FindBy(name = "toPort")
	WebElement toPort;
	
	@FindBy(name = "toMonth")
	WebElement toMonth;
	
	@FindBy(name = "toDay")
	WebElement toDay;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")
	WebElement EconomyClassRadio;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")
	WebElement BusinessClassRadio;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")
	WebElement FirstClassRadio;
	
	@FindBy(name = "airline")
	WebElement airline;
	
	@FindBy(name ="findFlights")
	WebElement findFlights;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")
	WebElement outflightclick;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input")
	WebElement inflightclick;
	
	@FindBy(name ="reserveFlights")
	WebElement reserveFlights;
	
	@FindBy(name = "passFirst0")
	WebElement passFirst0Input;
	
	@FindBy(name = "passLast0")
	WebElement passLast0Input;
	
	@FindBy(name = "pass.0.meal") //value="LCML"
	WebElement pass0meal;
	
	@FindBy(name = "passFirst1")
	WebElement passFirst1Input;
	
	@FindBy(name = "passLast1")
	WebElement passLast1Input;
	
	@FindBy(name = "pass.1.meal") //value="VGML" 
	WebElement pass1meal;
	
	@FindBy(name = "creditCard")
	WebElement creditCardSelect;
	
	@FindBy(name = "creditnumber")
	WebElement creditnumberInput;
	
	@FindBy(name = "cc_exp_dt_mn")
	WebElement cc_exp_dt_mnSelect;
	
	@FindBy(name = "cc_exp_dt_yr")
	WebElement cc_exp_dt_yrSelect;
	
	@FindBy(name = "cc_frst_name")
	WebElement cc_frst_nameInput;
	
	@FindBy(name = "cc_mid_name")
	WebElement cc_mid_nameInput;
	
	@FindBy(name = "cc_last_name")
	WebElement cc_last_nameInput;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input") //checbox
	WebElement  SameAsBillingAddressCheckbox;
	
	@FindBy(name = "buyFlights")
	WebElement buyFlights; //button
	
	@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")
	WebElement LogoutButton;
	
	public ReservationPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void oneWayRadioClick() {
		oneWayRadio.click();
	}
	
	public void roundTripRadioClick() {
		roundTripRadio.click();
	}
	
	public void passengersCount (String count ) {
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByValue(count);
	}

	public void fromPortSelect(String fromp) {
		Select fromPortSelect = new Select(fromPort);
		fromPortSelect.selectByValue(fromp);
	}
	
	public void fromMonthSelect(int i) {
		Select fromMonthSelect = new Select(fromMonth);
		fromMonthSelect.selectByValue(i+"");
	}
	
	public void fromDaySelect(String fday) {
		Select fromDaySelect = new Select(fromDay);
		fromDaySelect.selectByValue(fday);
	}
	
	public void toPortSelect(String top) {
		Select toPortSelect = new Select(toPort);
		toPortSelect.selectByValue(top);
	}
	
	public void toMonthSelect(String tmonth) {
		Select toMonthSelect = new Select(toMonth);
		toMonthSelect.selectByValue(tmonth);
	}
	
	public void toDaySelect(String tday) {
		Select toDaySelect = new Select(toDay);
		toDaySelect.selectByValue(tday);
	}
	
	public void EconomyClassRadioClick() {
		EconomyClassRadio.click();
	}
	
	public void BusinessClassRadioClick() {
		BusinessClassRadio.click();
	}
	
	public void FirstClassRadioClick() {
		FirstClassRadio.click();
	}
	
	public void airlineSelect(String airlineselect) {
		Select airlineSelect = new Select(airline);
		airlineSelect.selectByVisibleText(airlineselect);
	}

	public void findFlightsClick() {
		findFlights.click();
		}
	
	public void outflightClick() {
		outflightclick.click();
	}
	
	public void inflightClick() {
		inflightclick.click();
	}
	
	public void reserveFlightsClick() {
		reserveFlights.click();
	}
	
	public void firstPerson(String passFirst0,String passLast0) {
		passFirst0Input.sendKeys(passFirst0);
		passLast0Input.sendKeys(passLast0);	
	}
	public void pass0mealSelect(String pass0mealselect) {
		Select pass0mealSelect = new Select(pass0meal);
		pass0mealSelect.selectByValue(pass0mealselect);
	}
	
	public void SecondPerson(String passFirst1,String passLast1, String pass1mealselect) {
		passFirst1Input.sendKeys(passFirst1);
		passLast1Input.sendKeys(passLast1);
		
		Select pass1mealSelect = new Select(pass1meal);
		pass1mealSelect.selectByValue(pass1mealselect);
		
	}
	/*public void pass1mealSelect(String pass1mealselect) {
		Select pass1mealSelect = new Select(pass1meal);
		pass1mealSelect.selectByValue(pass1mealselect);
	}*/
	
	public void creditCard(String creditCardSel) {
		Select creditCard = new Select(creditCardSelect);
		creditCard.selectByValue(creditCardSel);
	}
	
	public void creditnumber(String creditnumberInp) {
		creditnumberInput.sendKeys(creditnumberInp);
	}
	
	public void cc_exp_dt_mn(String cc_exp_dt_mnSel) {
		Select cc_exp_dt_mn = new Select(cc_exp_dt_mnSelect);
		cc_exp_dt_mn.selectByVisibleText(cc_exp_dt_mnSel);
	}
	
	public void cc_exp_dt_yr(String cc_exp_dt_yrSel) {
		Select cc_exp_dt_yr = new Select(cc_exp_dt_yrSelect);
		cc_exp_dt_yr.selectByVisibleText(cc_exp_dt_yrSel);
	}
	
	
	public void cc_person(String cc_frst_name,String cc_mid_name, String cc_last_name) {
		cc_frst_nameInput.sendKeys(cc_frst_name);
		cc_mid_nameInput.sendKeys(cc_mid_name);
		cc_last_nameInput.sendKeys(cc_last_name);
		
	}
	
	public void SameAsBillingAddressCheckboxClick() {
		SameAsBillingAddressCheckbox.click();
	}
	
	public void buyFlightsClick() {
		buyFlights.click();
	}
	
	public void LogoutButtonClick(){
		 LogoutButton.click();
	}
	
	
	
	
}
