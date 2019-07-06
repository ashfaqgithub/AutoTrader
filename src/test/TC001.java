package test;

import org.testng.annotations.Test;

import base.Config;
import locators.Locators;

public class TC001 extends Config{

	Locators ATL = new Locators();
	
	@Test
	public void SellMyCar(){
		clickByXpath(ATL.SellMyCar);
		
		
	}
	
	
}
