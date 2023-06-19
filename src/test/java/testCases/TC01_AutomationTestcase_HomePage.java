package testCases;
import pageObjects.*;

import org.testng.Assert;
import org.testng.annotations.*;

public class TC01_AutomationTestcase_HomePage extends BaseClass {
	
	
	@Test(groups= {"Regression","Smoke"})
    public void test_accountRegistration() {
		logger.info("***Starting of test case TC01_ AutomationTestcase*** ");
		
		try {
		HomePage hp =new HomePage(driver);
		hp.clickRegister();
		logger.info("***clicked on Register link*** ");
		AccountRegistrationPage accountregage= new AccountRegistrationPage(driver);
		accountregage.setEmail(randomstring()+"@gmail.com");
		accountregage.setFirstName(randomstring());
		accountregage.setLastName(randomstring());
		accountregage.clickGender();
		
		String password=randomalhanumbric();
		accountregage.setPassword(password);
		accountregage.setConfirmPassword(password);
		accountregage.clickContinue();
		logger.info("***Registration successful*** ");
		String confmsg=accountregage.getMsgregistartionconfirmation();
		Assert.assertEquals(confmsg, "Your registration completed");
		accountregage.clickContinue();
		System.out.println(confmsg);
		driver.quit();
		logger.info("***Finishing of test case TC01_ AutomationTestcase*** ");
	}
		
		
	
	catch(Exception e){
		
		
		Assert.fail();
		
		
	}
	
   	

	}}

