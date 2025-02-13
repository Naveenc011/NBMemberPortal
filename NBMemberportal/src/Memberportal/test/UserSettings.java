package Memberportal.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import AbsrtractComponennts.AbstractClass;

public class UserSettings extends AbstractClass {

	WebDriver driver;

	public UserSettings(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goTo() {
		driver.get("https://mybenefitswork.com/en-US/profile/settings");
	}

	@FindBy(xpath = "//h2[normalize-space()='Notification Alert']")
	WebElement setting;

	By UserSettingsButton = By.xpath("//h2[normalize-space()='Notification Alert']");

	public boolean issettingsButtonVisible() {
		return setting.isDisplayed();
	}

}
