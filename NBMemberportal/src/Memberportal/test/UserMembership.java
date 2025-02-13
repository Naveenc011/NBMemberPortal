package Memberportal.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import AbsrtractComponennts.AbstractClass;

public class UserMembership extends AbstractClass {
	WebDriver driver;

	public UserMembership(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goTo() {
		driver.get("https://mybenefitswork.com/en-US/profile/membership");
	}

	@FindBy(xpath = "//div[@aria-label='Download My Booklet'][1]")
	WebElement mybooklet;

	public boolean isbookletButtonVisible() {
		return mybooklet.isDisplayed();
	}

}
