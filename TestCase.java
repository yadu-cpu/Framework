package testcases;

import org.junit.Test;

import core.TestBase;
import pageobjects.CmnPageObjects;
import pageobjects.ProductDescriptionPage;
import pageobjects.SearchPageObjects;

public class TestCase extends TestBase {
	
	@Test
	public void product_description() {
		driver.get(base_url);
		ProductDescriptionPage p=new ProductDescriptionPage(driver);
		CmnPageObjects o=new CmnPageObjects(driver);
		o.search_text_box("Earpods");
		o.search_button();
		SearchPageObjects s=new SearchPageObjects(driver);
		//p.check_cart();
	}

}
