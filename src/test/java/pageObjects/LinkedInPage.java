package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInPage {
	WebDriver driver;
	
	public LinkedInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='session_key']")
	WebElement username;
	@FindBy(id = "session_password")
	WebElement password;
	@FindBy(xpath ="//button[@class='sign-in-form__submit-button']")
	WebElement signInBtn;
	
	public WebElement getUsername() {
		return username;
	}
	
	public void enterUsername(String id) {
		username.sendKeys(id);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickSigninBtn() {
		signInBtn.click();
	}
	
	

}
