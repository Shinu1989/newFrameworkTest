package core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDriver {
	

	protected WebDriver driver;
	long shortWait=30;
	long longWait=60;
	
	
	public ActionDriver(WebDriver driver){
		this.driver=driver;
	}


	public void waitForElement(By loc){
		WebDriverWait wait=new WebDriverWait(driver, longWait);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(loc));
	}
	
	public void click(By loc){
		waitForElement(loc);
		WebElement element=driver.findElement(loc);
		element.click();		
	}
	
	public void clickByJS(By loc){
		waitForElement(loc);
		WebElement element=driver.findElement(loc);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);	
	}
	
	public void type(By loc, String text){
		waitForElement(loc);
		WebElement element=driver.findElement(loc);
		element.sendKeys(text);
	}
	
	public void navigateTo(String url){
		driver.get(url);		
	}
	
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public boolean textIsEqualTo(By loc, String text){
		waitForElement(loc);
		WebElement element=driver.findElement(loc);
		return element.getText().equalsIgnoreCase(text);
	}
	
	
	public boolean isElementPresent(By loc){
		waitForElement(loc);
		WebElement element=driver.findElement(loc);
		return element.isDisplayed();
	
		
	}
	

	
	

}
