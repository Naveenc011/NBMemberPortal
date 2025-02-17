package Memberportal.main;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;

import Memberportal.test.Benefits;
import Memberportal.test.DashBoardPage;
import Memberportal.test.HelpAndSupport;
import Memberportal.test.MyAccounts;
import Memberportal.test.MyProfilepage;
import Memberportal.test.Notifications;
import Memberportal.test.UserDependents;
import Memberportal.test.UserMembership;
import Memberportal.test.UserSecurity;
import Memberportal.test.UserSettings;
import Memberportal.test.logoutpage;
import Memberportal.test.testcomponents.BaseTest;
import Memberportal.test.testcomponents.RetryAnalyser;

public class Memberportalmainsplittest extends BaseTest {

	//@Test(groups = {"grp1"}, retryAnalyzer = RetryAnalyser.class)
	@Test
	public void MemberPortalregressionLoginTest() throws IOException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Loginpage.memberportallogin("naveenkumarc016@gmail.com", "Naveen11@");
		DashBoardPage dashBoardPage = new DashBoardPage(driver);
		dashBoardPage.getDashboardlogo();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void MemberPortalregressionProfileTest() throws IOException {
		// Create an instance of the Page Object
		MyProfilepage myProfilepage = new MyProfilepage(driver);
		myProfilepage.getDashboardlogo();
		myProfilepage.getuserbuttonprofile();
		myProfilepage.goTo();
		myProfilepage.getUsername();
		myProfilepage.isPersonalInfoButtonVisible();
		// Validate the visibility of the button
		Assert.assertTrue(myProfilepage.isPersonalInfoButtonVisible(), "Personal info is not visible!");

	}

	@Test
	public void MemberPortalregressionSecurityTest() throws IOException {
		// Security

		UserSecurity userSecurity = new UserSecurity(driver);
		userSecurity.goTo();
		userSecurity.getsecurity();
	}

	@Test
	public void MemberPortalregressionMembershipTest() throws IOException {
		// Create an instance of the Page Object
		UserMembership userMembership = new UserMembership(driver);
		userMembership.goTo();
		userMembership.isbookletButtonVisible();
		// Validate the visibility of the button
		Assert.assertTrue(userMembership.isbookletButtonVisible(), "Membershipkit is not visible");

	}

	@Test
	public void MemberPortalregressionDependentTest() throws IOException {
		// Dependents

		UserDependents userDependents = new UserDependents(driver);
		userDependents.goTo();
		userDependents.getDependentButton();

	}

	@Test
	public void MemberPortalregressionSettingsTest() throws IOException {
		// Settings

		UserSettings userSettings = new UserSettings(driver);
		userSettings.goTo();
		userSettings.issettingsButtonVisible();

	}

	@Test
	public void MemberPortalregressionAccountTest() throws IOException {
		// My Account

		MyAccounts myAccounts = new MyAccounts(driver);
		myAccounts.appuserbutton();
		myAccounts.navigateToAccountPage();
	}

	@Test
	public void MemberPortalregressionNotificationsTest() throws IOException {

		// Notification

		// Create an instance of the Page Object
		Notifications notifications = new Notifications(driver);
		notifications.buttonuserapp();
		notifications.goTo();
		notifications.isnotificationButtonVisible();
		// Validate the visibility of the button
		Assert.assertTrue(notifications.isnotificationButtonVisible(), "Notification section is not visible");

	}

	@Test
	public void MemberPortalregressionHelpandSupportTest() throws IOException {
		// help and support

		HelpAndSupport helpAndSupport = new HelpAndSupport(driver);
		helpAndSupport.clickAppUserButton();
		helpAndSupport.navigateToSupportPage();
		helpAndSupport.navigateToSupportlegalPage();
		helpAndSupport.navigateToSupportcontactusPage();
		helpAndSupport.navigateToSupportfeedbackPage();
		helpAndSupport.clickHeaderLogo();

	}

	@Test
	public void MemberPortalregressionBenefitsTest() throws IOException {
		// Benefits

		Benefits benefits = new Benefits(driver);
		benefits.verifyBenefitdetailsname();
		benefits.benefitsbutton();
		benefits.isbenefitdetailsButtonVisible();
		benefits.logobutton();
	}

	@Test
	public void MemberPortalregressionlogoutTest() throws IOException {

		// logout

		logoutpage Logoutpage = new logoutpage(driver);
		Logoutpage.clickprofileButton();
		Logoutpage.clicklogoutButton();

	}
}
