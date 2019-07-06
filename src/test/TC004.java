package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;
import locators.Locators;

public class TC004 extends Config{

	Locators ATL = new Locators();
	
	
	@Test
	public void ATLogo(){
		
		WebElement ImageFile = driver.findElement(By.xpath(ATL.LogoImage));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
             System.out.println("Image not displayed.");
        }
        else
        {
            System.out.println("Image displayed.");
        }
		
		
	}
	
	
	
	
}
