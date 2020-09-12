package core;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	protected WebDriver driver;
	protected final static String base_url="https://www.amazon.in";
	protected final static String Title="Online Shopping site in India: Shop Online for Mobile, Books, Watches, Shoes and More -Amazon.in";
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@After
	public void clean_up() {
		driver.quit();
	}
}
