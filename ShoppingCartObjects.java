package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartObjects { 
	
	private WebDriver driver;
	private By aded=By.xpath("//h1[@class=a-size-medium a-text-bold']");
	private By proceed=By.xpath("//a[@id='hlb-ptc-btn-native']");
	private By quantity=By.xpath("//div[@class='a-row a-spacing-micro']//span[contains(text(),'(1 item):']");
	
	public ShoppingCartObjects(WebDriver driver) {
		this.driver=driver;
	}
public void check_add_to_cart() {
	boolean bool=driver.findElement(aded).isDisplayed();
	Assert.assertEquals(true,bool);
}
public void check_quantity() {
	boolean bool=driver.findElement(quantity).isDisplayed();
	Assert.assertEquals(true,bool);
}
public void click_proceed_button() {
	driver.findElement(proceed).isDisplayed();
}
}
