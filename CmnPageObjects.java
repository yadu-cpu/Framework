package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class CmnPageObjects {
private WebDriver driver;

private By H_menu=By.id("nav-hamburger-menu");
private By A_Logo=By.id("nav-logo");
private By Search_Box=By.id("twotabsearchtextbox");
private By Search_Button=By.xpath("//input[@value='Go']");
private By Orders=By.id("nav-orders");
private By Prime=By.id("nav-link-prime");
private By Cart=By.id("nav-cart");

public CmnPageObjects(WebDriver driver) {
	this.driver=driver;
}
@SuppressWarnings("deprecation")
public void click_on_H_menu() {
	boolean bool=driver.findElement(H_menu).isDisplayed();
	Assert.assertEquals("Hamburger Menu Tab", true, bool);
}
public void search_text_box(String text) {
	boolean bool=driver.findElement(Search_Box).isDisplayed();
	Assert.assertEquals(true, bool);
	driver.findElement(Search_Box).sendKeys(text);
}
public void search_button() {
	boolean bool=driver.findElement(Search_Button).isDisplayed();
	Assert.assertEquals(true, bool);
	driver.findElement(Search_Button).click();
}
public void Logo_check() {
	boolean bool=driver.findElement(A_Logo).isDisplayed();
	Assert.assertEquals(true, bool);
}
@SuppressWarnings("deprecation")
public void cart_check() {
	boolean bool=driver.findElement(Cart).isDisplayed();
	Assert.assertEquals(true, bool);
}
@SuppressWarnings("deprecation")
public void prime_check() {
	boolean bool=driver.findElement(Prime).isDisplayed();
	Assert.assertEquals(true, bool);
}
@SuppressWarnings("deprecation")
public void validatePageTitle(String exp) {
	String act=driver.getTitle();
	Assert.assertEquals(exp, act);
}
}
