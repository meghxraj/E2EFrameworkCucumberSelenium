package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInFeed {
	WebDriver driver;
	
	public LinkedInFeed(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='search-global-typeahead__input always-show-placeholder']")
	WebElement searchEdit;
	
	public WebElement getSearchEdit() {
		return searchEdit;
	}
	
}
