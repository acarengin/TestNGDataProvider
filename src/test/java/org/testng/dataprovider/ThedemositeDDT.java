package org.testng.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ThedemositeDDT {
	/**
	 * Create DataProvider thar creates Credentials Add multiple test credentials
	 * Create a test that accepts credentials from DataProvider Use Selenium to
	 * Navigate to http://thedemosite.co.uk/addauser.php And
	 */
	WebDriver driver;

	@BeforeTest
	public void openDemoSite() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\COMPUTER\\Documents\\Libraries\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("http://thedemosite.co.uk/addauser.php");
	}

	@Test(dataProvider = "Credentials")
	public void demoSiteCoUkDDT(String Username, String Password) {
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("FormsButton2")).click();

	}

	@DataProvider(name = "Credentials")
	public Object[][] EmployeesData() {
		Object[][] employees = new Object[3][2];
		employees[0][0] = "Mike";
		employees[0][1] = "mike123";

		employees[1][0] = "Steven";
		employees[1][1] = "steven123";

		employees[2][0] = "Sarah";
		employees[2][1] = "sarah123";

		return employees;
	}

}
