package uiStore;

import org.openqa.selenium.By;

public class ReviewUI {

	public static By search= By.name("q");
	
	public static By product=By.xpath("(//a[@class='product-preview-title'])[1]");
	
	public static By review=By.xpath("//button[@class='button-link event_product_review secondary']");
	
	public static By productButton=By.xpath("//button[contains(text(),'Products')] ");
	
	
}
