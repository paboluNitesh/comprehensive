package uiStore;

import org.openqa.selenium.By;

public class BrandsUI {

	public static By brands=By.xpath("//img[@src='/images/header_logo_png.png']");
	
	public static By investors=By.xpath("//div[@class='navigation']//li//span[contains(text(),'Partners & Investors')]");
	
	public static By investors2=By.xpath("(//a[text()='Investors'])[2]");
}
