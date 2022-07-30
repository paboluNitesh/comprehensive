package uiStore;

import org.openqa.selenium.By;

public class ReviewUI {

//	public static By search= By.name("q");
//	
//	public static By product=By.xpath("(//a[@class='product-preview-title'])[1]");
//	
//	public static By review=By.xpath("//button[@class='button-link event_product_review secondary']");
//	
//	public static By productButton=By.xpath("//div[@class='col-12']//button[contains(text(),'Products')]");
	
	public static By wash=By.xpath("(//a[@class='menu-item-title event_menu_click '])[3]");
	
	public static By remove=By.xpath("(//a[@href='/en-us/how-to-wash-clothes/how-to-remove-stains'])[2]");
	
	public static By stain=By.id("article-listing-search-input");
	
	public static By link =By.xpath("//div[@class='article-listing-search-results']");
	
	public static By stainVal=By.xpath("//span[text()='How to Remove Ketchup Stains']");
}
