package testCases_registration;

import org.testng.annotations.Test;

import pageObjects_temnplate.HomePage_Objects_registration;
import testBase_registration.BaseClass_registration;

public class TC_001_HomePage_registration extends BaseClass_registration{
	
	@Test
	public void Registration_home_page() {
		
		//create a HomePage_Object_template instance to access all the methods 
		HomePage_Objects_registration HPT = new HomePage_Objects_registration(driver);
		
		HPT.clkMyAccount();
		HPT.clkRegister();
		
		HPT.EnterFirstName(randomeString());
		HPT.EnterLastName(randomeString());
		
		HPT.setEmail(randomeString() +"@gmail.com");
		HPT.EnterTelephone(p.getProperty("Telephone"));
		
		HPT.EnterPWD(p.getProperty("SetPWD"));
		
		HPT.ConfirmPWD(p.getProperty("SetPWD"));
		HPT.SubscribeBTN();
		
		HPT.newsLetterBtn();
		HPT.continueButton();
		
		//System.out.println("Titile of the WebPage : "+ driver.getTitle());
		// validate that account creted message is displayed
		String expectedTitle = "Your Account Has Been Created!";
		String ActualTitle = driver.getTitle();
		
		if(ActualTitle.equals(expectedTitle)) {
			System.out.println("Account is Created");
		}
		else {
			System.out.println("Actual Title :"+ ActualTitle);
			System.out.println("Expected Title : "+ expectedTitle);
			System.out.println("Title Mismatch");
		}
		
		
	}

}
