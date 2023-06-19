package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Loginpage extends BasePage {

	public Loginpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "Email")
	WebElement txtEmail;
	
	@FindBy(name = "Password")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement lnkLogin;

	@FindBy(xpath = "//a[@href=\"/logout\"]")
	WebElement lnkLogout;
	

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void lnkLogin() {
		lnkLogin.click();
	}
	public void lnkLogout() {
		lnkLogout.click();
	}
	
	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (lnkLogout.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void clickLogout() {
		lnkLogout.click();

	}


}