package pageObjects;

import org.openqa.selenium.WebDriver;

import reusablecomponents.ReusableHelper;
import uiStore.ShopProductUI;

public class ShopProductObj {
	ReusableHelper rh=new ReusableHelper();
	public void shopT(WebDriver driver) {
		
		
		rh.Click(ShopProductUI.sproducts);
		
		String nameP=driver.findElement(ShopProductUI.pName).getText();
		
		String expected="Tide Clean Breeze Powder Laundry Detergent";
		
		if(expected.equalsIgnoreCase(nameP)) {
			System.out.println("valid name");
		}else {
			System.out.println("inavalid name");
		}
		
		driver.navigate().back();
		driver.navigate().back();

	}
}
