package StepDefinitions;



import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage addcust;
	public SearchCustomerPage searchcust;
	public static Logger logger;
	public Properties configProp;
	
	public static String randomstring() {
		
		String generatedstr1=RandomStringUtils.randomAlphabetic(5);
		return(generatedstr1);
	}

}
