package Memberportal.main;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Memberportal.test.DashBoardPage;
import Memberportal.test.HelpAndSupport;
import Memberportal.test.MyAccounts;
import Memberportal.test.MyProfilepage;
import Memberportal.test.Notifications;
import Memberportal.test.logoutpage;
import Memberportal.test.testcomponents.BaseTest;

public class MemberportalSmokeTest extends BaseTest {

	@Test (dataProvider = "getdata" , groups= "smokerun")
	public void Memberportalsmoketest(HashMap <String, String> input) {
		// TODO Auto-generated method stub

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Loginpage.memberportallogin( input.get("email"), input.get("password"));
		DashBoardPage dashBoardPage = new DashBoardPage(driver);
		dashBoardPage.getDashboardlogo();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//dashBoardPage.VerifyDashboardIsVisible();

		//Assert.assertTrue(dashBoardPage.VerifyDashboardIsVisible(), "Dashboard is not visible!");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.className("button_button__lnj8q")).click();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait for a specific element to be visible on the page
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Username")));
//		element.sendKeys("naveenkumarc016@gmail.com");
//
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//		// Wait for a specific element to be visible on the page
//		WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
//		element1.sendKeys("Naveen11@");
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.name("button")).click();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement element2 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt = 'Header Logo']")));

//		WebElement button = driver.findElement(By.xpath("//img[@alt = 'Header Logo']"));
//		Assert.assertTrue(button.isDisplayed(), "Dashboard is not visible!");

		// Create an instance of the Page Object
		MyProfilepage myProfilepage = new MyProfilepage(driver);
		myProfilepage.getDashboardlogo();
		myProfilepage.getuserbuttonprofile();
		myProfilepage.goTo();
		myProfilepage.getUsername();
		myProfilepage.isPersonalInfoButtonVisible();

		// Validate the visibility of the button
		Assert.assertTrue(myProfilepage.isPersonalInfoButtonVisible(), "Personal info is not visible!");

		// MyProfile
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("app-user-button")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://mybenefitswork.com/en-US/profile");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement element3 = wait.until(
//				ExpectedConditions.visibilityOfElementLocated(By.className("controls-header_headerText__OtSAm")));

//		WebElement button1 = driver.findElement(By.className("controls-header_headerText__OtSAm"));
//		Assert.assertTrue(button1.isDisplayed(), "Persional info is not visible!");

		

		// Security
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://mybenefitswork.com/en-US/profile/security");
//		// driver.findElement(By.xpath("//span[@class='profile-sidebar_linkActive__IflTQ
//		// profile-sidebar_sidebarLink__zqgzY']")).click();
//
//		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement element4 = wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("(//div[@class='undefined flex flex-col'])[1]")));

		// Membership
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://mybenefitswork.com/en-US/profile/membership");
//
//		WebElement image = driver.findElement(By.xpath("//div[@aria-label='Download My Booklet'][1]"));
//		Assert.assertTrue(image.isDisplayed(), "Membershipkit is not visible");

		// Create an instance of the Page Object
		

		// Dependents
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://mybenefitswork.com/en-US/profile/dependents");
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement depimage = wait
//				.until(ExpectedConditions.visibilityOfElementLocated((By.className("button_button__lnj8q"))));

		
//		// Settings
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://mybenefitswork.com/en-US/profile/settings");
//		WebElement setimg = driver.findElement(By.xpath("//h2[normalize-space()='Notification Alert']"));
//		Assert.assertTrue(setimg.isDisplayed(), "Settings is not visible");

		

		// My Account
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("app-user-button")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		try {
//			driver.get("https://mybenefitswork.com/en-US/account");
//		} catch (Exception Myaccountisnotvisible) {
//			System.out.println("My account is notvisible");
//		}

		MyAccounts myAccounts = new MyAccounts(driver);

		myAccounts.appuserbutton();
		myAccounts.navigateToAccountPage();
//		// Notification
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("app-user-button")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://mybenefitswork.com/en-US/notifications");
//
//		WebElement notimage = driver.findElement(By.className("md:gap-3"));
//		Assert.assertTrue(notimage.isDisplayed(), "Notification section is not visible");

		// Create an instance of the Page Object
		Notifications notifications = new Notifications(driver);
		notifications.buttonuserapp();
		notifications.goTo();
		notifications.isnotificationButtonVisible();

		// Validate the visibility of the button
		Assert.assertTrue(notifications.isnotificationButtonVisible(), "Notification section is not visible");

		// help and support
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("app-user-button")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://mybenefitswork.com/en-US/support");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://mybenefitswork.com/en-US/support/legal");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://mybenefitswork.com/en-US/support/contact-us");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://mybenefitswork.com/en-US/support/feedback");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//img[@alt='Header Logo']")).click();

		HelpAndSupport helpAndSupport = new HelpAndSupport(driver);
		helpAndSupport.clickAppUserButton();
		helpAndSupport.navigateToSupportPage();
		helpAndSupport.navigateToSupportlegalPage();
		helpAndSupport.navigateToSupportcontactusPage();
		helpAndSupport.navigateToSupportfeedbackPage();
		helpAndSupport.clickHeaderLogo();

		// Benefits
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		List<WebElement> benefit = driver.findElements(By.xpath("//div[@class='benefit-section_container__NSCXB']"));
//		WebElement benefitCTA = benefit.stream()
//				.filter(b -> b.findElement(By.xpath("//h3[normalize-space()='Vision']")).getText().equals("Vision"))
//				.findFirst().orElse(null);
//
//		// Click the CTA (if needed later in the code)
//		benefitCTA.findElement(By.xpath("//a[normalize-space()='Benefit Details']")).click();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement benefittext = wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.className("benefit-detail_subBenefitParentTitle__VVfSg")));
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("//img[@alt='Header Logo']")).click();
		
		
		
		// logout
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("app-user-button")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();

		logoutpage Logoutpage = new logoutpage(driver);

		Logoutpage.clickprofileButton();
		Logoutpage.clicklogoutButton();
	}

	
	
	
	
	@DataProvider
	public Object[][] getdata() throws IOException
	{
//		HashMap <String, String> map = new HashMap <>();
//		map.put("email", "elevianttester@mailinator.com");
//		map.put("password", "Test@123");
//		
//		
//		HashMap <String, String> map1 = new HashMap <>();
//		map1.put("email", "paul.a.dion@gmail.com");
//		map1.put("password", "Reset@123");
		
		List <HashMap <String, String>> data = getJsonData(System.getProperty("user.dir") + "\\src\\MemberPortalData\\Memberportaldata.json");
		return new Object [][]  {{data.get(0)}, {data.get(1)}};
	}
	
}
