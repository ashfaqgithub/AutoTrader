package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;
import locators.Locators;

public class TC005 extends Config{

	
	@Test
	public void LinkCount(){
		
		
		List <WebElement> LC = driver.findElements(By.tagName("a"));
		System.out.println(LC.size());
		for(int i = 0;i<LC.size();i++){
			System.out.println(LC.get(i).getText());
			
		}
		
		
		
	}
	
	
}
