package in.amazon.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPageClass;

public class BuyMobilePhoneTest extends BaseTest{
	
	

	@Test
	public void buyMobile() {
//		4) Click on 'Mobiles'
		LandingPageClass landingPage = new LandingPageClass(driver);
		
		landingPage.clickMobiles();
//		5) Hover the pointer over 'Mobiles & Accessories'	
		AllMobileBrands allMobileBrands =new AllMobileBrands(driver);
		allMobileBrands.hoverOverMobileAndAccessories();
//		6) Click on 'Apple' in the sub-menu
		allMobileBrands.clickApple();
		ApplePhones apple = new ApplePhones(driver);
//		7) Click on the first available phone
	     apple.clickFirstPhones();
//	 	8) Shift focus on the new tab
	     
	     ArrayList<String>tabs = new ArrayList<>(driver.getWindowHandles());
	    	 
	    	 String windowHandleOfTab = tabs.get(1);
	     driver.switchTo().window(windowHandleOfTab);
	     
//	 	9) Click on 'Buy New' radio button
	     //skip for now
//	 	10) Click on 'Buy Now' button
	     
	     BuyPhone phone = new BuyPhone(driver);
	     
	     phone.clickBuyBTN();
//	 	11) Verify user is on the Sign in page
	     String expectedTitle = "Amazon Sign In";
	     String actualTitle = driver.getTitle();
	     Assert.assertEquals(actualTitle, expectedTitle); 

	}

//	12) Close the browser
	//@AfterTest
	//public void close() {
		
	//	driver.close();
	//}

}
