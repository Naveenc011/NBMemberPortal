package Memberportal.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import AbsrtractComponennts.AbstractClass;

public class MyProfilepage extends AbstractClass {

	WebDriver driver;

	public MyProfilepage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@FindBy(id = "app-user-button")
	WebElement userbutton;

	@FindBy(className = "controls-header_headerText__OtSAm")
	WebElement Usernameisvisible;

	By GetUserbutton = By.id("app-user-button");
	By GetUsernameisvisible = By.className("controls-header_headerText__OtSAm");

	public void getDashboardlogo() {
		waitForElementToAppear(GetUserbutton);
	}

	public void getuserbuttonprofile() {
		userbutton.click();

	}

	public void goTo() {
		driver.get("https://mybenefitswork.com/en-US/profile");
	}

	public void getUsername() {
		waitForElementToAppear(GetUsernameisvisible);
	}

	public boolean isPersonalInfoButtonVisible() {
		return Usernameisvisible.isDisplayed();
	}

}
