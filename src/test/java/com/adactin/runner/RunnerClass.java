package com.adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.properties.FileReaderManager;

import BaseClass.Base;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//feature",glue = "com.adactin.stepdef",monochrome= true,strict=true,tags=("@smoke,@Sanity,@Regression,@unit"),plugin= {"html:Reports/HtmlReport","pretty","json:Reports/JsonReport.json","com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"})
public class RunnerClass {
	
	public static WebDriver driver;
	
@BeforeClass
public static void BrowserLaunch() throws Throwable {
	// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
//driver=new ChromeDriver();
//driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String browser = FileReaderManager.getinstance().getinstanceCR().getBrowser();
	driver=Base.Browserlaunch(browser);
}

@AfterClass
public static void BrowserClose() {
	// TODO Auto-generated method stub
driver.close();
}
}
