package Memberportal.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import AbsrtractComponennts.AbstractClass;

public class UserDependents extends AbstractClass{

	WebDriver driver;

	public UserDependents(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void goTo() {
		driver.get("https://mybenefitswork.com/en-US/profile/dependents");
	}

	
	@FindBy(className = "button_button__lnj8q")
	WebElement depbutton;

	By GetDependentButton = By.className("button_button__lnj8q");
	
	public void getDependentButton() {
		waitForElementToAppear(GetDependentButton);
	}

	
}
