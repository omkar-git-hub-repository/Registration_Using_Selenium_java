package pageObjects_temnplate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_Objects_registration extends BasePageObject_registration {

	public HomePage_Objects_registration(WebDriver driver) {
		super(driver);
		
	}
	
	// write all methods from here
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement clickMyAccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement clickRegistration;
	
	

	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement PWD;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement PWD1;
	
	@FindBy(xpath="//label[normalize-space()='Yes']")
	WebElement subScribeBtn;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement NWSLetter;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement ContinueBtn;
	
	
	public void clkMyAccount() {
		clickMyAccount.click();
	}
	
	public void clkRegister() {
		clickRegistration.click();
	}
	
	
	public void EnterFirstName(String FName){
		FirstName.sendKeys(FName);
	}
	
	public void EnterLastName(String Lname) {
		lastName.sendKeys(Lname);
	}
	
	public void setEmail(String setemail) {
		Email.sendKeys(setemail);
	}
	
	public void EnterTelephone(String  number) {
		telephone.sendKeys(number);
	}
	
	public void EnterPWD(String SetPWD) {
		PWD.sendKeys(SetPWD);
	}
	
	public void ConfirmPWD(String SetPWD) {
		PWD1.sendKeys(SetPWD);
	}
	
	public void SubscribeBTN() {
		subScribeBtn.click();
	}
	
	public void newsLetterBtn(){
		NWSLetter.click();
	}
	
	public void continueButton() {
		ContinueBtn.click();
	}
	
	
	
	
	// Write all action classes (void methods)
	
	//public void clickSearchBar()
	//{
	//	searchBar.click();
	//}

}
