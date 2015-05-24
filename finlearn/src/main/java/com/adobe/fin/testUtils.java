package com.adobe.fin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testUtils {
	public static void zoomOut(WebDriver testDriver, int count) throws Exception {
		WebDriverWait wait = new WebDriverWait(testDriver,120);
		wait.until(ExpectedConditions.elementToBeClickable(By.tagName("html")));
		for(;count>0;count--)
		{
			testDriver.findElement(By.tagName("html")).sendKeys(
					Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		}
	}
}
