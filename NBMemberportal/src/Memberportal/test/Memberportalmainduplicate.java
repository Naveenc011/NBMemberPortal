package Memberportal.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Memberportalmainduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\prade\\IdeaProjects\\NB_MemberPortal\\driver\\chromedriver.exe");
		// Set up ChromeDriver using WebDriverManager

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		loginpage Loginpage = new loginpage(driver);
		Loginpage.goTo();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Loginpage.memberportallogin("naveenkumarc016@gmail.com", "Naveen11@");
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

		UserSecurity userSecurity = new UserSecurity(driver);
		userSecurity.goTo();
		userSecurity.getsecurity();

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
		UserMembership userMembership = new UserMembership(driver);

		userMembership.goTo();
		userMembership.isbookletButtonVisible();
		// Validate the visibility of the button
		Assert.assertTrue(userMembership.isbookletButtonVisible(), "Membershipkit is not visible");

		// Dependents
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://mybenefitswork.com/en-US/profile/dependents");
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement depimage = wait
//				.until(ExpectedConditions.visibilityOfElementLocated((By.className("button_button__lnj8q"))));

		UserDependents userDependents = new UserDependents(driver);

		userDependents.goTo();
		userDependents.getDependentButton();
//		// Settings
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://mybenefitswork.com/en-US/profile/settings");
//		WebElement setimg = driver.findElement(By.xpath("//h2[normalize-space()='Notification Alert']"));
//		Assert.assertTrue(setimg.isDisplayed(), "Settings is not visible");

		UserSettings userSettings = new UserSettings(driver);
		userSettings.goTo();
		userSettings.issettingsButtonVisible();

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
		
		Benefits benefits = new Benefits(driver);
		benefits.verifyBenefitdetailsname();
		benefits.benefitsbutton();
		benefits.isbenefitdetailsButtonVisible();
		benefits.logobutton();
		
		// logout
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("app-user-button")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();

		logoutpage Logoutpage = new logoutpage(driver);

		Logoutpage.clickprofileButton();
		Logoutpage.clicklogoutButton();
	}

}
