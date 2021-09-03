package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adactinwithoutexcelwrite extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
	 
	Adactinwithoutexcelwrite a=new Adactinwithoutexcelwrite();
	driver();
	BaseClass.url("http://adactinhotelapp.com/");
	
	WebElement un = driver.findElement(By.id("username"));
	BaseClass.enterText(un, "premkumar15");
	
	WebElement pw = driver.findElement(By.id("password"));
    BaseClass.enterText(pw, "150194");
    String string = a.attribute(pw, "value");
	System.out.println(string);
	
	WebElement login = driver.findElement(By.id("login"));
	BaseClass.click(login);
	
	WebElement location = driver.findElement(By.id("location"));
	BaseClass.ddselectByVisibleText(location, "Adelaide");
	
	WebElement hotel = driver.findElement(By.id("hotels"));
	BaseClass.ddselectByVisibleText(hotel, "Hotel Hervey");
	
	WebElement room = driver.findElement(By.id("room_type"));
	BaseClass.ddselectByValue(room,"Standard");
	
	WebElement roomno = driver.findElement(By.id("room_nos"));
	BaseClass.ddselectByIndex(roomno, 2);
	
	WebElement no = driver.findElement(By.id("datepick_in"));
	BaseClass.clear(no);
	BaseClass.send(no, "22/08/2021");
	
	WebElement out = driver.findElement(By.id("datepick_out"));
	BaseClass.clear(out);
	BaseClass.send(out,"25/08/2021");
	
	WebElement adult = driver.findElement(By.id("adult_room"));
	BaseClass.ddselectByIndex(adult,2);
	
	WebElement child = driver.findElement(By.id("child_room"));
	BaseClass.ddselectByIndex(child,2);
	
	driver.findElement(By.id("Submit")).click();
	
	driver.findElement(By.id("radiobutton_0")).click();
	
	driver.findElement(By.id("continue")).click();
	
	WebElement first = driver.findElement(By.id("first_name"));
	first.sendKeys("prem");
	
	WebElement last = driver.findElement(By.id("last_name"));
	last.sendKeys("kumar");
	
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("d.no:12-13-4,sitaRAMNAGAR,B.C.ROAD,VISAKHAPATNAM-530026");
	
	WebElement credit = driver.findElement(By.id("cc_num"));
	credit.sendKeys("1234567891234567");
	
	
	WebElement visa = driver.findElement(By.id("cc_type"));
	BaseClass.ddselectByValue(visa,"VISA");
	
	WebElement mnth = driver.findElement(By.id("cc_exp_month"));
	BaseClass.ddselectByIndex(mnth, 12);
	
	WebElement year = driver.findElement(By.id("cc_exp_year"));
	BaseClass.ddselectByIndex(year,7);
	
	WebElement ccv = driver.findElement(By.id("cc_cvv"));
	BaseClass.send(ccv,"123");
	
	WebElement book = driver.findElement(By.id("book_now"));
	book.click();
	
	
	 String at = driver.findElement(By.id("order_no")).getAttribute("value");
	 Thread.sleep(3000);
	 System.out.println(at);
	 
	

	
	
	
	
	}

	public void launchBrowser() {
		
	}

	
	
}
