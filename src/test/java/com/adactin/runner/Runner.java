package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.automation.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//featurefile", 
glue = "com.adactin.stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
tags = {"@smokeTest"},
plugin = {"html:Report/HTML_Report",
		"pretty",
		"json:Report/JSON_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtendReport.html"}

)


public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {

		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();

		driver = BaseClass.getBrowser(browser);
	}
	
	@AfterClass
	public static void tear_Down() {

		driver.close();
	}
	
}
