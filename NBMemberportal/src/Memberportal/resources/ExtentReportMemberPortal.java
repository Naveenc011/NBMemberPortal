package Memberportal.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportMemberPortal {

	public static ExtentReports getReportObject()
	{
		String path = System.getProperty("user.dir") +  "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation result");
		reporter.config().setDocumentTitle("Test Results");
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Naveen Kumar");
		extent.createTest(path);
		return extent;
	}
}
