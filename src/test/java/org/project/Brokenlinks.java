package org.project;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int size = link.size();
		System.out.println(size);
		
		 // List<WebElement> img = driver.findElements(By.tagName("img")); int imgsize =
		  //img.size();
		  
		  //System.out.println(imgsize); 
		 int count=0; 
		 for(int i=0;i<size;i++) {
		  WebElement webElement = link.get(i); 
		  String attribute =webElement.getAttribute("href");
		  System.out.println(attribute);
		  //String attribute1 = webElement.getAttribute("src"); 
		  if(attribute!=null) { 
			  //to convert hrefreference into url 
		  URL url=new URL(attribute); 
		  URLConnection  openconnection=url.openConnection(); 
		  HttpsURLConnection connection = (HttpsURLConnection) openconnection; 
		  int responseCode = connection.getResponseCode();
		  if(responseCode!=200) { System.out.println("Brokenlinks:"+attribute);
		  
		 //count++; 
		 } }} 
	System.out.println("Broken links count:"+count);
		 
	}

}
