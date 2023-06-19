package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	//@FindBy(xpath = "//span[text()='My Account']")
	//WebElement lnkMyaccount;

	@FindBy(xpath = "//a[@href=\"/register\"]")
	WebElement lnkRegister;
	@FindBy(xpath = "//a[@href=\"/login\"]")
	WebElement ClickLogin;

	// Action Methods
	/*public void clickMyAccount() {
		lnkMyaccount.click();
	}*/

	public void clickRegister() {
		lnkRegister.click();
	}
	public void ClickLogin() {
		ClickLogin.click();
	}
	
}