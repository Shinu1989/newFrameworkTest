package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import core.ActionDriver;
import core.OpenAndCloseBrowser;
import or.HomePageElements;
import or.LoginPageElements;
import or.UserPageElements;
import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;

public class LoginPageTest extends OpenAndCloseBrowser {
	
	@BeforeMethod
	public void navigateToURL(){
		ActionDriver browser = new ActionDriver(driver);
		browser.navigateTo("https://www.meritnation.com/");
	}
	
	public static final String loginSteps = "1. Navigate to meritnation <br> 2. Click on login link <br> 3. Fill Credentials <br>";
	
	@Test(description=loginSteps,dataProviderClass=dataprovider.DataProviderForLogin.class,dataProvider="getDataFromXls")
	public void verifyUser(String username,String password) throws Exception{
		
		/*ActionDriver loginPage = new ActionDriver(driver);
		loginPage.navigateTo("https://www.meritnation.com/");
		loginPage.click(HomePageElements.loginLink);
		loginPage.type(LoginPageElements.getUsername, "sunaina@test.com");
		loginPage.type(LoginPageElements.getPassword, "12345678");
		loginPage.click(LoginPageElements.getLoginBtn);
		
		assert loginPage.textIsEqualTo(UserPageElements.verifyUser, "What's new with you?"):"Expected: failed";*/
		
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = homePage.clickLoginLink();
		UserPage userPage=loginPage.signIn(username, password);
		assert userPage.verifyUserText("What's     new with you?"):"Expected: failed";
		
		
		
		/*HomePage homePage = new HomePage(driver);
		LoginPage loginPage = homePage.clickLoginLink();
		UserPage userPage=loginPage.getUsername("sunaina@test.com").getPassword("12345678").clickLoginBtn();
		assert userPage.verifyUserText("What's new with you?"):"Expected: failed";*/
	}
	
	

}
