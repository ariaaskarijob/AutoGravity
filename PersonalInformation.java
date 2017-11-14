/* Test cases using POM method */

package AutoGravity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PersonalInformation{

	WebDriver driver;	

	by firstname=By.id("firstNameTextField");
	by lastname=By.id("lastNameTextField");
	by dateofbirth=By.id("dobTextField");
	by mobilenumber=By.id("mobilePhoneTextField");
	by emailaddress=By.id("emailTextField");
	by password=By.id("passwordTextField");
	by confirmpassword=By.id("confirmPasswordTextField");
	by createandcontinue=By.class("bottomSection___2yf5o");


	public PersonalInformation(WebDriver driver){
		this.driver=driver;
	}


	public void typeFirstName(){
		driver.findElement(firstname).sendKeys("Aria");
	}
	public void typeLastName(){
		driver.findElement(lastname).sendKeys("Askari");
	}
	public void typeDateOfBirth(){
		driver.findElement(dateofbirth).sendKeys("01/01/1988");
	}
	public void typeMobilePhone(){
		driver.findElement(mobilenumber).sendKeys("310-871-8857");
	}
	public void typeEmailAddress(){
		driver.findElement(emailaddress).sendKeys("aria.askari.job@gmail.com");
	}
	public void typePassword(){
		driver.findElement(password).sendKeys("!@3456Aa");
	}
	public void typeConfirmPassword(){
		driver.findElement(confirmpassword).sendKeys("!@3456Aa");
	}
	public void clickOnCreateContinue(){
		driver.findElement(createandcontinue).click();
	}
}
