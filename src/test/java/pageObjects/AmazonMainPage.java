package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMainPage {
	WebDriver Driver;
	public AmazonMainPage(WebDriver driver){
		this.Driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@class='nav-action-button']")
	WebElement signInBtn;
	
	
	public WebElement signInBtn() {
		return signInBtn;
	}
	
	public void clickSignIn() {
		signInBtn.click();
	}
}
