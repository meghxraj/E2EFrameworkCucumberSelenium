package Learning;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;

	public WebDriver initDriver() throws Exception {
		// getting properties file path
		String dir = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(dir + "\\FrameworkProperties.properties");

		// creating properties var
		Properties pro = new Properties();
		pro.load(file);

		// checking for browser version
		String browser = pro.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			//t0o run the test in headless mode add arguments in ChromeOptions
			/*
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("headless"); driver=
			 * driver = WebDriverManager.chromedriver().capabilities(options).create();
			 */
			
			
			driver = WebDriverManager.chromedriver().create();
		} else if (browser.equalsIgnoreCase("edge"))
			driver = WebDriverManager.edgedriver().create();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = WebDriverManager.firefoxdriver().create();
		else {
			driver = null;
			System.out.println("Invalid browser name in properties file");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		return driver;
	}
	public void getScreenShot(String tcName,WebDriver driver) throws Exception {
		TakesScreenshot s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"\\reports\\"+tcName+".png";
		FileUtils.copyFile(src, new File(dest));
	}

}
