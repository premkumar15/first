package org.maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actwithexcel extends BaseClass{
	WebDriver driver;
	public void login(String username,String password) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
        driver.get("http://adactinhotelapp.com/");
        driver.manage().window().maximize();
        WebElement un = driver.findElement(By.id("username"));
    	un.sendKeys(username);
        WebElement pw = driver.findElement(By.id("password"));
        pw.sendKeys(password);
        
    	WebElement login = driver.findElement(By.id("login"));
    	login.click();
    	
    	

	}
	public void searchHotel(String location,String hotel,String room,String room1,String checkin,String checkout,String adult,String child ) throws InterruptedException {
		WebElement w = driver.findElement(By.id("location"));
		Select s=new Select(w);
		s.selectByValue(location);
		Thread.sleep(3000);
		
		WebElement w1 = driver.findElement(By.id("hotels"));
		Select s0=new Select(w1);
		s0.selectByValue(hotel);

		WebElement w2 = driver.findElement(By.id("room_type"));
		Select s1=new Select(w2);
		s1.selectByValue(room);
		
		WebElement w3 = driver.findElement(By.id("room_nos"));
		Select s2=new Select(w3);
		s2.selectByValue(room1);

		WebElement w4 = driver.findElement(By.id("datepick_in"));
		w4.clear();
		
		WebElement w6 = driver.findElement(By.id("datepick_in"));
		w6.sendKeys(checkin);
	
		WebElement w7 = driver.findElement(By.id("datepick_out"));
		w7.clear();
		WebElement w8 = driver.findElement(By.id("datepick_out"));
		w8.sendKeys(checkin);
		
		WebElement w9 = driver.findElement(By.id("adult_room"));
		Select s3=new Select(w9);
		s3.selectByValue(adult);
		
		WebElement w10 = driver.findElement(By.id("child_room"));
		Select s4=new Select(w10);
		s4.selectByValue(child);
		
		Thread.sleep(1000);
		
		 driver.findElement(By.id("Submit")).click();
		 driver.findElement(By.id("radiobutton_0")).click();
		 driver.findElement(By.id("continue")).click();
		
}
	public void bookingLast(String firstname,String lastname,String bill,String cardtype,String size,String cardmonth,String cardyear,String cvv) {
		
		 WebElement w11 = driver.findElement(By.id("first_name"));
		 w11.sendKeys(firstname);
		 WebElement w12 = driver.findElement(By.id("last_name"));
		 w12.sendKeys(lastname);
		 
		 WebElement w13 = driver.findElement(By.id("address"));
		 w13.sendKeys(bill);
		 
		 WebElement w14 = driver.findElement(By.id("cc_type"));
		 Select s6=new Select(w14);
		 s6.selectByValue(cardtype);
		 
		 WebElement w15 = driver.findElement(By.id("cc_num"));
		 w15.sendKeys(size);
		
		 WebElement w16 = driver.findElement(By.id("cc_exp_month"));
		 Select s7=new Select(w16);
		 s7.selectByValue(cardmonth);
		
		 WebElement w18 = driver.findElement(By.id("cc_exp_year")); 
		 Select s8=new Select(w18);
		 s8.selectByValue(cardyear);
		 WebElement w19 = driver.findElement(By.id("cc_cvv"));
		 w19.sendKeys(cvv);
		 driver.findElement(By.id("book_now")).click();
		 
	}
	public void bookingConf() throws InterruptedException, IOException {
		BaseClass b=new BaseClass();
		Thread.sleep(7000);
		WebElement on = driver.findElement(By.id("order_no"));
		String attribute = on.getAttribute("value");
		System.out.println(attribute);
		b.booking(0, 18, attribute); 
	}
	}
