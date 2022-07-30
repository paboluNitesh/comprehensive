package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import reusablecomponents.ReusableHelper;


public class extentReport {
	ExtentReports report;
	ExtentSparkReporter spark;
	
	public ExtentReports ExtentReportD()  {
		
		report = new ExtentReports();
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		String timestamp = sdf.format(dt);
		spark = new ExtentSparkReporter(new File("./reports "+ReusableHelper.dateTime()+".html"));
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Tide Test");
		spark.config().setReportName("Nitesh");
		report.attachReporter(spark);
		return report;
	}
}
