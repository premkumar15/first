package org.demo;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	static WebDriver driver;
	@BeforeClass
	public static void browserLauch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spark\\Documents\\prem java\\selenium\\dri\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();	
	}

	@Before
	public void verification() throws InterruptedException {
		String title = driver.getTitle();
		title.contains(title);
		boolean contains = title.contains("Adactin");
		Assert.assertTrue(contains);
		System.out.println("we are adactinhotel home page");
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void enterCredentials() {
		driver.findElement(By.id("username")).sendKeys("premkumar15");
		driver.findElement(By.id("password")).sendKeys("150194");
		driver.findElement(By.id("login")).click();
	}
	@After
	public void verificationafterLogin() {
		
		String title = driver.getTitle();
		boolean contains = title.contains("Adactin");
		Assert.assertEquals(true, contains);
		System.out.println("we are in loginpage");
		Date d1=new Date();
		System.out.println(d1);
		}	

	
@AfterClass
public static void closeBrowser() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
	
}

}
