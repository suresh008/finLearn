package com.adobe.fin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class loginPOTest {

	@Test
	public void loginPOTest_001() throws Exception
	{
		WebDriver testDriver = new FirefoxDriver();
		testDriver.get("http://sj1010005176149:8080/lc/ws");
		testDriver.manage().window().maximize();
		testUtils.zoomOut(testDriver, 2);
		loginPO loginTest = new loginPO("rs1","password",testDriver);
		loginTest.testLogin();
	}
	
}
