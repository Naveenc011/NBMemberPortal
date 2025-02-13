package Memberportal.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbsrtractComponennts.AbstractClass;

public class HelpAndSupport extends AbstractClass {

	WebDriver driver;

	public HelpAndSupport(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Default timeout
	}

	// Clicks the app user button
	public void clickAppUserButton() {
		driver.findElement(By.id("app-user-button")).click();
	}

	// Navigates to a specific support URL
	public void navigateToSupportPage() {
		driver.get("https://mybenefitswork.com/en-US/support");
	}

	public void navigateToSupportlegalPage() {
		driver.get(("https://mybenefitswork.com/en-US/support/legal"));
	}

	public void navigateToSupportcontactusPage() {
		driver.get("https://mybenefitswork.com/en-US/support/contact-us");
	}

	public void navigateToSupportfeedbackPage() {
		driver.get("https://mybenefitswork.com/en-US/support/feedback");
	}

	// Clicks the header logo
	public void clickHeaderLogo() {
		driver.findElement(By.xpath("//img[@alt='Header Logo']")).click();
	}

}
