package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import reusablecomponents.ReusableHelper;
import uiStore.BrandsUI;
import utilities.Exceldatadriven;

public class BrandsObj {

	ReusableHelper rh=new ReusableHelper();
	public void brands(WebDriver driver) {
		Exceldatadriven edd=new Exceldatadriven();
		rh.Click(BrandsUI.brands);
		
		WebElement ele = driver.findElement(BrandsUI.investors);
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
       String investor=driver.findElement(BrandsUI.investors2).getText();
       System.out.println(investor);
       
       String expected=edd.StringData("Sheet1", 3, 0);
       if(expected.equalsIgnoreCase(investor)) {
    	   System.out.println("brands links are working");
       }else {
    	   System.out.println("brands links aren't working");
       }
		driver.navigate().back();
	}
}
