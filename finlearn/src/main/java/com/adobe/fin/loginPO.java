package com.adobe.fin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPO {
	
	private String userID, password; 
	private WebDriver testDriver;
	private WebDriverWait wait;
	
	public loginPO(String userID, String password, WebDriver testDriver)
	{
		this.userID = userID;
		this.password = password;
		this.testDriver =  testDriver;
		wait = new WebDriverWait(this.testDriver,120);
		
	}
	
	public loginPO setUserName()
    {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginForm:j_username")));
		testDriver.findElement(By.id("loginForm:j_username")).sendKeys(userID);
        return this;
    }

    public loginPO setPassword()
    {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginForm:j_password")));
        testDriver.findElement(By.id("loginForm:j_password")).sendKeys(password);
        return this;
    }
    
    public statusPO clickLogin()
    {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginForm:submitButton")));
    	testDriver.findElement(By.id("loginForm:submitButton")).click();
    	return new statusPO();
    }
    
    public statusPO testLogin()
    {
    	return(setUserName().setPassword().clickLogin());
    }
}
