package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import reusablecomponents.ReusableHelper;
import uiStore.SearchUI;
import utilities.Exceldatadriven;

public class SearchObj {
	
	ReusableHelper rh=new ReusableHelper();
	public void searchF(WebDriver driver) {
		Exceldatadriven edd=new Exceldatadriven();
		rh.sendKeys(SearchUI.search,edd.StringData("Sheet1", 1, 3));
		
		driver.findElement(SearchUI.search).sendKeys(Keys.ENTER);
		
		String search=driver.findElement(SearchUI.validate).getText();
		
		System.out.println(search);
		
		String expected=edd.StringData("Sheet1", 3, 1);
		
		if(expected.equalsIgnoreCase(search)) {
			System.out.println("search functionality passed");
		}else {
			System.out.println("search functionality failed");
		}
		driver.navigate().back();
	}
}
