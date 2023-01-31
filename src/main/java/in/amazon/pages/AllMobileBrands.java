package in.amazon.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllMobileBrands {
	//ggggg
		Actions action;
		int x;
	
		 @FindBy(linkText = "Mobiles & Accessories")
			private WebElement mobilesAndAccesories;
		 public AllMobileBrands(WebDriver driver) {
				PageFactory.initElements(driver, this);
				action = new Actions (driver);
				 }
		 public void hoverOverMobileAndAccessories () { 
			
				action.moveToElement(mobilesAndAccesories).build().perform();
				}
		 
		 
			@FindBy (linkText ="Apple")
			private  WebElement apple;
	
	public void clickApple() {
		apple.click();
		
	}

}
