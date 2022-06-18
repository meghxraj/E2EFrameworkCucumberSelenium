package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

//	WebDriver driver;

	public FacebookPage(WebDriver driver) {
		//this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='email']")
	WebElement usern;
	
	@FindBy(xpath ="//input[@id='pass']")
	WebElement passwd;
	
	public WebElement getUsername() {
		return usern;
	}
	
	public WebElement getPassword() {
		return passwd;
	}
	
	
	
	public void enterUsername(String name) {
		usern.sendKeys(name);
	}
	
	public void enterPassword(String pass) {
		passwd.sendKeys(pass);
	}
}
