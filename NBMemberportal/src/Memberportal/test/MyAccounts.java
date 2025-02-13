package Memberportal.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbsrtractComponennts.AbstractClass;

public class MyAccounts extends AbstractClass {

	WebDriver driver;

	public MyAccounts(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "app-user-button")
	WebElement userbutton;

	public void appuserbutton() {
		userbutton.click();
	}

	// Method to navigate to the account page
	public void navigateToAccountPage() {
		try {
			driver.get("https://mybenefitswork.com/en-US/account");
			System.out.println("Navigated to My Account page successfully.");
		} catch (Exception e) {
			System.out.println("Failed to navigate to My Account page: " + e.getMessage());
		}

	}
}
