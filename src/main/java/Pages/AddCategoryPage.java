package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryPage {

	/*
	 * Test 1: Validate a user is able to add a category and once the category is
	 * added it should display.
	 */

	WebDriver driver;

	// create a constructor  to invite the driver
	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements Library
	@FindBy(how = How.NAME, using = "categorydata")
	WebElement addNewCategoryData;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement addCategoryButton;

	public void UserShldBeAbleToAddNewcategory() throws InterruptedException {
		
		addNewCategoryData.sendKeys("Appium");
		addCategoryButton.click();
	}
	
	
	
	
	
	
}



