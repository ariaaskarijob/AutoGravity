/* Test cases using POM method */
  
package AutoGravity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class EmployeeInformation{

        WebDriver driver;

	by employmentstatus=By.id("agselectemployment-status");
	by name=By.id("employer-name");
	by title=By.id("employee-title");
	by start=By.id("employee-start-date");
	by phone=By.id("employer-phone-numbe");
	by income=By.id("gross-monthly-income");
	by next=By.id("btn btn-primary");


	public EmployeeInformation(WebDriver driver){
	this.driver=driver;
        }	


	public void selectEmploymentStatus(){
		driver.findElement(employmentstatus).selectByValue("Full-Time");
	}
	public void typeEmployeeName(){
		driver.findElement(name).sendKeys("Panasonic");
	}
	public void typeEmployeeTitle(){
		driver.findElement(title).sendKeys("Test Engineer");
	}
	public void typeStartDate(){
		driver.findElement(start).sendKeys("06/2014");
	}
	public void typePhoneNumber(){
		driver.findElement(phone).sendKeys("310-871-8857");
	}
	public void typeIncomeSalary(){
		driver.findElement(income).sendKeys("$4000");
	}
	public void selectNext(){
		driver.findElement(next).click();
	}
}
