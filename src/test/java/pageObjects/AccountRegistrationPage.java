package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	// Elements
		@FindBy(name = "FirstName")
		WebElement txtFirstname;
		

		@FindBy(name = "LastName")
		WebElement txtLasttname;

		@FindBy(name = "Email")
		WebElement txtEmail;

		@FindBy(name = "Gender")
		WebElement rdoGender;

		@FindBy(name = "Password")
		WebElement txtPassword;

		@FindBy(name = "ConfirmPassword")
		WebElement txtConfirmPassword;


		@FindBy(xpath = "//*[@id='register-button' or @value='Continue']")
		WebElement btnContinue;
		
		@FindBy(xpath = "//*[contains(text(),'Your registration completed')]")
		WebElement msgregistartionconfirmation;
		
	
		
		


		public String getMsgregistartionconfirmation()
		{
			try {
			return (msgregistartionconfirmation.getText());
			} catch (Exception e) {
				
				return (e.getMessage());
			}
			
		}

		public void setFirstName(String fname) {
			txtFirstname.sendKeys(fname);

		}

		public void setLastName(String lname) {
			txtLasttname.sendKeys(lname);

		}

		public void setEmail(String email) {
			txtEmail.sendKeys(email);

		}

		public void clickGender() {
			rdoGender.click();;

		}

		public void setPassword(String pwd) {
			txtPassword.sendKeys(pwd);

		}

		public void setConfirmPassword(String pwd) {
			txtConfirmPassword.sendKeys(pwd);

		}

		

		public void clickContinue() {
			//sol1 
			btnContinue.click();
			
			

			}	
			
			
			//sol2 
			//btnContinue.submit();
			
			//sol3
			//Actions act=new Actions(driver);
			//act.moveToElement(btnContinue).click().perform();
						
			//sol4
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("arguments[0].click();", btnContinue);
			
			//Sol 5
			//btnContinue.sendKeys(Keys.RETURN);
			
			//Sol6  
			//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
			
		}

		
		

