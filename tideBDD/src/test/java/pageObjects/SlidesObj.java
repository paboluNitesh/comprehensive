package pageObjects;

import org.openqa.selenium.WebDriver;

import reusablecomponents.ReusableHelper;
import uiStore.SlidesUI;
import utilities.Exceldatadriven;

public class SlidesObj {

	ReusableHelper rh=new ReusableHelper();
	public void slidesD(WebDriver driver) {
		Exceldatadriven edd=new Exceldatadriven();
		rh.Click(SlidesUI.slides);
		
		rh.Click(SlidesUI.slidesleft);
		
	rh.Click(SlidesUI.slidesLearn);
		
		String wash=driver.findElement(SlidesUI.wash).getText();
		
		String expected=edd.StringData("Sheet1", 5, 0);
		
		if(expected.equalsIgnoreCase(wash)) {
			System.out.println("slides worked");
		}else {
			System.out.println("slides are not working");
		}
		
		driver.navigate().back();
	}
}
