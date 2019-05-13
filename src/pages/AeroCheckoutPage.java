package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.ActionDriver;
import or.HomePageElements;
import or.aeroCheckoutElements;

public class AeroCheckoutPage extends ActionDriver{

	public AeroCheckoutPage(WebDriver driver) throws Exception {
		super(driver);
		if(!isElementPresent(aeroCheckoutElements.email)){
			throw new Exception("User is not on HomePage and is on "+getTitle());
		}
	}
	
	public AeroCheckoutPage enterShippingInfo(String country,String company, String state, String email ,String username, String Password,String firstname, String Lastname, String comapny, String Street, String appt, String town , String postcode, String phone ) {
		
		type(aeroCheckoutElements.email, email);
		click(aeroCheckoutElements.createAccCheckbox);
		type(aeroCheckoutElements.username, username);
		type(aeroCheckoutElements.password, Password);
		type(aeroCheckoutElements.firstName, firstname);
		type(aeroCheckoutElements.lastName, Lastname);
		type(aeroCheckoutElements.company, company);
		type(aeroCheckoutElements.streetAddress, Street);
		type(aeroCheckoutElements.apartment, appt);
		type(aeroCheckoutElements.town, town);
		type(aeroCheckoutElements.postCode, postcode);
		type(aeroCheckoutElements.phone, phone);
		//click(aeroCheckoutElements.stateDropdown);
		//click(aeroCheckoutElements.state1);
		click(aeroCheckoutElements.shipping);
		
		return this;
		
	}
	
	public AeroCheckoutPage SelectProduct() {
		click(aeroCheckoutElements.productName);
		return this;
	}
	
	public AeroCheckoutPage EnterCardInfo(String cardnumber, String expiryDate, String cardCode) {
		clickByJS(aeroCheckoutElements.paymentCreditCard);
		driver.switchTo().frame(driver.findElement(By.name("__privateStripeFrame8")));
		type(aeroCheckoutElements.cardNumber, cardnumber);
		driver.switchTo().frame(driver.findElement(By.name("__privateStripeFrame9")));
		type(aeroCheckoutElements.cardCode, cardCode);
		driver.switchTo().frame(driver.findElement(By.name("__privateStripeFrame10")));
		type(aeroCheckoutElements.expiryDate, expiryDate);
		return this;
	}
	
	public AeroCheckoutPage submitPage() {
		click(aeroCheckoutElements.termsCheckbox);
		click(aeroCheckoutElements.placeOrderButton);
	
		return this;
	}
	
	
	
	
	public LoginPage clickLoginLink() throws Exception{
		click(HomePageElements.loginLink);
		return new LoginPage(driver);
	}

}
