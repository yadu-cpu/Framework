package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class SearchPageObjects{
	

	 private WebDriver driver;
	 private By result=By.xpath("//span[contains(text(),'1-16 of over 50,000 results for')]");
	 private By expected_prod=By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple Airpods with Charging Case')]");
	 
	 public SearchPageObjects(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 @SuppressWarnings("deprecation")
	public void searchresult() {
		 boolean bool=driver.findElement(result).isDisplayed();
		 Assert.assertEquals(true, bool);
	 }
	 public void click_on_product() {
		 driver.findElement(expected_prod).click();
		 }
}

