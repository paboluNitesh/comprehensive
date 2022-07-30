package stepDefintions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reusablecomponents.Base;

public class TideStepDefinitions extends Base {
//extentReport er=new extentReport();
//ExtentReports extent=er.ExtentReportD();
//ExtentTest test;
	@Given("I want to go to the home page")
	public void i_want_to_go_to_the_home_page() {
		try {
			before();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@When("I naviagate to the url")
	public void i_naviagate_to_the_url() {
		try {
			registerTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//test.pass("register test passed");
	}

	@Then("it should navigate to the website")
	public void it_should_navigate_to_the_website() {
		System.out.println("register page is working");
	}

	@Given("I as an user I want to verify search field")
	public void i_as_an_user_i_want_to_verify_search_field() {
		System.out.println("search test started");
	}

	@When("I enter a product name in the search field")
	public void i_enter_a_product_name_in_the_search_field() {
		searchTest();
	}

	@Then("it should display products")
	public void it_should_display_products() {
		System.out.println("products displayed");
	}

	@Given("I as an user I want to list in the shop products")
	public void i_as_an_user_i_want_to_list_in_the_shop_products() {
		System.out.println("shop products started");
	}

	@When("I hover on the shop products")
	public void i_hover_on_the_shop_products() {
		shopPTest();
	}

	@Then("it should display products list")
	public void it_should_display_products_list() {
		System.out.println("shop products is opened");
	}

	@Given("I as an user I want to use stain guide")
	public void i_as_an_user_i_want_to_use_stain_guide() {
		System.out.println("stain Test started");
	}

	@When("I scroll or up and down button")
	public void i_scroll_or_up_and_down_button() {
		stainTest();
	}

	@Then("it should display various options present in the feature")
	public void it_should_display_various_options_present_in_the_feature() {
		System.out.println("stain picker is working");
	}

	@Given("I as an user I want to contact to the customer care")
	public void i_as_an_user_i_want_to_contact_to_the_customer_care() {
		System.out.println("contact test started");
	}

	@When("I click on the contact us link")
	public void i_click_on_the_contact_us_link() {
		try {
			contactTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("it should navigate to that page")
	public void it_should_navigate_to_that_page() {
		System.out.println("contact us page is working");
	}

	@Given("I as an user I want to login")
	public void i_as_an_user_i_want_to_login() {
		System.out.println("login Test started");
	}

	@When("I gave my login credentials to the system")
	public void i_gave_my_login_credentials_to_the_system() throws Exception {
		loginTest();
	}

	@Then("system should accept and navigate to the home page")
	public void system_should_accept_and_navigate_to_the_home_page() {
		System.out.println("login page is working");
	}

	@Given("I as an user I want verify slides presnt at the page")
	public void i_as_an_user_i_want_verify_slides_presnt_at_the_page() {
		System.out.println("slides test Started");
	}

	@When("I entered to the home page")
	public void i_entered_to_the_home_page() {
		slidesTest();
	}

	@Then("it should display slides")
	public void it_should_display_slides() {
		System.out.println("Slides are working");
	}

	@Given("I as an user i want to review the products")
	public void i_as_an_user_i_want_to_review_the_products() {
	   System.out.println("review test Started");
	}
	
	@When("I entered in to product page")
	public void i_entered_in_to_product_page() throws Exception {
		reviewTest();
	}

	@Then("I can review that product and know the product details")
	public void i_can_review_that_product_and_know_the_product_details() {
		System.out.println("review section is present");
	}

	@Given("i as an user I want to verify footer links")
	public void i_as_an_user_i_want_to_verify_footer_links() {
	  System.out.println("footer link test started");
	}
	@When("I click on any link")
	public void i_click_on_any_link() {
		footerTest();
	}

	@Then("it should it should navigate to that page")
	public void it_should_it_should_navigate_to_that_page() {
		System.out.println("footer links are working");
	}

	@Given("i as an user i want to verify barands are accessable or not")
	public void i_as_an_user_i_want_to_verify_barands_are_accessable_or_not() {
	  System.out.println("brands test started");
	}
	
	@When("I go to the home page")
	public void i_go_to_the_home_page() {
		brandsTest();
	}

	@Then("it should display the P&G family brands")
	public void it_should_display_the_p_g_family_brands() {
		System.out.println("brand logos are accessable to their sites");
		quit();
	}
}
