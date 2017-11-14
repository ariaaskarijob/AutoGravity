/* test cases from AG stage home-page all the way to SSN page, written in Java using Selenium */

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AutoGravityTest {

		/**
		 * @param args...
		 */
		public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		// 1 Test-case from home page to ssn 
		// Grabbing the website
		driver.get("https://www-staging.autogravity.com/");
		// Looking for the next key, and clicking it
		driver.findElement(By.class("btn btn-primary homeButtonMain___2nQs0")).click();
		// Looking for the the car I used in my example, and clicking next
		driver.findElement(By.xpath("//input[@alt='Mercedes-Benz for New Car Financing'])).click();
		driver.findElement(by.xpath("//input[@alt='AMG GT for Car Financing'])).click();
		driver.findElement(by.id("WDDYJ7KA7JA016213")).click();
		driver.findElement(by.class("btn btn-primary buttonNext___2w_Xa")).click();
		driver.findElement(by.class("newButton___3mgiP btn btn-primary")).click();
		// Filling out the Personal Information page using sendKeys method and continue
		driver.findElement(by.id("firstNameTextField")).sendKeys("Aria");
		driver.findElement(by.id("lastNameTextField")).sendKeys("Askari");
		driver.findElement(by.id("dobTextField")).sendKeys("01/01/1988");
		driver.findElement(by.id("mobilePhoneTextField")).sendKeys("310-871-8857");
		driver.findElement(by.id("emailTextField")).sendKeys("aria.askari.job@gmail.com");
		driver.findElement(by.id("passwordTextField")).sendKeys("!@3456Aa");
		driver.findElement(by.id("confirmPasswordTextField")).sendKeys("!@3456Aa");
		driver.findElement(by.class("bottomSection___2yf5o")).click();
		// Filling out the Residence Information page and continue to next page
		// For drop downs I used a new selector method, where one I used selectByVisibleText
		select sel0=new Select(driver.findElement(by.id("agselecthouseinfo")));
		sel0.selectByVisibleText("Rent");
		driver.findElement(by.id("aginputaddress")).sendKeys("15250 Spectrum");
		driver.findElement(by.id("aginputcity")).sendKeys("Irvine");
		select sel1=new Select(driver.findElement(by.id("agselectstate")));
		sel1.selectByVisibleText("California");
		driver.findElement(by.id("aginputzip")).sendKeys("92618");
		driver.findElement(by.id("aginputmoveindate")).sendKeys("06/2004");
		driver.findElement(by.id("aginputpayment")).sendKeys("$4000");
		driver.findElement(by.class("btn btn-primary")).click();
		// For this drop down I used selectByValue method and continue
		select sel2=new Select(driver.findElement(by.id("agselectemployment-status")));
		sel2.selectByValue("Full-Time");
		driver.findElement(by.id("employer-name")).sendKeys("Panasonic");
		driver.findElement(by.id("employee-title")).sendKeys("Test Engineer");
		driver.findElement(by.id("employee-start-date")).sendKeys("06/2014");
		driver.findElement(by.id("employer-phone-number")).sendKeys("310-871-8857");
		driver.findElement(by.id("gross-monthly-income")).sendKeys("$4000");
		driver.fineElement(by.class("btn btn-primary")).click();

		// driver.quit();


	}
}
