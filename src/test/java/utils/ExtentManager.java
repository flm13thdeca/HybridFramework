package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BaseTest;

public class ExtentManager extends BaseTest {
	
	
	public static ExtentReports getReports()
	{
		
		String reportsFolderPath=System.getProperty("user.dir")+"\\reports";
		
		if(reports==null)
		{
			reports=new ExtentReports();
			
			File reportsFolder=new File(reportsFolderPath);
			
			reportsFolder.mkdir();
			
			Date d=new Date();
			System.out.println(d);
			
			String pattern = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

			String date = simpleDateFormat.format(d);
			System.out.println(date);
			
			date=date.replace(":", "-");
			
			System.out.println(date);
			
			File reportsFile=new File(reportsFolderPath+"\\"+date+".html");
			
			ExtentSparkReporter reporter=new ExtentSparkReporter(reportsFile);
			
			reporter.config().setDocumentTitle("Adactin QA Regression Results");
			
			reporter.config().setReportName("Regression Reports");
			
			reporter.config().setTheme(Theme.DARK);
			
			reports.attachReporter(reporter);
			
		}
		
		return reports;
		
	}

}
