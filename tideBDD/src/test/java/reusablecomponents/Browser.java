package reusablecomponents;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import utilities.Exceldatadriven;
import utilities.extentReport;

public class Browser {
	WebDriver driver = null;
	Exceldatadriven edd;

	public WebDriver driver() {
		edd = new Exceldatadriven();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	
		return driver;
		
	}

	public WebDriver navigaterl(String url) {	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		
	
		return driver;
	}

	public void quitbrowser(WebDriver driver) {
		driver.close();
		driver.quit();
	}
}
