package pageObjects;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import reusablecomponents.ReusableHelper;
import uiStore.ReviewUI;
import uiStore.SearchUI;
import utilities.Exceldatadriven;

public class ReviewObj {
	ReusableHelper rh = new ReusableHelper();

	public void review(WebDriver driver) throws InterruptedException {
		Exceldatadriven edd = new Exceldatadriven();

		System.out.println("review started");
		rh.sendKeys(SearchUI.search, edd.StringData("Sheet1", 1, 3));
		System.out.println("Hi");
		driver.findElement(SearchUI.search).sendKeys(Keys.ENTER);
          
		rh.Click(ReviewUI.productButton);

		rh.Click(ReviewUI.product);
		String text = driver.findElement(ReviewUI.review).getText();

		String expected = edd.StringData("Sheet1", 1, 6);

		if (expected.equalsIgnoreCase(text)) {
			System.out.println("review is present");
		} else {
			System.out.println("review option is not present");
		}
		
		driver.navigate().back();
		driver.navigate().back();
	}
}
