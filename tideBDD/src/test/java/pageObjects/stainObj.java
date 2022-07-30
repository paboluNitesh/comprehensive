package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import reusablecomponents.ReusableHelper;
import uiStore.stainUI;
import utilities.Exceldatadriven;

public class stainObj {
	ReusableHelper rh=new ReusableHelper();
	public void stainT(WebDriver driver) {
		Exceldatadriven edd=new Exceldatadriven();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		rh.Click(stainUI.up);
		
		String verify=driver.findElement(stainUI.name).getText();
		
		String expected=edd.StringData("Sheet1", 1, 4);
		
		if(expected.equalsIgnoreCase(verify)) {
			System.out.println("marker stain");
		}else {
			System.out.println("different stain mark");
		}
//		
//		rh.Click(stainUI.learn);
//		String title=driver.getTitle();
//		
//		System.out.println(title);
//		
//		driver.navigate().back();
	}

}
