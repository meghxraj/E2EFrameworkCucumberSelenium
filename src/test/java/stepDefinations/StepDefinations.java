package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Learning.Base;
import io.cucumber.java.en.*;
import pageObjects.FacebookPage;

public class StepDefinations extends Base {
	WebDriver driver;
	//public static Logger log = LogManager.getLogger(Base.class.getName());
	FacebookPage lp;

	@Given("open {string} browser")
	public void open_browser(String browser) throws Exception {
		driver = initDriver();
		System.out.println("Browser is " + browser);
		//log.info("Initilized driver");
	}

	@Given("navigate to {string} website")
	public void navigate_to_website(String url) {
		System.out.println(url);
		driver.get(url);
	}

	@Given("verify pagetitle")
	public void verify_pagetitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.toLowerCase().contains("facebook"));
	}

	@When("user enters {string} and {string} and clicks on login button")
	public void user_enters_and_and_clicks_on_login_button(String username, String password) throws Exception {
		lp = new FacebookPage(driver);
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		Thread.sleep(10000);
		lp.enterUsername(username);
		lp.enterPassword(password);
	}

	@Then("verify if the user is logged in")
	public void verify_if_the_user_is_logged_in() {
		System.out.println(driver.getTitle());
		//LinkedInFeed feed = new LinkedInFeed(driver);
		//Assert.assertTrue(feed.getSearchEdit().isEnabled());
	}
}
