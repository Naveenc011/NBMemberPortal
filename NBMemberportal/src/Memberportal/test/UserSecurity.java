package Memberportal.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbsrtractComponennts.AbstractClass;

public class UserSecurity extends AbstractClass {

	WebDriver driver;

	public UserSecurity(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goTo() {
		driver.get("https://mybenefitswork.com/en-US/profile/security");
	}

	@FindBy(xpath = "(//div[@class='undefined flex flex-col'])[1]")
	WebElement userbutton;

	By securitybutton = By.xpath("(//div[@class='undefined flex flex-col'])[1]");

	public void getsecurity() {
		waitForElementToAppear(securitybutton);
	}

}
