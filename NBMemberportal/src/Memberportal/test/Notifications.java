package Memberportal.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbsrtractComponennts.AbstractClass;

public class Notifications extends AbstractClass{

	WebDriver driver;

	public Notifications(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "app-user-button")
	WebElement usersbutton;
	
	@FindBy(className = "md:gap-3")
	WebElement notifibutton;
	
	By Getnotificationbuttonvisible = By.className("md:gap-3");
	
	public void buttonuserapp() {
		usersbutton.click();
	}
	
	public void goTo() {
		driver.get("https://mybenefitswork.com/en-US/notifications");
	}
	
	public boolean isnotificationButtonVisible() {
		return notifibutton.isDisplayed();
	}

	
}
