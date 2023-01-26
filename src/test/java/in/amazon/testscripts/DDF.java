package in.amazon.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.amazon.pages.LandingPageClass;
import in.amazon.pages.SignIn;
import utils.ReadExcel;

public class DDF extends BaseTest {
	@Test
	public void verifyErrMsgOnInvalidUsername() throws IOException {
		//	4) Hover over 'Hello Sign in' menu
		LandingPageClass landingPage = new LandingPageClass(driver);
		landingPage.hoverOverHelloSignInMEnue();
		
		//	5) Click on Sign in button in the sub-menu
		landingPage.clickSignInBTN();
		
		//	6) Enter an invalid username
		SignIn signIn = new SignIn(driver);
		
		String[][] data = ReadExcel.getData("resources//TestData.xlsx", "Sheet1");
		
		for (int i=1; i<6; i++) {
			String username = data[i][1];
			
			signIn.enterUsername(username);
			
			//	7) Click Continue button
			signIn.clickContinueBtn();
			
			//	8) Verify the error message - 'We cannot find an account with that email address' is displayed.
			String expectedErrMsg = "We cannot find an account with that email address";
			String actualErrMsg = signIn.getErrMsg();
			Assert.assertEquals(actualErrMsg, expectedErrMsg);
		}
	}


}
