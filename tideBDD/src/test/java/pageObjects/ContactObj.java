package pageObjects;


import org.openqa.selenium.WebDriver;

import reusablecomponents.ReusableHelper;
import uiStore.ContactUI;


public class ContactObj {

	ReusableHelper rh=new ReusableHelper();
	public void contact(WebDriver driver) throws Exception {
	
		rh.Click(ContactUI.contactus);
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='contact-iframe']")));
//		
//		rh.sendKeys(contactUI.write, "how to purchase");
//		
//		driver.switchTo().defaultContent();
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("contact");
		driver.get("https://tide.com/en-us");
	}
}
