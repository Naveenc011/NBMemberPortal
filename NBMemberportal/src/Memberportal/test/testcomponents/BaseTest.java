package Memberportal.test.testcomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import Memberportal.test.loginpage;

public class BaseTest {
	
	public WebDriver driver;
	public loginpage Loginpage;

	public WebDriver initializedriver() throws IOException {

		//Properties class
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+
				"\\src\\Memberportal\\resources\\GlobalData.properties");
		prop.load(fis);
		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.Chrome.driver",
					"C:\\Users\\prade\\IdeaProjects\\NB_MemberPortal\\driver\\chromedriver.exe");
			// Set up ChromeDriver using WebDriverManager

			// Initialize ChromeDriver
			 driver = new ChromeDriver();

			
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			
			//Firefox
		}
		
		else if(BrowserName.equalsIgnoreCase("edge")) {
			
			//Edge
			System.setProperty("webdriver.edge.driver", "edge.exe");
			 driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
		
		
	}
	
	public  List <HashMap <String, String>> getJsonData(String filepath) throws IOException
	{
		
		//read json to string
		String Jsoncontent = FileUtils.readFileToString(new File (filepath));
	
	//String to HashMap - Jackson dattabind
		ObjectMapper mapper = new ObjectMapper();
		
		List <HashMap <String, String>> data = mapper.readValue(Jsoncontent, new TypeReference <List<HashMap<String , String>>>(){
});
		
		return data;

		}
	
	public String getScreenShot(String testCasename, WebDriver driver ) throws IOException
	{
		   // Ensure driver is not null
	    if (driver == null) {
	        throw new IllegalArgumentException("WebDriver instance is null. Initialize it before taking a screenshot.");
	    }

	    // Take a screenshot
	    TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File source = screenshot.getScreenshotAs(OutputType.FILE);

	    // Define the destination file path
	    String filePath = System.getProperty("user.dir") + "//reports//" + testCasename + ".png";
	    File destination = new File(filePath);

	    // Copy the screenshot to the destination
	    FileUtils.copyFile(source, destination);

	    return filePath;
		
		
		
		
//		TakesScreenshot SS = (TakesScreenshot)driver;
//		File source = SS.getScreenshotAs(OutputType.FILE);
//		File file = new File (System.getProperty("user.dir")+ "//reports" + testCasename + ".png");
//		FileUtils.copyDirectory(source, file);
//		return (System.getProperty("user.dir")+ "//reports" + testCasename + ".png");
	}
	
	@BeforeMethod (alwaysRun = true)
	public loginpage launchapplication() throws IOException
	{
		driver = initializedriver();
		Loginpage = new loginpage(driver);
		Loginpage.goTo();
		return Loginpage;
	}
	
	@AfterMethod (alwaysRun = true)
	public void finishTest()
	{
		driver.close();
	}
}
