package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import reusablecomponents.ReusableHelper;
import uiStore.LoginUI;
import uiStore.RegisterUI;
import utilities.Exceldatadriven;

public class LoginObj {
	ReusableHelper rh=new ReusableHelper();
	public void loginD(WebDriver driver) throws Exception {
		Exceldatadriven edd=new Exceldatadriven();
		rh.Click(RegisterUI.register);
		
		rh.Click(RegisterUI.signup);
		
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{
		String child_window=I1.next();
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		System.out.println(driver.switchTo().window(child_window).getTitle());
		
		rh.Click(LoginUI.login);
		
		rh.sendKeys(LoginUI.email, edd.StringData("Sheet1", 1, 1));
		
		rh.sendKeys(LoginUI.password, edd.StringData("Sheet1", 1, 2));
		
		//rh.Click(loginUI.submit);
//		driver.navigate().back();
		driver.switchTo().window(parent);
//		driver.navigate().back();
//		driver.navigate().back();
		driver.get("https://tide.com/en-us");
}
}
	}
}