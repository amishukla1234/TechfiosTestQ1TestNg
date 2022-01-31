package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Pages.AddCategoryPage;

import util.BrowserFactory;

public class AddCategoryTest {

	/*
	 * Test 1: Validate a user is able to add a category and once the category is
	 * added it should display.
	 */
	
	WebDriver driver;

	
@Test
	public void userShouldBeAbleToAddCategory() throws InterruptedException {
		BrowserFactory.readConfig();
		driver = BrowserFactory.launchBrowser();
		
		AddCategoryPage addCategoryPage = PageFactory.initElements(driver, AddCategoryPage.class);
		 addCategoryPage.UserShldBeAbleToAddNewcategory();
		
		
	}
}
