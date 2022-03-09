package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookTest {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// Click on create new account
		driver.findElement(By.linkText("Create New Account")).click();
		// Enter firstName on input field
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Kalyan");
		// Enter lastName on input field
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("tanniru");
		// Enter Email on input field
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("tannirukalyan1432@gmail.com");
		// Re-Enter Email on input field
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tannirukalyan1432@gmail.com");
		// Enter Password on input field
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc@1234");
		// Select Day,Month,Year on drop down
		Thread.sleep(2000);
		Select selectDay = new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("19");
		Thread.sleep(2000);
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Jul");
		Thread.sleep(2000);
		Select selectYear = new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("1997");
		// Select Male or Female
		Thread.sleep(2000);
		driver.findElements(By.name("sex")).get(1).click();
		// Click on sign up
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
