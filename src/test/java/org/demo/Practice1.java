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

public class Practice1 {
	static WebDriver dr;
	
	@BeforeClass
	public static void bowserLaunch() {
		     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spark\\Documents\\prem java\\selenium\\dri\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.instagram.com/");
		dr.manage().window().maximize();
		
		}
	
	@Before
	
	public void logIn() {
		
		String title = dr.getTitle();
		boolean contains = title.contains("Instagram");
		Assert.assertEquals(true, contains);
		System.out.println("instagram");
		Date d = new Date();
		System.out.println(d);
		}
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(5000);
		dr.findElement(By.name("username")).sendKeys("santhosh");
		dr.findElement(By.name("password")).sendKeys("fsgdfg");
		dr.findElement(By.xpath("//div [text()='Log In']")).click();
		
	}
	
	@After
	public void afterLogIn() {
			String title = dr.getTitle();
			boolean contains = title.contains("Instagram");
			Assert.assertEquals(true, contains);
			System.out.println("next afterpage");
			Date d2 = new Date();
			System.out.println(d2);
	}
	
	@AfterClass
	public static void logOut() {
	//	dr.quit();
	}
	
	
	
	
	
	
	
}
