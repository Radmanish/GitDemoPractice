package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplePhones {
	
	@FindBy(xpath ="(//div[contains(@class,'a-section aok-relative s-image-square-aspect')])[1]")
	private WebElement firstPhone;
	
	public ApplePhones(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickFirstPhones() {
		
		firstPhone.click();
	}

}
