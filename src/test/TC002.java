package test;

import org.testng.annotations.Test;

import base.Config;
import locators.Locators;
import values.Values;

public class TC002 extends Config{

	Locators ATL = new Locators();
	Values ATV = new Values();
	
	@Test
	public void SignUp() throws InterruptedException{
		clickByXpath(ATL.SignInButton);
		clickByXpath(ATL.SignUpButton);
		Thread.sleep(2000);
		typeByXpath(ATL.SignUpEmail, ATV.SignUpEmail);
		Thread.sleep(2000);
		typeByXpath(ATL.SignUpPass, ATV.SignUpPass);
		Thread.sleep(2000);
		typeByXpath(ATL.SignUpPassConfirm, ATV.SignUpPassConfirm);
		Thread.sleep(2000);
		clickByXpath(ATL.CreateAccountButton);
			
		
		
		
		
		
	}
	
	
}
