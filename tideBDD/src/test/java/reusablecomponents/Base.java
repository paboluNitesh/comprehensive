package reusablecomponents;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.BrandsObj;
import pageObjects.ContactObj;
import pageObjects.FooterObj;
import pageObjects.LoginObj;
import pageObjects.RegisterObj;
import pageObjects.ReviewObj;
import pageObjects.SearchObj;
import pageObjects.ShopProductObj;
import pageObjects.SlidesObj;
import pageObjects.stainObj;
import utilities.Configproperties;
import utilities.Log4j;
import utilities.Screenshots;

public class Base {

	public static WebDriver driver;
	Configproperties con;
    Browser br;
	Log4j log = new Log4j();
	
	@BeforeSuite
	public void before() throws Exception {
		con = new Configproperties();
		br = new Browser();
		driver = br.driver();
		log.getInfo("intializing driver and browser");
	}

	@Test(priority = 1)
	public void registerTest() throws Exception {
		log.getInfo("starting register test");
		br.navigaterl(con.geturl());
		RegisterObj ro = new RegisterObj();
		ro.registerD(driver);
		
		log.getInfo("register test passed");
	}

	@Test(priority = 2)
	public void searchTest() {
		//br.navigaterl(con.geturl());
		log.getInfo("searchTest started");
		SearchObj so = new SearchObj();
		so.searchF(driver);
		log.getInfo("searchTest passed");
		
	}

	@Test(priority = 3)
	public void shopPTest() {
		log.getInfo("shopTest started");
		ShopProductObj spo = new ShopProductObj();
		spo.shopT(driver);
		
		log.getInfo("shopTest passed");
	}

	@Test(priority = 4)
	public void stainTest() {
		log.getInfo("stainTest started");
		
		stainObj st = new stainObj();
		st.stainT(driver);
		System.out.println("stain-passed");
		log.getInfo("stainTest passed");
	}

	@Test(priority = 5)
	public void contactTest() throws Exception {
		log.getInfo("contactTest started");
		ContactObj cont = new ContactObj();
		cont.contact(driver);
		System.out.println("contact-passed");
		log.getInfo("contactTest passed");
	}

	@Test(priority=6)
	public void loginTest() throws Exception {
		log.getInfo("loginTest started");
		LoginObj lo=new LoginObj();
			lo.loginD(driver);
		log.getInfo("loginTest passed");
	}
	@Test(priority=7)
	public void slidesTest() {
		log.getInfo("slideTest started");
		SlidesObj so=new SlidesObj();
		so.slidesD(driver);
		log.getInfo("slidesTest passed");
	}
	
	@Test(priority=8)
	public void reviewTest() throws Exception {
		log.getInfo("reviewTest started");
		ReviewObj ro= new ReviewObj();
		ro.review(driver);
		System.out.println("review-passed");
		log.getInfo("reviewTest passed");
	}
	
	@Test(priority=9)
	public void footerTest() {
		log.getInfo("footerTest started");
		FooterObj fo=new FooterObj();
		fo.footer(driver);
		log.getInfo("footerTest passed");
	}
	
	@Test(priority = 10)
	public void brandsTest() {
		log.getInfo("brandsTest started");
		BrandsObj bo = new BrandsObj();
		bo.brands(driver);
		log.getInfo("brandsTest passed");
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			Screenshots.screens(driver);
		}
//		if (result.getStatus() == ITestResult.SUCCESS) {
//			Screenshots.screens(driver);
//		}
	}

	@AfterTest
	public void quit() {
		driver.close();
		driver.quit();
	}
}
