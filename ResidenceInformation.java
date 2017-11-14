/* Test cases using POM method */
  
package AutoGravity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ResidenceInformation{

		WebDriver driver;
		
		by ResidenceStatus=By.id("agselecthouseinfo");
		by address=By.id("aginputaddress");
		by city=By.id("aginputcity");
		by state=By.id("agselectstate");
		by ZipCode=By.id("aginputzip");
		by MoveInDate=By.id("aginputmoveindate");
		by payment=By.id("aginputpayment");
		by NextPage=By.class("btn btn-primary");
	

		public ResidencelInformation(WebDriver driver){
		this.driver=driver;
		}
		

		public void selectResidenceStatus(){
			driver.findElement(ResidenceStatus).selectByVisibleText("Rent");
		}
		public void typeAddress(){
			driver.findElement(address).sendKeys("15250 Spectrum");
		}
		public void typeCity(){
			driver.findElement(city).sendKeys("Irvine");
		}
		public void selectState(){
			driver.findElement(state).selectByVisibleText("California");
		}
		public void typeZip(){
			driver.findElement(ZipCode).sendKeys("92618");
		}
		public void typeMoveInDate(){
			driver.findElement(MoveInDate).sendKeys("06/2004");
		}
		public void typePayment(){
			driver.findElement(payment).sendKeys("$4000");
		}
		public void clickOnNext(){
			driver.findElement(NextPage).click();
		}

	
}
