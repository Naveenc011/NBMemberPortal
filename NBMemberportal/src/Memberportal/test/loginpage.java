package Memberportal.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import AbsrtractComponennts.AbstractClass;

public class loginpage extends AbstractClass {

	WebDriver driver;

	public loginpage(WebDriver driver) {
		super(driver);
		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement loginbutton =
	// driver.findElement(By.className("button_button__lnj8q")).click();

	// page factory
	@FindBy(className = "button_button__lnj8q")
	WebElement signinbutton;

	@FindBy(id = "Username")
	WebElement Email;

	@FindBy(id = "Password")
	WebElement pwd;

	@FindBy(name = "button")
	WebElement loginbutton;

	public void memberportallogin(String email, String password) {
		signinbutton.click();
		Email.sendKeys(email);
		pwd.sendKeys(password);
		loginbutton.click();
	}

	public void goTo() {
		driver.get("https://mybenefitswork.com/");
	}

	By getusername = By.id("Username");

	public void getUserName() {
		waitForElementToAppear(getusername);
	}

	By getpwd = By.id("Password");

	public void getPassWord() {
		waitForElementToAppear(getpwd);
	}
	
	By getSubmitButton = By.name("button");
	
	public void getSubmit() {
		waitForElementToAppear(getSubmitButton);
	}
	

}
