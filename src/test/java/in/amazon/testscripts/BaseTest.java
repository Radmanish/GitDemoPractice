package in.amazon.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	 WebDriver driver;
	 
	@BeforeTest
	public void LaunchApplication () throws IOException {
		
		File file = new File("resources//utils.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties ();
		pro.load(fis);
		
		
//		1) Open the browser
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver= new ChromeDriver();
//		2) Maximize it
		driver.manage().window().maximize();
//		3) Navigate to application
		driver.get(pro.getProperty("BASE_URL"));
	}
	
//	12) Close the browser
	@AfterTest
	public void close() {
		
		//driver.quit();
	}

}
