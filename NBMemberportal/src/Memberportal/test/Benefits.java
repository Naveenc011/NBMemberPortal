package Memberportal.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import AbsrtractComponennts.AbstractClass;

public class Benefits extends AbstractClass {

	WebDriver driver;

	public Benefits(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='benefit-section_container__NSCXB']")
	private List <WebElement> benefitname;
	
	public void verifyBenefitdetailsname () {
		WebElement match = benefitname.stream()
				.filter(b -> b.findElement(By.xpath("//h3[normalize-space()='Vision']")).getText().equals("Vision"))
				.findFirst().orElse(null);
	

	}

	@FindBy(xpath = "//a[normalize-space()='Benefit Details']")
	WebElement benefitdetailsbutton;
	
	
	@FindBy(xpath = "//img[@alt='Header Logo']")
	WebElement logoheaderbutton;
	
	@FindBy(className = "benefit-detail_subBenefitParentTitle__VVfSg")
	WebElement benefitdetailssubmitbutton;
	
	
	public void benefitsbutton() {
		benefitdetailsbutton.click();
	}
	
	public void logobutton() {
		logoheaderbutton.click();
	}
	
	public boolean isbenefitdetailsButtonVisible() {
		return benefitdetailssubmitbutton.isDisplayed();
	}
	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	List<WebElement> benefit = driver.findElements(By.xpath("//div[@class='benefit-section_container__NSCXB']"));
//	WebElement benefitCTA = benefitname.stream()
//			.filter(b -> b.findElement(By.xpath("//h3[normalize-space()='Vision']")).getText().equals("Vision"))
//			.findFirst().orElse(null);

	// Click the CTA (if needed later in the code)
//	benefitCTA.findElement(By.xpath("//a[normalize-space()='Benefit Details']")).click();
//
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	WebElement benefittext = wait.until(ExpectedConditions
//			.visibilityOfElementLocated(By.className("benefit-detail_subBenefitParentTitle__VVfSg")));
//
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.findElement(By.xpath("//img[@alt='Header Logo']")).click();
}
