package testCases;
import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.Loginpage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import Utilities.DataProviders;

public class TC03_AutomationTestcase_LoginPage_DDT extends BaseClass {
	
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
    	
	public void test_accountLogin(String email, String password, String exp) {
		
		try {
		logger.info("***Starting of test case TC03_ AutomationTestcase*** ");
		
		HomePage hp =new HomePage(driver);
     Loginpage lp =new Loginpage(driver);
		System.out.println(driver.getTitle());
		hp.ClickLogin();
		lp.setTxtEmail(email);
	    lp.setTxtPassword(password);
	    lp.lnkLogin();
	    logger.info("***Finishing of test case TC03_ AutomationTestcase*** ");
	    //lp.lnkLogout();
	    Boolean logoutobj= lp.isMyAccountPageExists();
	    
	    if(exp.equals("Valid")) {
	    	
	    	if (logoutobj==true) {
	    		
	    		lp.lnkLogout();
	    		Assert.assertTrue(true);
	    	}
	    	
	    	else {
	    		
	    		Assert.assertTrue(false);
	    	}
	    	
		}
		 if(exp.equals("Invalid")) {
		    	
		    	if (logoutobj==false) {
		    		
		    		Assert.assertTrue(true);
		    	}
		    	
		    	else {
		    		
		    		Assert.assertTrue(false);
		    	}
		    	
		    	
		    }
		   
			}
			catch (Exception e) {
				
				Assert.fail();
			}
			
		
	}}