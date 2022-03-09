package com.bridgelabz;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot {

	@Test
	public void captureScreenshot() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.facebook.in/");
		driver.get("https://www.amazon.in/");
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(".\\screenshot\\" + System.currentTimeMillis() / 1000 + "_amazon.png");
		try {
			FileHandler.copy(sourceFile, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void screenShot() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./screenshot/" + System.currentTimeMillis() / 1000 +"_cricbuzz.png"));
		driver.quit();
	}

}