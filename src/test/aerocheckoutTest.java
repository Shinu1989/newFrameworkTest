package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import core.ActionDriver;
import core.OpenAndCloseBrowser;
import or.HomePageElements;
import or.LoginPageElements;
import or.UserPageElements;
import pages.AeroCheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;

public class aerocheckoutTest extends OpenAndCloseBrowser {

	@BeforeMethod
	public void navigateToURL() {
		ActionDriver browser = new ActionDriver(driver);
		browser.navigateTo("https://demo.buildwoofunnels.com/aerocheckout-demo/checkouts/beta11/");
	}

	@Test
	public void verifyChecoutWithoutCouponCode() throws Exception {

		AeroCheckoutPage acp = new AeroCheckoutPage(driver);
		acp.enterShippingInfo("United States (US)", "bwf", "Kansas", "woofunnel6@gmail.com", "woofunnel6",
				"onevoice123", "woofunnel6", "testingonly", "bwf", "B1-632", "basement", "Janakpuri", "66103",
				"9650993909");
		acp.SelectProduct();
	
		acp.EnterCardInfo("4242 4242 4242 4242", "02/24", "123");
		acp.submitPage();
		

	}

}
