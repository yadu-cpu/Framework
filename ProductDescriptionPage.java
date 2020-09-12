package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDescriptionPage {
	
	private WebDriver driver;
	
	private By Product_Name=By.id("productTitle");
	private By Cart_Button= By.xpath("//input[@id='add-to-cart-button']");
	private By buy_now=By.xpath("//inpuyt[@id='buy-now-button']");
	private By wishlist=By.xpath("//a[@id=wishListMainButton-announce']");
	private By price=By.xpath("//td[@id='priceblock_ourprice_lbl']");
	
	public ProductDescriptionPage(WebDriver driver) {
		this.driver=driver;
	}
	public void check_product_title() {
		boolean bool=driver.findElement(Product_Name).isDisplayed();
		Assert.assertEquals(true,bool);
	}
	public void check_cart() {
		driver.findElement(Cart_Button).click();
	}
	

}
