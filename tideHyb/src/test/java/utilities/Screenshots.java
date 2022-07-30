package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import reusablecomponents.ReusableHelper;

public class Screenshots {
	public static String screens(WebDriver driver)  {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShots/" + ReusableHelper.dateTime() + ".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("ScreeenShot Captured");
		return dest.getAbsolutePath();
	}
}
