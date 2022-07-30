package reusablecomponents;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import runner.Base;

public class ReusableHelper extends Base {
	public void Click(By path) {
		driver.findElement(path).click();
	}

	public void sendKeys(By path, String msg) {
		driver.findElement(path).sendKeys(msg);
	}

	public static String dateTime() {
		DateFormat df = new SimpleDateFormat("MM_DD_YYYY_HH_MM_SS");
		Date date = new Date();
		return df.format(date);
	}

	public void back() {
		driver.navigate().back();
	}
}
