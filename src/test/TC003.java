package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Config;
import locators.Locators;
import values.Values;

public class TC003 extends Config {

	Locators ATL = new Locators();
	Values ATV = new Values();
	
	@Test
	public void CarSearch() throws InterruptedException{
		WebElement SelectMake = driver.findElement(By.id(ATL.CarMake));
		Select make = new Select(SelectMake);
		make.selectByVisibleText("Lexus");
		
		Thread.sleep(7000);
		
		WebElement SelectModel = driver.findElement(By.id(ATL.CarModel));
		Select model = new Select(SelectModel);
		model.selectByVisibleText("- ES 350");;
		
		typeById(ATL.SearchZipCode, ATV.SearchZipCode);
		
		clickByXpath(ATL.SearchButton);
		
		
			
	}
	
	
	
	
	
	
	
}
