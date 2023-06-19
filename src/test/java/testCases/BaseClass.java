package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.TakesScreenshot;

public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
    public ResourceBundle rb;	

@BeforeClass (groups= {"Regression","Smoke"})
@Parameters("browser")
public void setup(String br) {
	rb= ResourceBundle.getBundle("config");
	logger=LogManager.getLogger(this.getClass());
	//WebDriverManager.edgedriver().setup();
	if(br.equals("edge"))
		driver= new EdgeDriver();
	
	else if (br.equals("Chrome"))
	
		driver= new ChromeDriver();
	
	else
		driver= new SafariDriver();
	//WebDriverManager.edgedriver().setup();
	//driver= new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	//driver.get("https://vam.udemy.com/");
	driver.get(rb.getString("appURL"));
}

 public String randomstring() {
	 
	 String randomstr= RandomStringUtils.randomAlphabetic(5);
			 return(randomstr);}
			 
			 public String randomalhanumbric() {
				 
				 String randomstrw= RandomStringUtils.randomAlphabetic(5);
				 String randomalrw= RandomStringUtils.randomAlphanumeric(5)	; 
				 
				 return(randomstrw+randomalrw);
			 }
			 public String captureScreen(String tname) throws IOException {

					String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
					File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					String destination = System.getProperty("user.dir") + "\\Screenshot\\" + tname + "_" + timeStamp + ".png";

					try {
						FileHandler.copy(source, new File(destination));
					} catch (Exception e) {
						e.getMessage();
					}
					return destination;

				}


 @AfterClass (groups= {"Regression","Smoke"})
 void teardown() {


}

}


