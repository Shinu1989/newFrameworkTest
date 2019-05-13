package or;

import org.openqa.selenium.By;

public class aeroCheckoutElements {
	
	public static By email=By.id("billing_email");
	public static By firstName=By.id("billing_first_name");
	public static By lastName=By.id("billing_last_name");
	public static By company=By.id("shipping_company");
	public static By streetAddress=By.id("shipping_address_1");
	public static By apartment=By.id("shipping_address_2");
	public static By town=By.id("shipping_city");
	public static By postCode=By.id("shipping_postcode");
	public static By country=By.id("select2-shipping_country-container");
	
	public static By state=By.id("select2-shipping_state-container");
	public static By phone=By.id("billing_phone");
	public static By productName=By.xpath("//span[contains(text(),'Simple D3 Supplement 6768 custom ')]");
	public static By paymentCreditCard=By.xpath("//label[contains(@for,'payment_method_stripe')]/img[1]");
	public static By cardNumber=By.id("stripe-card-element");
	public static By expiryDate=By.name("exp-date");
	public static By cardCode=By.name("cvc");
	public static By termsCheckbox=By.id("terms");
	public static By placeOrderButton=By.id("place_order");
	public static By couponCodeTextBox=By.id("wfacp_coupon_code_field");
	public static By createAccCheckbox=By.id("createaccount");
	public static By username=By.id("account_username");
	public static By password=By.id("account_password");
	public static By stateDropdown=By.className("select2-selection select2-selection--single");
	public static By state1=By.id("select2-shipping_state-result-dw3e-AP");
	public static By iframeCard=By.name("__privateStripeFrame8");
	public static By iframeDate=By.name("__privateStripeFrame9");
	public static By iframeCVV=By.name("__privateStripeFrame10");
	
	
	public static By shipping=By.xpath("//label[contains(@for,'shipping_method_0_local_pickup63')]");
	public static By applyButton=By.name("apply_coupon");
	
	
	

}
