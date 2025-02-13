package Memberportal.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import AbsrtractComponennts.AbstractClass;

public class DashBoardPage extends AbstractClass {
	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// WebElement dashboard = driver.findElement(By.name("button")).click();

//	@FindBy(name = "button")
//	WebElement dashboard;

	By getLogo = By.xpath("//img[@alt = 'Header Logo']");

	public void getDashboardlogo() {
		waitForElementToAppear(getLogo);
	}

//	public void VerifyDashboardIsVisible() {
//		WebElement button = driver.findElement(By.xpath("//img[@alt = 'He ader Logo']"));
//		Assert.assertTrue(button.isDisplayed(), "Dashboard is not visible!");
//	}

//	public boolean VerifyDashboardIsVisible() {
//		return dashboard.isDisplayed();
//	}

}
