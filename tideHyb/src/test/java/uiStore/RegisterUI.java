package uiStore;

import org.openqa.selenium.By;

public class RegisterUI {

	public static By register=By.xpath("//a[@href='/en-us/sign-in']");
	
	public static By signup=By.xpath("//a[@class='event_internal_link']");
	
	public static By firstname=By.id("name");
	
	public static By email=By.id("email");
	
	public static By password=By.id("password");
	
	public static By submit =By.id("submit");
	
	public static By popup=By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']");
}
