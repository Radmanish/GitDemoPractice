package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageClass {
	Actions actions;

	public LandingPageClass(WebDriver driver) {

		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	@FindBy(linkText = "Mobiles")
	private WebElement mobiles;

	public void clickMobiles() {

		mobiles.click();
	}

	@FindBy(id = "nav-link-accountList")

	private WebElement helloSignInMenue;

	public void hoverOverHelloSignInMEnue() {

		actions.moveToElement(helloSignInMenue).build().perform();
	}

	@FindBy(xpath = "(//span[contains(@class,'nav-action-inner')])[1]")
	private WebElement signInBTN;

	public void clickSignInBTN() {

		signInBTN.click();

	}

}
