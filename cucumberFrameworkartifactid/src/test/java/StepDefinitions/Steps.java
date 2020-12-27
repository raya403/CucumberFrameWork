package StepDefinitions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class Steps extends BaseClass {
	
	//public WebDriver driver;
	//public LoginPage lp;
	
	@Before
	public void  setup() throws IOException {
		
		//reading properties
		configProp=new Properties();
		FileInputStream configfis=new FileInputStream("config.properties");
		configProp.load(configfis);
		
		logger = Logger.getLogger("cucumberFramework"); //added logger..
		PropertyConfigurator.configure("log4j.properties");
		
		String br=configProp.getProperty("browser");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
		driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
			driver=new FirefoxDriver();
					}
		else if(br.equals("ie")){
			
			System.setProperty("webdriver.ie.driver", configProp.getProperty("iepath"));
			driver=new InternetExplorerDriver();
		}
		logger.info("*********Launchig Browser**************");
		}
		
		
	@Given("^user launch chrome browser$")
	public void user_launch_chrome_browser() {

	lp=new LoginPage(driver);
	}

	@When("^user opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String URL)  {

		driver.get(URL);
		logger.info("*******Launching URL****************");
		driver.manage().window().maximize();
	}

	@When("^user enters Email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_password_as(String email, String password)  {

		lp.setUserName(email);
		lp.setPassword(password);
		
		logger.info("*******entering username and password****************");
	}
	@When("^Click on Login$")
	public void click_on_Login() throws InterruptedException  {
		lp.clickLogin();
		logger.info("*******clicking on login button	****************");
		Thread.sleep(3000);
	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String title) throws InterruptedException  {
	  
		if(driver.getPageSource().contains("Login was unsuccessful. ")) {
			driver.quit();
			Thread.sleep(5000);
			Assert.assertTrue(false);
			
		}
			else {
					Assert.assertEquals(title, driver.getTitle());
			}
		Thread.sleep(3000);
			
		}
	

	@When("^user clicks on Logout Link$")
	public void user_clicks_on_Logout_Link() throws InterruptedException  {

		lp.ClickLogout();
		Thread.sleep(4000);
	}



		@Then("^Close Browser$")
	public void close_Browser()  {
	  driver.quit();
		}
	  
	  //Customer creation step definition..........................................................
	  
		@Then("^User can view the Dashboard$")
		public void user_can_view_the_Dashboard()  {
		   
			addcust=new AddCustomerPage(driver);
		//	logger.info("********* Verifying Dashboad page title after login successful **************");
			Assert.assertEquals("Dashboard / nopCommerce administration",addcust.getPageTitle());
		}
	     	  

	  @When("^user click on customer menu$")
	  public void user_click_on_customer_menu() throws InterruptedException  {
	      Thread.sleep(3000);
			//logger.info("********* Clicking on customer main menu **************");
			addcust.clickOnCustomersMenu();
	      
	  }

	  @When("^click on customer menu item$")
	  public void click_on_customer_menu_item() throws InterruptedException  {
		  Thread.sleep(2000);
			//logger.info("********* Clicking on customer sub menu **************");
			addcust.clickOnCustomersMenuItem();
	  }

	  @When("^click on add new button$")
	  public void click_on_add_new_button() throws InterruptedException{
	     
		  addcust.clickOnAddnew();
		  Thread.sleep(2000);
		  
	  }

	  @Then("^user can view add new customer page$")
	  public void user_can_view_add_new_customer_page()  {
		  
		  Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.getPageTitle());
	  
	  }

	  @When("^user enters customer info$")
	  public void user_enters_customer_info() throws InterruptedException  {
	  
		  String email = randomstring() + "@gmail.com";
			addcust.setEmail(email);
			addcust.setPassword("test123");
			// Registered - default
			// The customer cannot be in both 'Guests' and 'Registered' customer roles
			// Add the customer to 'Guests' or 'Registered' customer role
			addcust.setCustomerRoles("Guest");
			Thread.sleep(3000);

			addcust.setManagerOfVendor("Vendor 2");
			addcust.setGender("Male");
			addcust.setFirstName("Pavan");
			addcust.setLastName("Kumar");
			addcust.setDob("7/05/1985"); // Format: D/MM/YYY
			addcust.setCompanyName("busyQA");
			addcust.setAdminContent("This is for testing.........");
	  }

	  @When("^click on save button$")
	  public void click_on_save_button() throws InterruptedException {
	     
		//  logger.info("********* Saving customer details **************");   
			addcust.clickOnSave();
			   Thread.sleep(2000);
	  }

	  @Then("^user can view confirmation message \"([^\"]*)\"$")
	  public void user_can_view_confirmation_message(String arg1)  {
		  Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
	  }

// Steps for Seaching through Email..................
	  
	  @When("^Enter customer Email$")
	  public void enter_customer_Email() {
		  searchcust=new SearchCustomerPage(driver);
			//logger.info("********* Searching customer details by Email **************");
			searchcust.setEmail("victoria_victoria@nopCommerce.com");
	  }

	  @When("^Click on search button$")
	  public void click_on_search_button() throws InterruptedException  {
		  searchcust.clickSearch();
			Thread.sleep(3000);
	  }

	  @Then("^User should find Email in the Search table$")
	  public void user_should_find_Email_in_the_Search_table()  {
		  boolean status=searchcust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
			Assert.assertEquals(true, status);

		
			
		}
}

