package com.TestRunner;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith should be used in junit
//@RunWith(Cucumber.class)

@CucumberOptions
(
	
features = "C:\\Users\\Hp\\git\\WorkShop_CucumberProject\\WorkShop_CucumberProject\\src\\test\\resources\\Features\\TestCases_Config.feature",
glue = {"com.StepDefinition"},	        
plugin = {"pretty", "html:src/test/resources/Reports/cucumber-html-report","json:src/test/resources/Reports/cucumber-html-report/jsonreport",
"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/Reports/ExtentReport.html"
		},

    
		       
		     monochrome = true
		        
)


public class testrunner extends AbstractTestNGCucumberTests {
	
	@AfterClass
    public static void extendReport()
  {
		
		 Reporter.loadXMLConfig("C:\\Users\\Hp\\eclipse-workspace\\WorkShop_CucumberProject\\extend-config.xml");
		 Reporter.setSystemInfo("user", System.getProperty("user.name"));
		 Reporter.setSystemInfo("Application Name", "Test App ");
		 Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		 Reporter.setSystemInfo("Environment", "Production");
		 Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
		
  }

}
