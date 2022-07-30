package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import reusablecomponents.ReusableHelper;
import uiStore.RegisterUI;
import utilities.Exceldatadriven;

public class RegisterObj {
	
	ReusableHelper rh=new ReusableHelper();
	public void registerD(WebDriver driver) throws Exception {
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
		
		
		rh.sendKeys(RegisterUI.firstname, edd.StringData("Sheet1", 1, 0));
		
		rh.sendKeys(RegisterUI.email, edd.StringData("Sheet1", 1, 1));
		
		rh.sendKeys(RegisterUI.password, edd.StringData("Sheet1", 1, 2));
		
		//rh.Click(registerUI.submit);
		
		driver.switchTo().window(parent);
		//System.out.println(driver.switchTo().window(parent).getTitle());
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		driver.findElement(By.xpath("//iframe[@class='lilo3746-iframe']"));
		//driver.switchTo().frame(3);
		driver.findElement(By.xpath("//iframe[@class='lilo3746-iframe']//following-sibling::a")).click();
		
		//Thread.sleep(40000);
	}

}
}
	}