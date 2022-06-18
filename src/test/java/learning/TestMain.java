package learning;


import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import Learning.Base;
import pageObjects.AmazonMainPage;
import pageObjects.FacebookPage;

public class TestMain extends Base{
	WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initilize() throws Exception {
		driver = initDriver();
		log.info("Initilized driver");
	}
	@Test
	public void baseTest() throws Exception {
		
		driver.get("https://www.facebook.com/");
		//log.info("Amazon Homepage");
		FacebookPage am = new FacebookPage(driver);
		am.enterUsername("test");
		am.enterPassword("password");
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		log.info("browser close");

	}
}
