package Memberportal.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbsrtractComponennts.AbstractClass;

public class logoutpage extends AbstractClass {
	WebDriver driver;

	public logoutpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void clickprofileButton() {
		driver.findElement(By.id("app-user-button")).click();
	}

	public void clicklogoutButton() {
		driver.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();
	}

}
