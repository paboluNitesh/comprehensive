package pageObjects;

import org.openqa.selenium.WebDriver;

import reusablecomponents.ReusableHelper;
import uiStore.FooterUI;
import utilities.Exceldatadriven;

public class FooterObj {
ReusableHelper rh=new ReusableHelper();
public void footer(WebDriver driver) {
	Exceldatadriven edd=new Exceldatadriven();
	rh.Click(FooterUI.simply);
	
	rh.Click(FooterUI.shop);
	
	String name=driver.findElement(FooterUI.OXI).getText();
	
	System.out.println(name);
	
	String expected=edd.StringData("Sheet1", 1, 7);
	
	if(expected.equalsIgnoreCase(name)) {
		System.out.println("valid product");
	}else {
		System.out.println("invalid product");
	}
	
	driver.navigate().back();
}
}
