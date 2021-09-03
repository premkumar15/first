package org.maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
//browser initialization
	
	public static WebDriver driver;
		public void getDriver(String browser) {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\spark\\Documents\\prem java\\selenium\\dri\\chromedriver.exe");
			    ChromeDriver driver = new ChromeDriver();
				driver.manage().window().fullscreen();
			}else if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty(browser, "C:\\Users\\spark\\Documents\\prem java\\selenium\\dri\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
			}
			

		}
		
		public void driverLaunch() {
						
			WebDriverManager.chromedriver().setup();
			
		 driver=new ChromeDriver();
		}
		//url
		public void getUrl(String Url) {

			driver.get(Url);
			
                 
		}
		public WebElement locators(String loc,String data) {
			 WebElement element=null;
			 if(loc.equalsIgnoreCase("id")) {
				 element=driver.findElement(By.id(data));	 
			 } else if(loc.equalsIgnoreCase("xpath")){
				 element=driver.findElement(By.xpath(data));
				 
			 }else if(loc.equalsIgnoreCase("name")){
				 element=driver.findElement(By.name(data));
			 }
                 return element;
		}
public void max() {
				driver.manage().window().maximize();
		}
		
public void name(String username, String Password) {
			
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(Password);}
		
	public void click() {
						
				driver.findElement(By.name("login")).click();

					}
			public void close() {
              driver.close();
			}
			public void quit() {
             driver.quit();
			}
			
			
			public void movetoelements(WebElement element) {
				 Actions a=new Actions(driver);
				a.moveToElement(element).perform();
				
                     
			}
			public boolean multiple(WebElement element) {
				Select s=new Select(element);
				boolean multiple=s.isMultiple();
				return multiple;
			}
			
			public void dropDownbyIndex(WebElement element,String name) {
				Select s=new Select(element);
				s.selectByValue(name);
			}
			

			}


		


