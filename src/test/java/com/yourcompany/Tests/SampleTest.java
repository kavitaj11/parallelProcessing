package com.yourcompany.Tests;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.yourcompany.Pages.LoginPage;

public class SampleTest extends TestBase{
	
	
	@Test(dataProvider = "hardCodedBrowsers")
	public void Sample(String browser, String version, String os, Method method) throws UnexpectedException, MalformedURLException, InterruptedException{
		
		//create webdriver session
        this.createDriver(browser, version, os, method.getName());
        WebDriver driver = this.getWebDriver();

        driver.get("https://app-grasshopper.stage.cloudwords.com");
        
        this.annotate("Visiting Login page...");
        
        
        LoginPage login = new LoginPage();
        
        login.enetrUserName("custom14_pm@gmail.com");
        Thread.sleep(1000);
        login.enterPassWord("password1");
        login.clickLoginBtn();
        Thread.sleep(15000);
		
	}
	
}