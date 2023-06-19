package testCases;
import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.Loginpage;

import org.testng.Assert;
import org.testng.annotations.*;



public class TC02_AutomationTestcase_LoginPage extends BaseClass {
	
	
	@Test(groups= {"Regression"})
    	
	public void test_accountLogin() {
		
		try {
		logger.info("***Starting of test case TC02_ AutomationTestcase*** ");
		
		HomePage hp =new HomePage(driver);
     Loginpage lp =new Loginpage(driver);
		System.out.println(driver.getTitle());
		hp.ClickLogin();
		lp.setTxtEmail(rb.getString("email"));
	    lp.setTxtPassword(rb.getString("password"));
	    lp.lnkLogin();
	    logger.info("***Finishing of test case TC02_ AutomationTestcase*** ");
	    lp.lnkLogout();
		}
		catch (Exception e) {
			
			Assert.fail();
		}
	}}