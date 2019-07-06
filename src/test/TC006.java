package test;

import org.testng.annotations.Test;

import base.Config;
import locators.Locators;

public class TC006 extends Config{

	@Test
	public void VerifyTitle(){
		System.out.println(driver.getTitle());
		String Title = driver.getTitle();
		if(Title.equalsIgnoreCase("New Cars, Used Cars - Find Cars for Sale and Reviews at Autotrader")){
			System.out.println("User landed on the right page");
		}
		else{System.out.println("Wrong Page");


		}




	}	
}
