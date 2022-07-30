package uiStore;

import org.openqa.selenium.By;

public class LoginUI {

    public static By register=By.xpath("//a[@href='/en-us/sign-in']");
	
	public static By signup=By.xpath("//a[@class='event_internal_link']");
	
	public static By login=By.xpath("//button[contains(@class,'underline text-primaryCta lg:text-base ')]");
	
	public static By email=By.id("login-email");
	
	public static By password=By.id("login-password");
	
	public static By submit=By.xpath(" //input[@type='submit']");
}
